-- MySQL Script generated by MySQL Workbench
-- Sun Dec  5 23:31:47 2021
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_ars
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_ars
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_ars` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `db_ars` ;

-- -----------------------------------------------------
-- Table `db_ars`.`ars`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`ars` (
  `idArs` INT NOT NULL AUTO_INCREMENT,
  `Codigo` VARCHAR(45) NULL DEFAULT NULL,
  `Nombre` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idArs`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`m_disponibilidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`m_disponibilidad` (
  `idM_disponibilidad` INT NOT NULL AUTO_INCREMENT,
  `idMedicos` INT NOT NULL,
  `idEspecialidad` INT NOT NULL,
  `HoraInico` TIME NOT NULL,
  `HoraFin` TIME NOT NULL,
  `Dia` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idM_disponibilidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`m_especialidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`m_especialidad` (
  `idm_Especialidad` INT NOT NULL AUTO_INCREMENT,
  `NombreEspecialidad` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idm_Especialidad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`medicos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`medicos` (
  `idMedicos` INT NOT NULL AUTO_INCREMENT,
  `Codigo` VARCHAR(45) NOT NULL,
  `Cedula` VARCHAR(45) NOT NULL,
  `Nombres` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `HoraEntrada` VARCHAR(40) NOT NULL,
  `HoraSalida` VARCHAR(40) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(100) NOT NULL,
  `Sexo` VARCHAR(45) NOT NULL,
  `TurnosMaximo` VARCHAR(45) NOT NULL,
  `Especialidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMedicos`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`pacientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`pacientes` (
  `idPacientes` INT NOT NULL AUTO_INCREMENT,
  `Codigo` VARCHAR(10) NOT NULL,
  `Cedula` VARCHAR(45) NOT NULL,
  `Ars` VARCHAR(45) NOT NULL,
  `NSS` VARCHAR(45) NOT NULL,
  `Nombres` VARCHAR(100) NOT NULL,
  `Apellidos` VARCHAR(100) NOT NULL,
  `Telefono` VARCHAR(45) NOT NULL,
  `Celular` VARCHAR(45) NULL DEFAULT NULL,
  `FechaNacimiento` VARCHAR(45) NOT NULL,
  `Historia` VARCHAR(45) NOT NULL,
  `Sexo` VARCHAR(45) NOT NULL,
  `Tipificacion` VARCHAR(45) NOT NULL,
  `Direccion` VARCHAR(100) NOT NULL,
  `Ocupacion` VARCHAR(45) NOT NULL,
  `Emergencia` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPacientes`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`tipo_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`tipo_usuario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`turnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`turnos` (
  `idTurnos` INT NOT NULL AUTO_INCREMENT,
  `Codigo` VARCHAR(45) NULL DEFAULT NULL,
  `Numero` VARCHAR(45) NULL DEFAULT NULL,
  `Paciente` VARCHAR(45) NULL DEFAULT NULL,
  `Medico` VARCHAR(45) NULL DEFAULT NULL,
  `Especialidad` VARCHAR(45) NULL DEFAULT NULL,
  `Fecha` VARCHAR(45) NULL DEFAULT NULL,
  `Hora` VARCHAR(45) NULL DEFAULT NULL,
  `Monto` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idTurnos`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `db_ars`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_ars`.`usuarios` (
  `idUsuarios` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `id_Tipo` INT NOT NULL,
  PRIMARY KEY (`idUsuarios`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
