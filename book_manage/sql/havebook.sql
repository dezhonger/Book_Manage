/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : book_manage

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-08-05 17:44:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for havebook
-- ----------------------------
DROP TABLE IF EXISTS `havebook`;
CREATE TABLE `havebook` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `bookname` varchar(20) NOT NULL,
  `beizhu` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of havebook
-- ----------------------------
INSERT INTO `havebook` VALUES ('2', 'admin', '数学', '备注');
INSERT INTO `havebook` VALUES ('3', 'admin', '计算机', null);
INSERT INTO `havebook` VALUES ('5', 'admin', '英语', null);
INSERT INTO `havebook` VALUES ('6', 'admin', '软件工程', null);
INSERT INTO `havebook` VALUES ('7', 'admin', '英语', null);
INSERT INTO `havebook` VALUES ('9', 'admin', '语文', null);
INSERT INTO `havebook` VALUES ('10', 'admin', 'bookname', null);
INSERT INTO `havebook` VALUES ('11', 'admin', '25', null);
INSERT INTO `havebook` VALUES ('12', 'admin', '计算机', null);
INSERT INTO `havebook` VALUES ('18', 'haha', '计算机', null);
