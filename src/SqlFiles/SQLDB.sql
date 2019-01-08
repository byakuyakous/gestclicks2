-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 06 jan. 2019 à 09:29
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestclickdb`
--

-- --------------------------------------------------------

--
-- Structure de la table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE IF NOT EXISTS `administrateur` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `SEXE` varchar(10) DEFAULT NULL,
  `TELEPHONE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `allergie`
--

DROP TABLE IF EXISTS `allergie`;
CREATE TABLE IF NOT EXISTS `allergie` (
  `ID_ALLERGIE` varchar(20) NOT NULL,
  `TYPE` varchar(20) DEFAULT NULL,
  `DEGRE` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_ALLERGIE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `antecedant`
--

DROP TABLE IF EXISTS `antecedant`;
CREATE TABLE IF NOT EXISTS `antecedant` (
  `ID_ANTECEDANT` varchar(20) NOT NULL,
  `DESIGNATION` varchar(20) DEFAULT NULL,
  `DESCRIPTION` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_ANTECEDANT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `avoir_allergie`
--

DROP TABLE IF EXISTS `avoir_allergie`;
CREATE TABLE IF NOT EXISTS `avoir_allergie` (
  `ID_PATIENT` varchar(20) NOT NULL,
  `ID_ALLERGIE` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_PATIENT`,`ID_ALLERGIE`),
  KEY `AVOIR_ALLERGIE2_FK` (`ID_PATIENT`),
  KEY `AVOIR_ALLERGIE_FK` (`ID_ALLERGIE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `avoir_antecedant`
--

DROP TABLE IF EXISTS `avoir_antecedant`;
CREATE TABLE IF NOT EXISTS `avoir_antecedant` (
  `ID_PATIENT` varchar(20) NOT NULL,
  `ID_ANTECEDANT` varchar(20) NOT NULL,
  PRIMARY KEY (`ID_PATIENT`,`ID_ANTECEDANT`),
  KEY `AVOIR_ANTECEDANT2_FK` (`ID_PATIENT`),
  KEY `AVOIR_ANTECEDANT_FK` (`ID_ANTECEDANT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `LOGIN` varchar(20) NOT NULL,
  `ID_ADMIN` varchar(20) NOT NULL,
  `MDP` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`LOGIN`),
  KEY `CREER_COMPTE_FK` (`ID_ADMIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `dentiste`
--

DROP TABLE IF EXISTS `dentiste`;
CREATE TABLE IF NOT EXISTS `dentiste` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `SEXE` varchar(10) DEFAULT NULL,
  `TELEPHONE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `donner_ord`
--

DROP TABLE IF EXISTS `donner_ord`;
CREATE TABLE IF NOT EXISTS `donner_ord` (
  `ID_DENTISTE` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `DATE_ORD` date DEFAULT NULL,
  `DESCRITION` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`ID_DENTISTE`,`ID_PATIENT`),
  KEY `DONNER_ORD2_FK` (`ID_PATIENT`),
  KEY `DONNER_ORD_FK` (`ID_DENTISTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `employe`
--

DROP TABLE IF EXISTS `employe`;
CREATE TABLE IF NOT EXISTS `employe` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `SEXE` varchar(10) DEFAULT NULL,
  `TELEPHONE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`),
  KEY `AUTHENTIFICATION_FK` (`LOGIN`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `operer`
--

DROP TABLE IF EXISTS `operer`;
CREATE TABLE IF NOT EXISTS `operer` (
  `ID_DENTISTE` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `TYPE_OP` varchar(20) DEFAULT NULL,
  `DATEOPERATION` date DEFAULT NULL,
  `REMARQUE` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID_DENTISTE`,`ID_PATIENT`),
  KEY `OPERER2_FK` (`ID_PATIENT`),
  KEY `OPERER_FK` (`ID_DENTISTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

DROP TABLE IF EXISTS `patient`;
CREATE TABLE IF NOT EXISTS `patient` (
  `ID_PATIENT` varchar(20) NOT NULL,
  `ID_RECEPTIONNISTE` varchar(20) NOT NULL,
  `ID_DENTISTE` varchar(20) NOT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `SEXE` varchar(10) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `DATE_CREATION` date DEFAULT NULL,
  `TELEPHONE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `TYPE_DE_SANG` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID_PATIENT`),
  KEY `CREER_DOSSIER_FK` (`ID_RECEPTIONNISTE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `receptionniste`
--

DROP TABLE IF EXISTS `receptionniste`;
CREATE TABLE IF NOT EXISTS `receptionniste` (
  `ID_EMPLOYE` varchar(20) NOT NULL,
  `LOGIN` varchar(20) NOT NULL,
  `CIN` varchar(20) DEFAULT NULL,
  `NOM` varchar(20) DEFAULT NULL,
  `PRENOM` varchar(20) DEFAULT NULL,
  `SEXE` varchar(10) DEFAULT NULL,
  `TELEPHONE` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `DATE_NAISSANCE` date DEFAULT NULL,
  `DATE__D_EMBAUCHE` date DEFAULT NULL,
  PRIMARY KEY (`ID_EMPLOYE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `rendez_vous`
--

DROP TABLE IF EXISTS `rendez_vous`;
CREATE TABLE IF NOT EXISTS `rendez_vous` (
  `IDRECEPTIONNISTE` varchar(20) NOT NULL,
  `ID_PATIENT` varchar(20) NOT NULL,
  `DATERV` date DEFAULT NULL,
  `HEURE` time DEFAULT NULL,
  PRIMARY KEY (`IDRECEPTIONNISTE`,`ID_PATIENT`),
  KEY `FK_RENDEZ_VOUS3` (`ID_PATIENT`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `administrateur`
--
ALTER TABLE `administrateur`
  ADD CONSTRAINT `FK_HERITAGE_3` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_AUTHENTIFICATION_A` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`);

--
-- Contraintes pour la table `avoir_allergie`
--
ALTER TABLE `avoir_allergie`
  ADD CONSTRAINT `FK_AVOIR_ALLERGIE` FOREIGN KEY (`ID_ALLERGIE`) REFERENCES `allergie` (`ID_ALLERGIE`),
  ADD CONSTRAINT `FK_AVOIR_ALLERGIE2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `avoir_antecedant`
--
ALTER TABLE `avoir_antecedant`
  ADD CONSTRAINT `FK_AVOIR_ANTECEDANT` FOREIGN KEY (`ID_ANTECEDANT`) REFERENCES `antecedant` (`ID_ANTECEDANT`),
  ADD CONSTRAINT `FK_AVOIR_ANTECEDANT2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `FK_CREER_COMPTE` FOREIGN KEY (`ID_ADMIN`) REFERENCES `administrateur` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `dentiste`
--
ALTER TABLE `dentiste`
  ADD CONSTRAINT `FK_HERITAGE_2` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_AUTHENTIFICATION_D` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`);

--
-- Contraintes pour la table `donner_ord`
--
ALTER TABLE `donner_ord`
  ADD CONSTRAINT `FK_DONNER_ORD` FOREIGN KEY (`ID_DENTISTE`) REFERENCES `dentiste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_DONNER_ORD2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `employe`
--
ALTER TABLE `employe`
  ADD CONSTRAINT `FK_AUTHENTIFICATION` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`);

--
-- Contraintes pour la table `operer`
--
ALTER TABLE `operer`
  ADD CONSTRAINT `FK_OPERER` FOREIGN KEY (`ID_DENTISTE`) REFERENCES `dentiste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_OPERER2` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);

--
-- Contraintes pour la table `patient`
--
ALTER TABLE `patient`
  ADD CONSTRAINT `FK_CREER_DOSSIER` FOREIGN KEY (`ID_RECEPTIONNISTE`) REFERENCES `receptionniste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_DENTISTE` FOREIGN KEY (`ID_DENTISTE`) REFERENCES `dentiste` (`ID_EMPLOYE`);

--
-- Contraintes pour la table `receptionniste`
--
ALTER TABLE `receptionniste`
  ADD CONSTRAINT `FK_HERITAGE_1` FOREIGN KEY (`ID_EMPLOYE`) REFERENCES `employe` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_AUTHENTIFICATION_R` FOREIGN KEY (`LOGIN`) REFERENCES `compte` (`LOGIN`);

--
-- Contraintes pour la table `rendez_vous`
--
ALTER TABLE `rendez_vous`
  ADD CONSTRAINT `FK_RENDEZ_VOUS2` FOREIGN KEY (`IDRECEPTIONNISTE`) REFERENCES `receptionniste` (`ID_EMPLOYE`),
  ADD CONSTRAINT `FK_RENDEZ_VOUS3` FOREIGN KEY (`ID_PATIENT`) REFERENCES `patient` (`ID_PATIENT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
