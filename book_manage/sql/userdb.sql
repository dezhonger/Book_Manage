/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : book_manage

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-08-05 17:45:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userdb
-- ----------------------------
DROP TABLE IF EXISTS `userdb`;
CREATE TABLE `userdb` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userdb
-- ----------------------------
INSERT INTO `userdb` VALUES ('admin', 'admin', '1');
INSERT INTO `userdb` VALUES ('dezhonger', 'nishabi', '2');
INSERT INTO `userdb` VALUES ('haha', 'haha', '3');
