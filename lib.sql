-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2024 at 04:56 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lib`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bname` varchar(20) NOT NULL,
  `bookpre` varchar(15) NOT NULL,
  `bookid` varchar(15) NOT NULL,
  `categ` varchar(20) NOT NULL,
  `author` varchar(30) NOT NULL,
  `year` bigint(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bname`, `bookpre`, `bookid`, `categ`, `author`, `year`) VALUES
('ROMEO JUILET', 'NOVEL', '100', 'ROMANCE', 'SHAKESPEAR', 1876),
('MACBETH', 'NOVEL', '101', 'TRAGEDY', 'SHAKESPEAR', 1845),
('BS GREWAL', 'MAT', '100', 'EDUCATION', 'GREWAL', 1997),
('BLACKHOLE', 'SCI', '100', 'FICTION', 'RUTHER', 1980),
('JUNGLE BOOK', 'ENG', '100', 'ADVENTURE', 'J.K.ROWLING', 1990),
('STATISTICS', 'COM', '100', 'EDUCATION', 'KUMARAN', 1995),
('C++', 'SCI', '101', 'EDUCATION', 'YASHWANTH', 1991),
('HOMEDESIGN', 'DES', '100', 'EDUCATION', 'OSWARLD', 1965),
('SHERLOCKS', 'NOVEL', '102', 'MYSTERY', 'SHERLOCKS', 1998),
('WINGS OF FIRE', 'ENG', '101', 'BIOGRAPHY', 'APJ.ABDULKALAM', 1998),
('CIRCUITS', 'ENGG', '100', 'EDUCATION', 'AZHAGAN', 1976),
('JAVA', 'ENGG', '101', 'EDUCATION', 'SUDHAN', 1967),
('JAVA II', 'ENGG', '103', 'EDUCATION', 'KUMAR', 1980),
('AFTER', 'ENG', '107', 'ROMANCE', 'HARDIN', 2000),
('CN', '1.ENGG', '103', 'EDUCATION', 'SEMBA', 2000),
('JAVA DEVELOPMENT', '1.ENGG', '107', 'EDUCATION', 'YASHWANTH', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `fine`
--

CREATE TABLE `fine` (
  `readerid` varchar(15) NOT NULL,
  `bookpre` varchar(15) NOT NULL,
  `bookid` int(15) NOT NULL,
  `defect` varchar(20) NOT NULL,
  `due` varchar(15) NOT NULL,
  `returnd` varchar(15) NOT NULL,
  `fineamt` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `fine`
--

INSERT INTO `fine` (`readerid`, `bookpre`, `bookid`, `defect`, `due`, `returnd`, `fineamt`) VALUES
('AR101', '103', 103, 'PAGES TORN', '31-01-2024', '05-02-2024', 175),
('UR500', '100', 100, 'LOST', '04-02-2024', '04-02-2024', 500),
('AR100', '101', 101, 'PAGES TORN', '31-01-2024', '05-02-2024', 160);

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `readerid` varchar(15) NOT NULL,
  `bookpre` varchar(15) NOT NULL,
  `boookid` varchar(15) NOT NULL,
  `bname` varchar(30) NOT NULL,
  `issue` varchar(30) NOT NULL,
  `due` varchar(20) NOT NULL,
  `access` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`readerid`, `bookpre`, `boookid`, `bname`, `issue`, `due`, `access`) VALUES
('AR100', 'NOVEL', '102', 'SHERLOCKS', '11-01-2024', '31-01-2024', 'ADMIN'),
('AR101', 'ENGG', '103', 'JAVA II', '05-01-2024', '31-01-2024', 'ADMIN'),
('UR500', 'SCI', '100', 'BLACKHOLE', '03-01-2024', '', 'USER'),
('UR501', 'ENG', '107', 'AFTER', '20-01-2024', '15-02-2024', 'USER'),
('UR502', 'COM', '100', 'STATISTICS', '16-01-2024', '', 'USER'),
('AR100', 'DES', '100', 'HOMEDESIGN', '10-01-2024', '25-01-2024', 'ADMIN'),
('UR505', 'NOVEL', '102', 'SHERLOCKS', '12-01-2024', '15-02-2024', 'USER'),
('AR100', 'SCI', '101', 'C++', '04-01-2024', '31-01-2024', 'ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `reader` varchar(20) NOT NULL,
  `degree` varchar(20) NOT NULL,
  `course` varchar(20) NOT NULL,
  `type` varchar(30) NOT NULL,
  `phone` bigint(11) NOT NULL,
  `email` varchar(20) NOT NULL,
  `readerid` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`reader`, `degree`, `course`, `type`, `phone`, `email`, `readerid`) VALUES
('KANCHANA', 'M.Sc', 'SCI', 'PROFESSOR', 9548625134, 'kanch@gmail.com', 'AR100'),
('SURESH', 'ME', 'DESIGN', 'SCHOLAR', 7452154552, 'suresh@gmail.com', 'AR101'),
('SKHARENI', 'B.E', 'CSE', 'STUDENT', 9547845125, 'skhareni1@gmail.com', 'AR106');

-- --------------------------------------------------------

--
-- Table structure for table `returnbk`
--

CREATE TABLE `returnbk` (
  `readerid` varchar(15) NOT NULL,
  `bookpre` varchar(15) NOT NULL,
  `bookid` varchar(30) NOT NULL,
  `issue` varchar(20) NOT NULL,
  `due` varchar(15) NOT NULL,
  `status` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `returnbk`
--

INSERT INTO `returnbk` (`readerid`, `bookpre`, `bookid`, `issue`, `due`, `status`) VALUES
('UR501', 'ENG', '107', '20-01-2024', '15-02-2024', 'RETURNED'),
('UR500', 'SCI', '100', '03-01-2024', '04-02-2024', 'RETURNED'),
('AR101', 'ENGG', '103', '05-01-2024', '31-01-2024', 'RETURNED'),
('UR505', 'NOVEL', '102', '12-01-2024', '15-02-2024', 'RETURNED'),
('AR100', 'DES', '100', '10-01-2024', '25-01-2024', 'RETURNED'),
('AR100', 'SCI', '101', '04-01-2024', '31-01-2024', ' NOT RET');

-- --------------------------------------------------------

--
-- Table structure for table `usereg`
--

CREATE TABLE `usereg` (
  `username` varchar(25) NOT NULL,
  `type` varchar(20) NOT NULL,
  `phone` bigint(12) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `readerid` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usereg`
--

INSERT INTO `usereg` (`username`, `type`, `phone`, `email`, `password`, `readerid`) VALUES
('VIGNESH', 'FACULTY', 7548426513, 'vignesh@gmail.com', 'vicky', 'UR500'),
('VIGNESHIYA', 'STUDENT', 9542165743, 'vigneshiya@gmail.com', 'vicky_ma', 'UR501'),
('HARI', 'ENGINEER', 8546251354, 'hari@gmail.com', 'harihari', 'UR502'),
('HARENI SK', 'STUDENT', 959745165, 'harenisk@gmail.com', 'hari2k2meow', 'UR505');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
