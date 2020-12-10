/*
 Navicat Premium Data Transfer

 Source Server         : connect
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : xcglxt

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 11/07/2020 12:06:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for achievement
-- ----------------------------
DROP TABLE IF EXISTS `achievement`;
CREATE TABLE `achievement`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ben` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `kai` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `feng` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `cheng` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `zhiwu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dianhua` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `shenghuo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `jieri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `koufa` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `jiaban` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qita` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `linshi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `buchong` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `month` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `total_kechou` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `total_butie` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mTAO_State` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of achievement
-- ----------------------------
INSERT INTO `achievement` VALUES (7, '88041', '504000', '756000', '1008000', '1260000', '0', '0', '0', '0', '0', '0', '0', NULL, '0', '5', '705600.0', '0', '专任教师');
INSERT INTO `achievement` VALUES (8, '88041', '504000', '756000', '1008000', '1260000', '0', '0', '0', '0', '0', '0', '0', NULL, '0', '5', '705600.0', '0', '专任教师');

-- ----------------------------
-- Table structure for coursesum
-- ----------------------------
DROP TABLE IF EXISTS `coursesum`;
CREATE TABLE `coursesum`  (
  `term` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `courseType` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `courseSum` int(16) NOT NULL,
  PRIMARY KEY (`term`, `userId`, `courseType`) USING BTREE,
  INDEX `userId`(`userId`) USING BTREE,
  CONSTRAINT `coursesum_ibfk_1` FOREIGN KEY (`term`) REFERENCES `terms` (`termStr`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `coursesum_ibfk_2` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of coursesum
-- ----------------------------
INSERT INTO `coursesum` VALUES ('2015-2016(2)', '88008', '全日制本科', 78);
INSERT INTO `coursesum` VALUES ('2016-2017(1)', '88008', '凤凰学院', 45);
INSERT INTO `coursesum` VALUES ('2016-2017(1)', '88008', '开放学院', 120);
INSERT INTO `coursesum` VALUES ('2016-2017(1)', '88008', '成人教育', 45);

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `user_id` smallint(5) UNSIGNED NOT NULL,
  `staff_id` tinyint(3) UNSIGNED NOT NULL,
  `pay` decimal(11, 0) NULL DEFAULT NULL,
  `amount` decimal(5, 2) NOT NULL,
  `payment_date` datetime(0) NULL,
  `last_update` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
  INDEX `idx_fk_staff_id`(`staff_id`) USING BTREE,
  INDEX `idx_fk_customer_id`(`user_id`) USING BTREE,
  INDEX `fk_payment_rental`(`pay`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for terms
-- ----------------------------
DROP TABLE IF EXISTS `terms`;
CREATE TABLE `terms`  (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `termStr` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`termStr`) USING BTREE,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 104 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of terms
-- ----------------------------
INSERT INTO `terms` VALUES (101, '2015-2016(1)');
INSERT INTO `terms` VALUES (102, '2015-2016(2)');
INSERT INTO `terms` VALUES (103, '2016-2017(1)');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userId` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `psw` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `department` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `post` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `professionalTitle` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mTAO_State` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `baseAllowanceState` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `dutyAllowanceState` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telAllowanceState` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loginAuthority` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('88001', '卓雄辉', '659c7992e268962384eb17fafe88364', '男', '学院领导', '书记', '正高', '书记', '院长书记', '院长书记', '院长书记', '教师');
INSERT INTO `user` VALUES ('88002', '汤庸', '659c7992e268962384eb17fafe88364', '男', '学院领导', '院长', '正高', '院长', '院长书记', '院长书记', '院长书记', '教师');
INSERT INTO `user` VALUES ('88003', '黄平江', '659c7992e268962384eb17fafe88364', '女', '学院领导', '副书记', '中级', '副书记', '副院长-书记', '副院长-书记', '副院长书记 ', '教师');
INSERT INTO `user` VALUES ('88004', '曾碧卿', '659c7992e268962384eb17fafe88364', '男', '学院领导', '副院长', '正高', '副院长', '副院长-书记', '副院长-书记', '副院长书记 ', '财务主管领导');
INSERT INTO `user` VALUES ('88005', '余松森', '659c7992e268962384eb17fafe88364', '男', '学院领导', '副院长', '正高', '副院长', '副院长-书记', '副院长-书记', '副院长书记 ', '教师');
INSERT INTO `user` VALUES ('88006', '李利强', '659c7992e268962384eb17fafe88364', '女', '计算机基础部', '教师', '副高', '专任教师', '教授', '无', '无', '教师');
INSERT INTO `user` VALUES ('88007', '汪红松', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88008', '陈恒法', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88009', '彭丰平', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '学院网站维护 ', '无', '教师');
INSERT INTO `user` VALUES ('88010', '吴干华', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88011', '舒纲旭', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88012', '周娴伟', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88013', '焦清涛', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '学生科研负责人 ', '无', '教师');
INSERT INTO `user` VALUES ('88014', '邹竞辉', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88015', '杜瑛', '659c7992e268962384eb17fafe88364', '男', '计算机基础部', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88016', '冼广铭', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '副高', '专任教师', '副教授', '无', '无', '教师');
INSERT INTO `user` VALUES ('88017', '李小亚', '659c7992e268962384eb17fafe88364', '男', '计算机基础部', '计算机基础部主任', '中级', '部主任', '系部主任', '各中心主任  ', '各部门主任', '教师');
INSERT INTO `user` VALUES ('88018', '刘刚', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '教师', '副高', '专任教师', '副教授', '无', '无', '教师');
INSERT INTO `user` VALUES ('88019', '潘家辉', '659c7992e268962384eb17fafe88364', '男', '软件工程系', '软件系主任', '副高', '专任教师', '副教授', '各中心主任  ', '各部门主任', '教师');
INSERT INTO `user` VALUES ('88020', '杨桂芝', '659c7992e268962384eb17fafe88364', '女', '计算机基础部', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88021', '陈赣浪', '659c7992e268962384eb17fafe88364', '女', '计算机基础部', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88022', '蔡妍', '659c7992e268962384eb17fafe88364', '女', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88023', '张承忠', '659c7992e268962384eb17fafe88364', '女', '软件工程系', '工会主席', '中级', '工会主席', '工会主席', '工会主席 ', '工会主席', '教师');
INSERT INTO `user` VALUES ('88024', '李琴', '659c7992e268962384eb17fafe88364', '女', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88027', '梁艳', '659c7992e268962384eb17fafe88364', '女', '软件工程系', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88028', '李丽', '659c7992e268962384eb17fafe88364', '女', '学院办公室', '教学秘书', '初级', '教辅', '教学秘书教务', '科研秘书', '无', '教师');
INSERT INTO `user` VALUES ('88029', '郑玉洁', '659c7992e268962384eb17fafe88364', '女', '学院办公室', '教务员', '初级', '教辅', '教学秘书教务', '教学秘书', '无', '教师');
INSERT INTO `user` VALUES ('88030', '卢桂莲', '659c7992e268962384eb17fafe88364', '女', '学院办公室', '行政秘书', '中级', '教辅', '教学秘书教务', '教学秘书', '无', '财务员');
INSERT INTO `user` VALUES ('88031', '郑晓敏', '659c7992e268962384eb17fafe88364', '男', '学院办公室', '继续教育办副主任', '初级', '教辅', '学院中层副职', '各中心副主任', '各部门副主任', '教师');
INSERT INTO `user` VALUES ('88032', '曾召浩', '659c7992e268962384eb17fafe88364', '男', '学院办公室', '办公室主任', '副高', '部主任', '办公室主任', '各中心主任  ', '各部门主任', '教师');
INSERT INTO `user` VALUES ('88033', '丁美荣', '659c7992e268962384eb17fafe88364', '女', '软件工程系', '教师', '副高', '专任教师', '副教授', '无', '无', '教师');
INSERT INTO `user` VALUES ('88034', '陈一华', '659c7992e268962384eb17fafe88364', '男', '学院实验中心', '实验中心主任', '副高', '部主任', '系部主任', '各中心主任  ', '各部门主任', '教师');
INSERT INTO `user` VALUES ('88035', '颜俊松', '659c7992e268962384eb17fafe88364', '男', '学院实验中心', '实验中心副主任', '中级', '教辅', '学院中层副职', '各中心副主任', '各部门副主任', '教师');
INSERT INTO `user` VALUES ('88036', '黄武秋', '659c7992e268962384eb17fafe88364', '男', '学院实验中心', '实验师', '中级', '教辅', '教学秘书教务', '无', '无', '教师');
INSERT INTO `user` VALUES ('88037', '彭小飞', '659c7992e268962384eb17fafe88364', '女', '数学教学部', '数学部主任', '副高', '专任教师', '副教授', '各中心主任  ', '各部门主任', '教师');
INSERT INTO `user` VALUES ('88038', '张广亮', '659c7992e268962384eb17fafe88364', '男', '数学教学部', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88039', '肖应旺', '659c7992e268962384eb17fafe88364', '男', '离职退休人员', '教师', '正高', '专任教师', '教授', '无', '无', '教师');
INSERT INTO `user` VALUES ('88040', '杨军', '659c7992e268962384eb17fafe88364', '男', '离职退休人员', '教师', '中级', '专任教师', '讲师', '无', '无', '教师');
INSERT INTO `user` VALUES ('88041', '彭惠', '123456', '女', '学生', '学生', '高级', '院长', '讲师', NULL, NULL, NULL);

-- ----------------------------
-- Table structure for workload
-- ----------------------------
DROP TABLE IF EXISTS `workload`;
CREATE TABLE `workload`  (
  `workloadId` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userId` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `term` char(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `lessonHour` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `attendCnt` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `kaiHour` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `fenHour` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  `chengHour` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL,
  PRIMARY KEY (`workloadId`) USING BTREE,
  INDEX `userId`(`userId`) USING BTREE,
  CONSTRAINT `workload_ibfk_1` FOREIGN KEY (`userId`) REFERENCES `user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of workload
-- ----------------------------
INSERT INTO `workload` VALUES (8, '88041', '2019-2020（2）', 0000000200, 0000000020, 0000000300, 0000000400, 0000000500);
INSERT INTO `workload` VALUES (9, '88041', '2019-2020（1）', 0000000200, 0000000200, 0000000200, 0000000200, 0000000200);
INSERT INTO `workload` VALUES (10, '88041', '2018-2019（2）', 0000000200, 0000000200, 0000000200, 0000000200, 0000000200);
INSERT INTO `workload` VALUES (11, '88041', '2018-2019（1）', 0000000200, 0000000200, 0000000200, 0000000200, 0000000200);
INSERT INTO `workload` VALUES (12, '88041', '2017-2018（2）', 0000000200, 0000000200, 0000000200, 0000000200, 0000000200);
INSERT INTO `workload` VALUES (13, '88041', '2017-2018（1）', 0000000200, 0000000300, 0000000300, 0000000200, 0000000300);

SET FOREIGN_KEY_CHECKS = 1;
