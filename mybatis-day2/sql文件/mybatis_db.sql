/*
 Navicat Premium Data Transfer

 Source Server         : baizhi
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : baizhi

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 18/07/2021 16:20:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mybatis_db
-- ----------------------------
DROP TABLE IF EXISTS `mybatis_db`;
CREATE TABLE `mybatis_db`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `birthday` date NULL DEFAULT NULL,
  `sex` char(1) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mybatis_db
-- ----------------------------
INSERT INTO `mybatis_db` VALUES (1, '子慕', '2021-07-12', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (2, '张三', '2021-07-15', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (3, '李四', '2021-10-20', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (4, '李四', '2021-10-20', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (5, '李四', '3900-01-31', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (6, '李四', '3900-01-31', '男', '长江大学');
INSERT INTO `mybatis_db` VALUES (7, '李四', '3900-01-31', '男', '北京');
INSERT INTO `mybatis_db` VALUES (8, '王五', '2021-07-21', '女', '北京');

SET FOREIGN_KEY_CHECKS = 1;
