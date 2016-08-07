/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : book_manage

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-08-05 17:44:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `info` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('4', '英语', '50', 'dezhonger');
INSERT INTO `book` VALUES ('8', '计算机', '88', '2016年8月2日18:11:17');
INSERT INTO `book` VALUES ('10', 'bookname', '12', 'info');
INSERT INTO `book` VALUES ('12', '100', '100', '100');
INSERT INTO `book` VALUES ('25', '25', '25', '25');
INSERT INTO `book` VALUES ('100', '语文', '100', 'newadd');
INSERT INTO `book` VALUES ('190', '数学', '90', '试试');
INSERT INTO `book` VALUES ('234', '软件工程', '234', '8月3号');
