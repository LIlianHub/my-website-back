/*MOdule*/
const express = require("express");

/*Mes Gestions*/
const gestion_accueil = require("./gestion_accueil");
const gestion_projet = require("./gestion_projet");
const gestion_mail = require("./gestion_mail");

/*creation app express*/
const listen = express();

/*fichier public*/
listen.use(express.static("public"));

/*Lire contenu json des requetes recu*/
listen.use(express.urlencoded({ extended: true }));
listen.use(express.json());

//requete externe
var cors = require("cors");
listen.use(cors(/*corsOptions*/));

/*Requete accueil*/
listen.get("/recup-data-accueil", function (req, res) {
  let data = gestion_accueil.RecupAllDesc();
  res.status(200).send(data);
});

/*Requete projet*/
listen.get("/recup-data-projet", function (req, res) {
  let data = gestion_projet.recup_all_projet_info();
  res.status(200).send(data);
});

listen.get("/recup-data-projet-id/:type", function (req, res) {
  if (req.params.type && gestion_projet.projectValide(req.params.type)) {
    let monProjet = gestion_projet.recup_projet(req.params.type);
    res.status(200).send(monProjet);
  } else {
    res.status(400).send("Erreur");
  }
});

/*Requete mail*/
listen.post("/send-mail", async (req, res) => {
  try {
    await gestion_mail.EnvoieMail(
      req.body.Email,
      req.body.Comment,
      req.body.Sujet
    );
    res.status(200).json({
      message: "ok",
    });
  } catch (err) {
    res.status(400).json({
      message: "error",
    });
  }
});

/*gestion autres requetes*/
listen.use(function (req, res, next) {
  res.status(404).send("Nothing Here");
});

listen;

module.exports = listen;
