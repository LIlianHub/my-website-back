CREATE TABLE IF NOT EXISTS `HOME_DATAS`
(
    `ID` INT NOT NULL AUTO_INCREMENT, `TARGET_FILE` VARCHAR (32) NOT NULL
);

CREATE TABLE IF NOT EXISTS `PROJECTS`
(
    `ID` INT NOT NULL AUTO_INCREMENT, `ID_STR` VARCHAR (32) NOT NULL,
    `IMG` VARCHAR(256) NOT NULL,
    `TITRE` VARCHAR(128) NOT NULL
);

INSERT INTO HOME_DATAS (`TARGET_FILE`)
VALUES ('1.html');

INSERT INTO PROJECTS (`ID_STR`, `IMG`, `TITRE`)
VALUES ('monSiteWeb', 'https://assets.turbologo.com/blog/fr/2021/09/23100401/place-logo-on-website.png',
        'Mon Site Web');

INSERT INTO PROJECTS (`ID_STR`, `IMG`, `TITRE`)
VALUES ('projetQlearning',
        'https://www.simplilearn.com/ice9/free_resources_article_thumb/Advantages_and_Disadvantages_of_artificial_intelligence.jpg',
        'Projet Qlearning');