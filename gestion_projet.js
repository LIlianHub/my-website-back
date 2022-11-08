/*Lecture fichier*/
const fs = require("fs");

/*globale*/
var dir_projet = "./data_projet/";

function recup_all_projet() {
  const fichiers = fs.readdirSync(dir_projet);
  return fichiers;
}

function format_projet(fichier) {
  let id;
  let img;
  let titre;
  let contenu;
  let data = fichier.split("\n");
  id = data[0];
  img = data[1];
  titre = data[2];
  data.shift();
  data.shift();
  data.shift();
  contenu = data.join("");
  return {
    id: id,
    img: img,
    titre: titre,
    contenu: contenu,
  };
}

function projectValide(id) {
  return fs.existsSync(dir_projet + id);
}

function recup_projet(id) {
  let fichier = fs.readFileSync(dir_projet + id, "utf8");
  return format_projet(fichier);
}

function recup_all_projet_info() {
  const fichiers = recup_all_projet();
  let info_index = new Array();
  for (let fichier of fichiers) {
    let contenu = fs.readFileSync(dir_projet + fichier, "utf8");
    info_index.push(format_projet(contenu));
  }
  return info_index;
}

module.exports = { recup_all_projet_info, projectValide, recup_projet };
