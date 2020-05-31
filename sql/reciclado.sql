/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : reciclado

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-05-16 12:26:56
*/
DROP DATABASE IF EXISTS reciclado;
CREATE DATABASE reciclado;
USE reciclado;

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `chofer`
-- ----------------------------
DROP TABLE IF EXISTS `chofer`;
CREATE TABLE `chofer` (
  `id_chofer` int(11) NOT NULL AUTO_INCREMENT,
  `id_planta` int(11) DEFAULT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  `rut` varchar(15) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `email` varchar(15) DEFAULT NULL,
  `licencia` varchar(15) DEFAULT NULL,
  `sueldo` int(11) DEFAULT NULL,
  `cant_viajes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_chofer`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of chofer
-- ----------------------------
INSERT INTO `chofer` VALUES ('1', '1', 'pablo', '11111111', '94564131', 'correo1@correo.', 'TIPO A', '500000', '10');
INSERT INTO `chofer` VALUES ('2', '1', 'pedro', '2222222', '94564131', 'correo1@correo.', 'TIPO A', '500000', '10');
INSERT INTO `chofer` VALUES ('3', '1', 'benjamin', '33333333', '94564131', 'correo1@correo.', 'TIPO A', '500000', '10');


-- ----------------------------
-- Table structure for `cliente`
-- ----------------------------
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(15) NOT NULL,
  `rut` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `tipo_domicilio` varchar(15) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=latin1;



-- ----------------------------
-- Table structure for `coordinacion`
-- ----------------------------
DROP TABLE IF EXISTS `coordinacion`;
CREATE TABLE `coordinacion` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `encargado` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `telefono` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of coordinacion
-- ----------------------------
INSERT INTO `coordinacion` VALUES ('1', 'RAFAEL', 'rafa@gmail.com', '912349876');

-- ----------------------------
-- Table structure for `planta`
-- ----------------------------
DROP TABLE IF EXISTS `planta`;
CREATE TABLE `planta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `ciudad` varchar(30) DEFAULT NULL,
  `capacidad_max_kilos` int(11) DEFAULT NULL,
  `cantidad_kilos` int(11) DEFAULT NULL,
  `cantidad_solicitudes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of planta
-- ----------------------------
INSERT INTO `planta` VALUES ('1', 'viña', 'viña', 'viña', '500', '500', '0');
INSERT INTO `planta` VALUES ('2', 'santiago', 'santiago', 'santiago', '500', '500', null);
INSERT INTO `planta` VALUES ('3', 'valparaiso', 'valparaiso', 'valparaiso', '500', '500', null);

-- ----------------------------
-- Table structure for `residuo`
-- ----------------------------
DROP TABLE IF EXISTS `residuo`;
CREATE TABLE `residuo` (
  `id_residuo` int(11) NOT NULL AUTO_INCREMENT,
  `id_planta` int(11) DEFAULT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `descripcion` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_residuo`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of residuo
-- ----------------------------
INSERT INTO `residuo` VALUES ('1', '1', 'papel', 'todo metal');
INSERT INTO `residuo` VALUES ('2', '1', 'organico', null);
INSERT INTO `residuo` VALUES ('3', '1', 'inorganico', null);
INSERT INTO `residuo` VALUES ('10', '1', 'envase', null);
INSERT INTO `residuo` VALUES ('11', '1', 'vidrio', null);

-- ----------------------------
-- Table structure for `solicitud`
-- ----------------------------
DROP TABLE IF EXISTS `solicitud`;
CREATE TABLE `solicitud` (
  `id_solicitud` int(11) NOT NULL AUTO_INCREMENT,
  `id_cliente` int(11) DEFAULT NULL,
  `ciudad` varchar(15) DEFAULT NULL,
  `tipo_residuo` varchar(30) DEFAULT NULL,
  `kilogramos` int(11) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_solicitud`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=latin1;



-- ----------------------------
-- Table structure for `vehiculo`
-- ----------------------------
DROP TABLE IF EXISTS `vehiculo`;
CREATE TABLE `vehiculo` (
  `id_vehiculo` int(11) NOT NULL AUTO_INCREMENT,
  `id_chofer` int(11) DEFAULT NULL,
  `patente` varchar(15) DEFAULT NULL,
  `modelo` varchar(15) DEFAULT NULL,
  `tipo_vehiculo` varchar(15) DEFAULT NULL,
  `kilometraje` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of vehiculo
-- ----------------------------
INSERT INTO `vehiculo` VALUES ('1', '1', 'tipo a', 'suv', 'suv', '5000');
INSERT INTO `vehiculo` VALUES ('2', '5', 'tipo a', 'sedan', 'suv', '5000');
