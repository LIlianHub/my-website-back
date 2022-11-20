/*Lecture fichier*/
const fs = require('fs');

/*globale*/
var rep_accueil = './data_accueil/';


function RecupAllDesc() {
    const fichiers = fs.readdirSync(rep_accueil);
    var tab_texte = [];
    fichiers.forEach(fichier => {
      const contenu = fs.readFileSync(rep_accueil + fichier, 'utf8');
      let format = contenu.split('\n');
      tab_texte.push(
        {"contenu": format.join('')}
      );
    });
    return tab_texte;
}

module.exports = { RecupAllDesc };


