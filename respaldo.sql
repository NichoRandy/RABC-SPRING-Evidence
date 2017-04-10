-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.7.17-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para hospital
CREATE DATABASE IF NOT EXISTS `hospital` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hospital`;

-- Volcando estructura para tabla hospital.cita
CREATE TABLE IF NOT EXISTS `cita` (
  `idCita` int(10) NOT NULL AUTO_INCREMENT,
  `Fecha` varchar(50) DEFAULT NULL,
  `hora` varchar(50) DEFAULT NULL,
  `IdPaciente` int(11) NOT NULL,
  `idMedico` int(10) NOT NULL,
  `idConsultorio` int(11) DEFAULT NULL,
  `IdEspecialidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCita`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.cita: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
INSERT INTO `cita` (`idCita`, `Fecha`, `hora`, `IdPaciente`, `idMedico`, `idConsultorio`, `IdEspecialidad`) VALUES
	(2, '02/07/2018', '13:00', 1, 3, 4, 3),
	(3, '02/07/2017', '13:00', 1, 3, 4, 3),
	(4, '02/07/2017', '13:00', 1, 3, 4, 3),
	(5, '02/07/2017', '13:00', 1, 3, 4, 3),
	(6, '02/07/2017', '13:00', 1, 3, 4, 3);
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.consultorio
CREATE TABLE IF NOT EXISTS `consultorio` (
  `IdConsultorio` int(10) NOT NULL,
  `IdHospital` int(10) NOT NULL,
  `IdEspecialidad` int(10) NOT NULL,
  `IdMedico` int(10) NOT NULL,
  PRIMARY KEY (`IdConsultorio`,`IdHospital`),
  KEY `FKConsultori184580` (`IdHospital`),
  KEY `FKConsultori967506` (`IdEspecialidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.consultorio: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `consultorio` DISABLE KEYS */;
INSERT INTO `consultorio` (`IdConsultorio`, `IdHospital`, `IdEspecialidad`, `IdMedico`) VALUES
	(1, 1, 1, 1);
/*!40000 ALTER TABLE `consultorio` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.consultorio-medico
CREATE TABLE IF NOT EXISTS `consultorio-medico` (
  `IdConsultorio` int(10) NOT NULL,
  `IdHospital` int(10) NOT NULL,
  `IdMedico` int(10) NOT NULL,
  `Horario` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.consultorio-medico: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `consultorio-medico` DISABLE KEYS */;
INSERT INTO `consultorio-medico` (`IdConsultorio`, `IdHospital`, `IdMedico`, `Horario`) VALUES
	(1, 1, 1, '13:00');
/*!40000 ALTER TABLE `consultorio-medico` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.especialidad
CREATE TABLE IF NOT EXISTS `especialidad` (
  `IdEspecialidad` int(10) NOT NULL AUTO_INCREMENT,
  `nombreEspecialidad` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdEspecialidad`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.especialidad: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `especialidad` DISABLE KEYS */;
INSERT INTO `especialidad` (`IdEspecialidad`, `nombreEspecialidad`) VALUES
	(1, 'Neurologia');
/*!40000 ALTER TABLE `especialidad` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.hospital
CREATE TABLE IF NOT EXISTS `hospital` (
  `Id_Hospital` int(10) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(50) DEFAULT NULL,
  `Direccion` varchar(50) DEFAULT NULL,
  `Telefono` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id_Hospital`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.hospital: ~1 rows (aproximadamente)
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` (`Id_Hospital`, `Nombre`, `Direccion`, `Telefono`) VALUES
	(1, 'juan', 'San juan', '777466372');
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.medico
CREATE TABLE IF NOT EXISTS `medico` (
  `IdMedico` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `idEspecialidad` varchar(50) DEFAULT NULL,
  `Telefono` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `cedulaProfesional` varchar(50) DEFAULT NULL,
  `horario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.medico: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` (`IdMedico`, `nombre`, `apellido`, `idEspecialidad`, `Telefono`, `correo`, `direccion`, `cedulaProfesional`, `horario`) VALUES
	(1, 'Juan', 'sanchez', 'pediatra', '7731300300', 'juansan@gmail.com', 'av.siempre viva', '4453332998', '7:00 a 16:00'),
	(2, 'Luis', 'Juárez', '1', '234242', 'luis@hotmail.com', 'Zaragoza 23', '86537745', 'Matutino');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `IdPaciente` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `tipoSangre` varchar(50) DEFAULT NULL,
  `alergias` varchar(50) DEFAULT NULL,
  `NSS` varchar(50) DEFAULT NULL,
  `sexo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`IdPaciente`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.paciente: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` (`IdPaciente`, `nombre`, `apellido`, `direccion`, `telefono`, `email`, `tipoSangre`, `alergias`, `NSS`, `sexo`) VALUES
	(1, 'RandyAAAAAA', 'Bautista', 'corona', '24', 'masculino', 'o+', 'ninguna', 'RRR', 'Masculino'),
	(3, 'BArcenas', 'Barcenas', 'Hidalgo 34, col centro.', '992378753', 'gildibal@gmail.com', 'AB-', 'Fresas', '34535362', 'Masculino'),
	(6, 'nicho', 'Barcenas', 'Hidalgo 34, col centro.', '992378753', 'nicho@gmail.com', 'AB-', 'JJJJJJJJJ', '34535362', 'Masculino'),
	(7, 'nicho', 'Barcenas', 'Hidalgo 34, col centro.', '992378753', 'nicho@gmail.com', 'AB-', 'JJJJJJJJJ', '34535362', 'Masculino'),
	(8, 'nicho', 'Barcenas', 'Hidalgo 34, col centro.', '992378753', 'nicho@gmail.com', 'AB-', 'JJJJJJJJJ', '34535362', 'Masculino'),
	(9, 'nicho', 'Barcenas', 'Hidalgo 34, col centro.', '992378753', 'nicho@gmail.com', 'AB-', 'JJJJJJJJJ', '34535362', 'Masculino');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;

-- Volcando estructura para tabla hospital.receta
CREATE TABLE IF NOT EXISTS `receta` (
  `IdReceta` int(10) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(50) DEFAULT NULL,
  `Fecha` varchar(50) DEFAULT NULL,
  `IdMedico` int(10) NOT NULL,
  `IdPaciente` int(10) NOT NULL,
  PRIMARY KEY (`IdReceta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla hospital.receta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `receta` DISABLE KEYS */;
/*!40000 ALTER TABLE `receta` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
