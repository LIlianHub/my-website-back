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
VALUES ('<h1>Bienvenue sur mon site web !</h1>

<h2>Présentation</h2>
<hr>

<div class="boite-img-txt">
	<div class="sous-boite-img-txt-img">
	        <img src="assets/img/moi-accueil.png" alt="photo de moi">
	</div>
	<div class="sous-boite-img-txt-txt">
	<p>
	Je m''appelle BALLEJOS Lilian et je suis étudiant en troisième année d''école d''ingénieurs en informatique à l''<a href="https://www.isima.fr/" target="new">ISIMA INP</a>. Passionné par l''informatique depuis mon plus jeune âge, je compte travailler dans ce domaine à l''avenir. Si mon parcours vous intéresse, vous pouvez trouver mon CV en suivant ce <a href="https://ballejos-lilian.fr/assets/cv/fr.pdf" target="new">lien</a>.
	</p>
	</div>
</div>

<h2>Spécialité</h2>
<hr>

<p>
Je suis en filière "<B>Génie Logiciel et systèmes informatiques</B>" de mon école. J''ai développé durant mes études grâce à des projets personnels, académiques et en entreprise de nombreuses connaissances en développement logiciel. J''explore un large éventail de langages et de frameworks afin de couvrir un large spectre de compétences très utiles en développement full stack et logiciel. Pour en savoir plus, vous pouvez consulter mon CV disponible dans l''onglet <a routerlink="/cv/fr">CV</a>.

</p>

<h2>Me contacter</h2>
<hr>

<p>
Si vous avez des idées de projet que vous souhaitez me proposer, vous pouvez me contacter via la page <a routerlink="/cv/fr">Me contacter</a>.
</p>');

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