-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.22 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for monocept
DROP DATABASE IF EXISTS `monocept`;
CREATE DATABASE IF NOT EXISTS `monocept` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `monocept`;

-- Dumping structure for table monocept.college
DROP TABLE IF EXISTS `college`;
CREATE TABLE IF NOT EXISTS `college` (
  `college_code` int NOT NULL,
  `college_name` varchar(40) DEFAULT NULL,
  `loaction` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`college_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table monocept.college: ~0 rows (approximately)
INSERT INTO `college` (`college_code`, `college_name`, `loaction`) VALUES
	(101, 'kamla nehru institute of technology', 'sultanpur'),
	(102, 'PSIT', 'kanpur'),
	(103, 'NIT', 'Jamshedpur');

-- Dumping structure for table monocept.college_students
DROP TABLE IF EXISTS `college_students`;
CREATE TABLE IF NOT EXISTS `college_students` (
  `college_code` int DEFAULT NULL,
  `student_name` varchar(50) DEFAULT NULL,
  `student_roll` int NOT NULL,
  PRIMARY KEY (`student_roll`),
  KEY `college_code` (`college_code`),
  CONSTRAINT `college_students_ibfk_1` FOREIGN KEY (`college_code`) REFERENCES `college` (`college_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table monocept.college_students: ~0 rows (approximately)
INSERT INTO `college_students` (`college_code`, `student_name`, `student_roll`) VALUES
	(101, 'rohan', 42);

-- Dumping structure for table monocept.students
DROP TABLE IF EXISTS `students`;
CREATE TABLE IF NOT EXISTS `students` (
  `studentId` int NOT NULL,
  `studentName` varchar(34) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table monocept.students: ~1 rows (approximately)
INSERT INTO `students` (`studentId`, `studentName`) VALUES
	(1, 'rohan sahu'),
	(2, 'shikhar'),
	(11, 'bachan pandey'),
	(40, '+rohann+'),
	(43, '+rohann+'),
	(44, 'ankittt'),
	(49, 'vijay'),
	(69, 'vijay'),
	(71, 'vijay'),
	(79, 'vijay'),
	(121, 'Zara');

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
