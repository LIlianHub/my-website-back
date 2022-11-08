const nodemailer = require("nodemailer");
const fs = require("fs");

function recup_login() {
  try {
    let data = fs.readFileSync("./login_mail", "utf8");
    let logins = data.split("\n");
    return logins;
  } catch (error) {
    return null;
  }
}

async function EnvoieMail(email_env, message_env, sujet_env) {
  return new Promise((resolve, reject) => {
    let a_envoyer =
      "De " +
      email_env +
      " :\n\n" +
      message_env +
      "\n\nMail automatique, ne pas répondre.";
    let logins = recup_login();

    if (logins) {
      var transporter = nodemailer.createTransport({
        host: "ssl0.ovh.net",
        name: "ballejos-lilian.fr",
        port: 465,
        secure: true,
        auth: {
          user: logins[0],
          pass: logins[1],
        },
      });

      var mailOptions = {
        from: "BotMail <assistance@ballejos-lilian.fr>",
        to: "lilian.ballejos@hotmail.fr",
        subject: sujet_env,
        text: a_envoyer,
      };

      transporter.sendMail(mailOptions, function (error, info) {
        if (error) {
          reject("error");
        } else {
          //console.log("Email sent: " + info.response);
          resolve("success");
        }
      });
    } else {
      reject("error");
    }
  });
}

module.exports = { EnvoieMail };
