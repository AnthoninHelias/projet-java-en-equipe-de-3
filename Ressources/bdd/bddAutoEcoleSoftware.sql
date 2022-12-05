-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : db:3306
-- Généré le : ven. 25 nov. 2022 à 07:36
-- Version du serveur : 5.7.39
-- Version de PHP : 8.0.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `BddAutoEcoleSoftware`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

CREATE TABLE `categorie` (
  `CodeCategorie` int(11) NOT NULL,
  `Libelle` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `Prix` double(5,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`CodeCategorie`, `Libelle`, `Prix`) VALUES
(1, 'Automobile', 34.95),
(2, 'Poids lourd', 43.00),
(3, 'Bateau', 51.25),
(4, 'Moto', 38.15),
(5, 'Transport en commun', 40.50);

-- --------------------------------------------------------

--
-- Structure de la table `lecon`
--

CREATE TABLE `lecon` (
  `CodeLecon` int(11) NOT NULL,
  `Date` date DEFAULT NULL,
  `Heure` varchar(50) DEFAULT NULL,
  `Immatriculation` varchar(50) DEFAULT NULL,
  `Reglee` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `lecon`
--

INSERT INTO `lecon` (`CodeLecon`, `Date`, `Heure`, `Immatriculation`, `Reglee`) VALUES
(8, '2016-08-23', '10:00:00', '123 AB 21', 1),
(9, '2016-07-23', '10:00:00', '234 BC 21', 1),
(10, '2015-12-24', '10:00:00', '234 BC 21', 1),
(11, '2016-06-07', '10:00:00', '234 BC 21', 1),
(16, '2016-09-05', '10:00:00', '789 GH 21', 1),
(17, '2016-04-03', '10:00:00', '789 GH 21', 1),
(18, '2016-03-31', '10:00:00', '789 GH 21', 1),
(19, '2016-07-16', '10:00:00', '789 GH 21', 1),
(20, '2016-07-12', '10:00:00', '789 GH 21', 1),
(21, '2016-08-28', '10:00:00', '234 BC 21', 1),
(22, '2015-12-29', '10:00:00', '234 BC 21', 1),
(23, '2016-01-02', '10:00:00', '234 BC 21', 1),
(24, '2016-09-22', '10:00:00', '456 DE 21', 1),
(25, '2016-01-30', '10:00:00', '345 CD 21', 1),
(26, '2016-04-09', '10:00:00', '234 BC 21', 1),
(27, '2016-08-01', '10:00:00', '234 BC 21', 1),
(28, '2016-02-14', '10:00:00', '234 BC 21', 1),
(29, '2016-01-16', '10:00:00', '234 BC 21', 1),
(30, '2016-01-12', '10:00:00', '234 BC 21', 1),
(31, '2016-08-09', '10:00:00', '234 BC 21', 1),
(32, '2016-04-02', '10:00:00', '234 BC 21', 1),
(33, '2016-08-25', '10:00:00', '234 BC 21', 1),
(34, '2016-02-06', '10:00:00', '234 BC 21', 1),
(35, '2016-03-29', '10:00:00', '234 BC 21', 1),
(36, '2015-12-25', '10:00:00', '234 BC 21', 1),
(37, '2016-02-06', '10:00:00', '234 BC 21', 1),
(38, '2016-08-16', '10:00:00', '234 BC 21', 1),
(39, '2016-05-20', '10:00:00', '345 CD 21', 1),
(40, '2016-08-08', '10:00:00', '456 DE 21', 1),
(41, '2016-07-06', '10:00:00', '456 DE 21', 1),
(42, '2016-02-01', '10:00:00', '567 EF 21', 1),
(43, '2015-12-09', '10:00:00', '234 BC 21', 1),
(44, '2016-07-13', '10:00:00', '456 DE 21', 1),
(45, '2016-04-30', '10:00:00', '456 DE 21', 1),
(46, '2015-12-22', '10:00:00', '456 DE 21', 1),
(47, '2016-08-23', '10:00:00', '456 DE 21', 1),
(48, '2016-06-05', '10:00:00', '456 DE 21', 1),
(49, '2016-05-02', '10:00:00', '234 BC 21', 1),
(50, '2016-08-27', '10:00:00', '234 BC 21', 1),
(51, '2016-01-21', '10:00:00', '345 CD 21', 1),
(52, '2016-01-09', '10:00:00', '345 CD 21', 1),
(53, '2016-04-20', '10:00:00', '789 GH 21', 1),
(54, '2016-01-24', '10:00:00', '789 GH 21', 1),
(56, '2016-06-10', '10:00:00', '567 EF 21', 1),
(57, '2016-07-11', '10:00:00', '567 EF 21', 1),
(58, '2016-09-08', '10:00:00', '890 HJ 21', 1),
(59, '2016-08-07', '10:00:00', '890 HJ 21', 1),
(60, '2016-02-09', '10:00:00', '456 DE 21', 1),
(61, '2016-06-07', '10:00:00', '234 BC 21', 1),
(62, '2016-01-14', '10:00:00', '678 FG 21', 1),
(63, '2016-08-10', '10:00:00', '678 FG 21', 1),
(64, '2016-07-29', '10:00:00', '678 FG 21', 1),
(65, '2016-06-24', '10:00:00', '678 FG 21', 1),
(66, '2016-04-12', '10:00:00', '678 FG 21', 1),
(67, '2016-08-10', '10:00:00', '123 AB 21', 1),
(68, '2016-03-25', '10:00:00', '234 BC 21', 1),
(69, '2016-07-14', '10:00:00', '345 CD 21', 1),
(73, '2016-03-27', '10:00:00', '123 AB 21', 1),
(74, '2016-02-19', '10:00:00', '123 AB 21', 1),
(75, '2016-07-29', '10:00:00', '123 AB 21', 1),
(76, '2016-02-01', '10:00:00', '234 BC 21', 1),
(77, '2016-03-10', '10:00:00', '345 CD 21', 1),
(79, '2016-01-19', '10:00:00', '234 BC 21', 1),
(80, '2016-07-04', '10:00:00', '345 CD 21', 1),
(81, '2016-04-03', '10:00:00', '123 AB 21', 1),
(85, '2016-01-11', '10:00:00', '234 BC 21', 1),
(86, '2016-04-29', '10:00:00', '345 CD 21', 1),
(87, '2016-07-06', '10:00:00', '123 AB 21', 1),
(88, '2016-06-16', '10:00:00', '234 BC 21', 1),
(89, '2016-02-02', '10:00:00', '345 CD 21', 1),
(90, '2016-08-23', '10:00:00', '789 GH 21', 0),
(91, '2016-08-22', '10:00:00', '567 EF 21', 0),
(92, '2017-09-02', '13:56:00', '456 DE 21', 0),
(93, '2017-09-02', '13:58:00', '345 CD 21', 0),
(94, '2017-09-02', '14:00:00', '345 CD 21', 0),
(95, '2017-09-02', '14:09:00', '678 FG 21', 0),
(96, '2017-09-02', '15:00:00', '678 FG 21', 0),
(97, '2017-09-02', '14:13:00', '234 BC 21', 0),
(98, '2017-11-17', '09:15:00', '890 HJ 21', 0),
(99, '2017-08-23', '10:00:00', '567 EF 21', 0),
(100, '2017-09-02', '14:19:00', '567 EF 21', 0),
(101, '2017-09-02', '14:20:00', '345 CD 21', 0),
(102, '2017-09-02', '14:23:00', '456 DE 21', 0),
(103, '2017-09-02', '14:26:00', '456 DE 21', 0),
(104, '2017-09-02', '14:28:00', '345 CD 21', 0),
(105, '2017-09-02', '14:29:00', '456 DE 21', 0),
(106, '2017-09-02', '14:30:00', '345 CD 21', 0),
(107, '2017-09-02', '14:36:00', '234 BC 21', 0),
(108, '2017-09-02', '14:40:00', '234 BC 21', 0),
(109, '2017-09-05', '14:43:00', '456 DE 21', 0),
(110, '2017-09-02', '08:46:00', '345 CD 21', 0),
(111, '2017-09-05', '11:47:00', '345 CD 21', 0),
(112, '2017-09-02', '15:03:00', '456 DE 21', 0),
(113, '2017-09-29', '18:07:00', '234 BC 21', 0),
(114, '2017-11-14', '02:10:00', '789 GH 21', 0),
(115, '2017-09-02', '18:16:00', '345 CD 21', 0),
(116, '2017-09-02', '13:17:00', '345 CD 21', 0),
(117, '2017-11-02', '13:26:00', '345 CD 21', 0),
(118, '2015-11-11', '02:09:00', '789 GH 21', 0),
(119, '2020-09-09', '18:28:00', '456 DE 21', 0),
(120, '2017-09-22', '08:00:00', '567 EF 21', 0),
(121, '2017-09-22', '16:48:00', '345 CD 21', 0),
(122, '2017-09-22', '02:00:00', '567 EF 21', 0),
(123, '2017-09-27', '08:00:00', '678 FG 21', 0),
(124, '2018-08-17', '09:02:00', '456 DE 21', 0),
(125, '2020-06-24', '11:00:00', '789 GH 21', 0),
(126, '2020-12-16', '14:00:00', '345 CD 21', 0),
(127, '2020-12-16', '14:00:00', '678 FG 21', 0),
(128, '2020-12-16', '15:00:00', '567 EF 21', 0);

-- --------------------------------------------------------

--
-- Structure de la table `licence`
--

CREATE TABLE `licence` (
  `CodeLicence` int(11) NOT NULL,
  `CodeUser` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL,
  `DateObtention` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `licence`
--

INSERT INTO `licence` (`CodeLicence`, `CodeUser`, `CodeCategorie`, `DateObtention`) VALUES
(1, 4, 1, '2022-01-23'),
(2, 2, 5, '2021-02-24'),
(3, 2, 1, '2020-01-05'),
(4, 4, 5, '2019-04-14'),
(5, 2, 3, '2018-06-23');

-- --------------------------------------------------------

--
-- Structure de la table `participe`
--

CREATE TABLE `participe` (
  `CodeLecon` int(11) NOT NULL,
  `CodeUser` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `participe`
--

INSERT INTO `participe` (`CodeLecon`, `CodeUser`) VALUES
(8, 3),
(9, 2),
(10, 2),
(11, 2),
(16, 1),
(17, 1),
(18, 1),
(19, 1),
(20, 1),
(21, 1),
(22, 2),
(23, 3),
(24, 4),
(25, 2),
(26, 3),
(27, 2),
(28, 2),
(29, 4),
(30, 1),
(31, 3),
(32, 1),
(33, 4),
(34, 3),
(35, 2),
(36, 2),
(37, 2),
(38, 1),
(39, 2),
(40, 3),
(41, 2),
(42, 4),
(43, 3),
(44, 1),
(45, 3),
(46, 2),
(47, 4),
(48, 3),
(49, 2),
(50, 1),
(51, 4),
(52, 1),
(53, 3),
(54, 2),
(56, 1),
(57, 3),
(58, 2),
(59, 1),
(60, 2),
(61, 2),
(62, 4),
(63, 4),
(64, 4),
(65, 4),
(66, 4),
(67, 4),
(68, 4),
(69, 3),
(73, 4),
(74, 1),
(75, 3),
(76, 2),
(77, 3),
(79, 1),
(80, 2),
(81, 1),
(85, 3),
(86, 1),
(87, 2),
(88, 2),
(89, 4),
(90, 3),
(91, 1),
(92, 2),
(93, 2),
(94, 2),
(95, 4),
(96, 3),
(97, 2),
(98, 4),
(99, 3),
(100, 1),
(101, 2),
(102, 2),
(103, 1),
(104, 3),
(105, 2),
(106, 1),
(107, 3),
(108, 4),
(109, 4),
(110, 1),
(111, 4),
(112, 4),
(113, 2),
(114, 1),
(115, 3),
(116, 3),
(117, 2),
(118, 4),
(119, 3),
(120, 2),
(121, 1),
(122, 4),
(123, 3),
(124, 4),
(125, 2),
(126, 4),
(127, 1),
(128, 4);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

CREATE TABLE `users` (
  `CodeUser` int(11) NOT NULL,
  `Nom` varchar(50) DEFAULT NULL,
  `Prenom` varchar(50) DEFAULT NULL,
  `Email` varchar(255) NOT NULL,
  `MotdePasse` varchar(255) NOT NULL,
  `Statut` varchar(11) NOT NULL,
  `Sexe` varchar(14) NOT NULL,
  `DateDeNaissance` date DEFAULT NULL,
  `Adresse1` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `CodePostal` varchar(50) DEFAULT NULL,
  `Ville` varchar(50) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`CodeUser`, `Nom`, `Prenom`, `Email`, `MotdePasse`, `Statut`, `Sexe`, `DateDeNaissance`, `Adresse1`, `CodePostal`, `Ville`, `Telephone`) VALUES
(1, 'Béal', 'Géraldine', 'geraldine@gmail.com', '1234', 'eleve', 'femme', '1972-01-23', '12, avenue du Collège', '75004', 'Paris', '0180123456'),
(2, 'Ambrosi', 'Pierre', 'pierre@gmail.com', '1234', 'moniteur', 'homme', '1969-01-04', '23, rue du Lycée', '75019', 'Paris', '180234567'),
(3, 'Catard', 'Olivier', 'olivier@gmail.com', '1234', 'eleve', 'homme', '1963-09-12', '34, boulevard de l\'Université', '75005', 'Paris', '0180345677'),
(4, 'Ezard', 'Régine', 'regine@gmail.com', '1234', 'moniteur', 'femme', '1978-04-06', '45, rue des Écoles', '75020', 'Paris', '0180456789');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

CREATE TABLE `vehicule` (
  `Immatriculation` varchar(50) NOT NULL,
  `Marque` varchar(50) DEFAULT NULL,
  `Modele` varchar(50) DEFAULT NULL,
  `Annee` int(11) DEFAULT NULL,
  `CodeCategorie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `vehicule`
--

INSERT INTO `vehicule` (`Immatriculation`, `Marque`, `Modele`, `Annee`, `CodeCategorie`) VALUES
('123 AB 21', 'Mercedes', 'Spania', 2000, 1),
('234 BC 21', 'Peugeot', 'Sisancys', 1996, 1),
('345 CD 21', 'Renault', 'Morgane', 1995, 1),
('456 DE 21', 'Peugeot', 'Catsansys', 1999, 1),
('567 EF 21', 'Kawasaki', 'Zephyr', 1997, 4),
('678 FG 21', 'Renault', 'Betton', 1999, 5),
('789 GH 21', 'Iveco', 'Roader', 1998, 2),
('890 HJ 21', 'Oceansea', 'Tempest', 1999, 3);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `categorie`
--
ALTER TABLE `categorie`
  ADD PRIMARY KEY (`CodeCategorie`);

--
-- Index pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD PRIMARY KEY (`CodeLecon`),
  ADD KEY `Immatriculation` (`Immatriculation`);

--
-- Index pour la table `licence`
--
ALTER TABLE `licence`
  ADD PRIMARY KEY (`CodeLicence`),
  ADD KEY `CodeMoniteur` (`CodeUser`,`CodeCategorie`),
  ADD KEY `CodeCategorie` (`CodeCategorie`);

--
-- Index pour la table `participe`
--
ALTER TABLE `participe`
  ADD KEY `idLecon` (`CodeLecon`),
  ADD KEY `idUser` (`CodeUser`) USING BTREE;

--
-- Index pour la table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`CodeUser`);

--
-- Index pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`Immatriculation`),
  ADD KEY `CodeCategorie` (`CodeCategorie`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `users`
--
ALTER TABLE `users`
  MODIFY `CodeUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `lecon`
--
ALTER TABLE `lecon`
  ADD CONSTRAINT `lecon_ibfk_3` FOREIGN KEY (`Immatriculation`) REFERENCES `vehicule` (`Immatriculation`);

--
-- Contraintes pour la table `licence`
--
ALTER TABLE `licence`
  ADD CONSTRAINT `licence_ibfk_2` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`),
  ADD CONSTRAINT `licence_ibfk_3` FOREIGN KEY (`CodeUser`) REFERENCES `users` (`CodeUser`);

--
-- Contraintes pour la table `participe`
--
ALTER TABLE `participe`
  ADD CONSTRAINT `participe_ibfk_1` FOREIGN KEY (`CodeUser`) REFERENCES `users` (`CodeUser`),
  ADD CONSTRAINT `participe_ibfk_2` FOREIGN KEY (`CodeLecon`) REFERENCES `lecon` (`CodeLecon`);

--
-- Contraintes pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD CONSTRAINT `vehicule_ibfk_1` FOREIGN KEY (`CodeCategorie`) REFERENCES `categorie` (`CodeCategorie`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
