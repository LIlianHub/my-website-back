CREATE TABLE IF NOT EXISTS `HOME_DATAS`
(
    `ID`
    INT
    NOT
    NULL
    AUTO_INCREMENT,
    `CONTENU`
    VARCHAR
(
    8192
) NOT NULL
    );

CREATE TABLE IF NOT EXISTS `PROJECTS`
(
    `ID`
    INT
    NOT
    NULL
    AUTO_INCREMENT,
    `CONTENU`
    VARCHAR
(
    8192
) NOT NULL,
    `ID_STR` VARCHAR
(
    32
) NOT NULL,
    `IMG` VARCHAR
(
    256
) NOT NULL,
    `TITRE` VARCHAR
(
    128
) NOT NULL
    );

INSERT INTO `HOME_DATAS` (`CONTENU`)
VALUES ('<h1>Bienvenue sur mon site Web</h1>
<h2>Qui suis-je ? ?</h2>
<hr>
<div class="boite-img-txt">
    <div class="sous-boite-img-txt-img">
        <img src="assets/img/moi-acceuil.png" alt="photo de moi">
    </div>
    <div class="sous-boite-img-txt-txt">
        <p>
            Je m''appelle BALLEJOS Lilian et je suis étudiant en seconde année d''école d''Ingénieurs informatique à <a
                href="https://www.isima.fr/" target="new">ISIMA INP</a>.Passionné par l''informatique depuis tout jeune,
            je compte travailler dans ce domaine dans le futur.
            Si mon parcours vous intéresse, vous pouvez trouver mon cv sur ce <a
                href="https://ballejos-lilian.fr:3000/cv/fr.pdf" target="new">lien</a>.
        </p>

    </div>
</div>
<h2>Ma spécialité</h2>
<hr>
<p>J''ai choisis de me spécialiser dans le Génie Logiciel cette année</p>
<h2>Stage</h2>
<hr>
<p>Je recherche activement un stage d''une durée de 5 mois</p>');

INSERT INTO `HOME_DATAS` (`CONTENU`)
VALUES ('<h2>Le Site Web</h2>
                                                      <hr>
                                                      <p>Ce site web est developpé durant mon temps libre et est donc voué à évoluer dans le temps</p>
                                                      <h2>Travaux en cours</h2>
                                                      <hr>
                                                      <p>Je suis dans une période où je modifie beaucoup ce site certaines fonctionnalités sont possiblement incomplètes voir non fonctionnelles</p>');

INSERT INTO PROJECTS (`CONTENU`, `ID_STR`, `IMG`, `TITRE`)
VALUES ('<div class="contenu">

    <h2>Présentation du projet</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Language utilisé</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Explication</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Le code</h2>
    <hr>
    <p>
        Soon
    </p>
    <p>
        Soon
    </p>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Infos complémentaires</h2>
    <hr>
    <p>
        Soon
    </p>
</div>', 'monSiteWeb', 'https://assets.turbologo.com/blog/fr/2021/09/23100401/place-logo-on-website.png',
        'Mon Site Web');

INSERT INTO PROJECTS (`CONTENU`, `ID_STR`, `IMG`, `TITRE`)
VALUES ('<div class="contenu">
    <h2>Présentation du projet</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Language utilisé</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Explication</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Le code</h2>
    <hr>
    <p>
        Soon
    </p>
</div>

<div class="contenu">

    <h2>Infos complémentaires</h2>
    <hr>
    <p>
        Soon
    </p>
</div>', 'projetQlearning',
        'https://www.simplilearn.com/ice9/free_resources_article_thumb/Advantages_and_Disadvantages_of_artificial_intelligence.jpg',
        'Projet Qlearning');