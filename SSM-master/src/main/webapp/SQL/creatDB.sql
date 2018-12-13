SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_turnover
-- ----------------------------
DROP TABLE IF EXISTS `t_turnover`;
CREATE TABLE `t_turnover`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cash` decimal(16, 4) DEFAULT NULL COMMENT '实收现金',
  `network_cash` decimal(16, 4) DEFAULT NULL COMMENT '实收转账',
  `total_sum` decimal(16, 4) DEFAULT NULL COMMENT '总金额',
  `date` datetime DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_turnover
-- ----------------------------
INSERT INTO `t_turnover` VALUES (1, 23.1000, 11.2000, 34.3000, '2018-12-11 15:30:07');
INSERT INTO `t_turnover` VALUES (2, 23.1000, 11.2000, 34.3000, '2018-12-11 15:30:07');
INSERT INTO `t_turnover` VALUES (3, 23.1000, 11.2000, 34.3000, '2018-12-11 15:30:07');

SET FOREIGN_KEY_CHECKS = 1;



SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_t
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t`  (
  `id` bigint(255) NOT NULL COMMENT '主键',
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '账户名',
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `age` int(10) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES (1, '2', '22', 1);
INSERT INTO `user_t` VALUES (2, 'admin', 'admin', 22);

SET FOREIGN_KEY_CHECKS = 1;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_staff
-- ----------------------------
DROP TABLE IF EXISTS `t_staff`;
CREATE TABLE `t_staff`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `salary` int(255) DEFAULT NULL COMMENT '薪资',
  `entry_date` datetime DEFAULT NULL COMMENT '入职时间',
  `departure_date` datetime DEFAULT NULL COMMENT '离职时间',
  `state` int(5) DEFAULT NULL COMMENT '0:正常工作 1:停止工作',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_staff
-- ----------------------------
INSERT INTO `t_staff` VALUES (1, '测试', 1000, '2018-12-06 00:00:00', '2018-12-06 00:00:00', 1);
INSERT INTO `t_staff` VALUES (2, '测试222', 2000, '2018-11-06 10:59:58', '2018-10-06 11:00:00', 1);
INSERT INTO `t_staff` VALUES (3, '232131', 11, '2018-12-06 00:00:00', NULL, 0);
INSERT INTO `t_staff` VALUES (4, '323232', 11111, '2018-12-06 00:00:00', NULL, 0);
INSERT INTO `t_staff` VALUES (5, '32232', 2222, '2018-12-13 00:00:00', NULL, 0);
INSERT INTO `t_staff` VALUES (6, '张三', 13000, '2018-12-06 00:00:00', NULL, 0);
INSERT INTO `t_staff` VALUES (7, '郭磊', 1, '2018-12-07 00:00:00', NULL, 0);
INSERT INTO `t_staff` VALUES (8, '测试', 1000, '2018-12-06 00:00:00', '2018-12-06 00:00:00', 1);

SET FOREIGN_KEY_CHECKS = 1;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_staff_s
-- ----------------------------
DROP TABLE IF EXISTS `t_staff_s`;
CREATE TABLE `t_staff_s`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `staff_id` int(100) DEFAULT NULL COMMENT '员工ID',
  `stats` int(5) DEFAULT NULL COMMENT '类型:1:请假  2:提前取工资 ',
  `date_count` float(2, 1) DEFAULT NULL COMMENT '请假天数',
  `salary` int(100) DEFAULT NULL COMMENT '提取薪资',
  `leave_begin` datetime DEFAULT NULL COMMENT '请假开始时间',
  `leave_end` datetime DEFAULT NULL COMMENT '请假结束时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
