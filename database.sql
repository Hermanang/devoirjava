-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2018 at 07:10 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examenjava`
--

-- --------------------------------------------------------

--
-- Table structure for table `mariage`
--

CREATE TABLE `mariage` (
  `ref_personne_1` int(11) NOT NULL,
  `ref_personne_2` int(11) NOT NULL,
  `ref_salle` varchar(50) NOT NULL,
  `ref_invite` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `mariage`
--

INSERT INTO `mariage` (`ref_personne_1`, `ref_personne_2`, `ref_salle`, `ref_invite`, `date`) VALUES
(4, 1, 'Continentale', 8, '2018-03-05'),
(4, 1, 'Continentale', 6, '2018-03-05'),
(5, 8, 'Continentale', 7, '2018-03-13'),
(5, 8, 'Continentale', 4, '2018-03-13');

-- --------------------------------------------------------

--
-- Table structure for table `personne`
--

CREATE TABLE `personne` (
  `personne_id` int(11) NOT NULL,
  `personne_code` int(11) NOT NULL,
  `personne_nom` varchar(100) NOT NULL,
  `sexe` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `personne`
--

INSERT INTO `personne` (`personne_id`, `personne_code`, `personne_nom`, `sexe`) VALUES
(1, 100, 'Ondo', 'Masculin'),
(2, 101, 'Ngoua', 'Masculin'),
(3, 102, 'Christelle', 'Feminin'),
(4, 103, 'Audrey', 'Feminin'),
(5, 104, 'Elsa', 'Feminin'),
(6, 105, 'Esther', 'Feminin'),
(7, 106, 'Jeffrey', 'Masculin'),
(8, 107, 'Fred', 'Masculin');

-- --------------------------------------------------------

--
-- Table structure for table `salle`
--

CREATE TABLE `salle` (
  `salle_nom` varchar(50) NOT NULL,
  `adresse` varchar(100) NOT NULL,
  `capacite` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `salle`
--

INSERT INTO `salle` (`salle_nom`, `adresse`, `capacite`) VALUES
('Continentale', 'Corniche', 1000),
('Ibiscus', 'Point_E', 600);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mariage`
--
ALTER TABLE `mariage`
  ADD KEY `ref_personne_1` (`ref_personne_1`),
  ADD KEY `ref_personne_2` (`ref_personne_2`),
  ADD KEY `ref_salle` (`ref_salle`),
  ADD KEY `ref_invite` (`ref_invite`);

--
-- Indexes for table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`personne_id`);

--
-- Indexes for table `salle`
--
ALTER TABLE `salle`
  ADD KEY `salle_nom` (`salle_nom`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `personne`
--
ALTER TABLE `personne`
  MODIFY `personne_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `mariage`
--
ALTER TABLE `mariage`
  ADD CONSTRAINT `mariage_ibfk_1` FOREIGN KEY (`ref_invite`) REFERENCES `personne` (`personne_id`),
  ADD CONSTRAINT `mariage_ibfk_2` FOREIGN KEY (`ref_personne_1`) REFERENCES `personne` (`personne_id`),
  ADD CONSTRAINT `mariage_ibfk_3` FOREIGN KEY (`ref_personne_2`) REFERENCES `personne` (`personne_id`),
  ADD CONSTRAINT `mariage_ibfk_4` FOREIGN KEY (`ref_salle`) REFERENCES `salle` (`salle_nom`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
