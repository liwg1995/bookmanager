/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50151
Source Host           : localhost:3306
Source Database       : db

Target Server Type    : MYSQL
Target Server Version : 50151
File Encoding         : 65001

Date: 2016-06-26 20:33:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `BookNo` int(11) NOT NULL,
  `BookName` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Publishment` varchar(50) DEFAULT NULL,
  `ButTime` varchar(50) DEFAULT NULL,
  `Borrowed` varchar(50) DEFAULT NULL,
  `Ordered` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BookNo`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('10002', '数据库项目案例', '周兴华', '清华出版社', '2003.3.16', '否', '是');
INSERT INTO `book` VALUES ('10003', '大学体育', '王海', '外文出版社', '2007.1.12', '否', '是');
INSERT INTO `book` VALUES ('10004', '体育', '王海', '体育出版社', '2003.1.12', '否', '否');
INSERT INTO `book` VALUES ('10007', '考研英语', '李阳', '文化出版社', '2003.3.12', '否', '否');
INSERT INTO `book` VALUES ('10008', '数值分析', '王文超', '实践出版社', '2008.1.15', '否', '否');
INSERT INTO `book` VALUES ('10010', '思想理论', '吴俊', '同济大学出版社', '2003.1.12', '否', '否');
INSERT INTO `book` VALUES ('10011', '数字信号处理', '程佩青', '清华出版社', '2013.2.2', '否', '否');
INSERT INTO `book` VALUES ('10012', '最好的我们', '八月长安', '湖南文艺出版社', '2013.7.01', '否', '否');
INSERT INTO `book` VALUES ('10013', 'ASP.NET程序设计教程', '关六三', '机械工业出版社', '2010.8.11', '否', '否');
INSERT INTO `book` VALUES ('10014', 'Java从入门到精通', '明日科技', '清华大学出版社', '2012.9.20', '否', '否');
INSERT INTO `book` VALUES ('10015', '匆匆那年', '九夜茴', '东方出版社', '2008.3.1', '否', '否');
INSERT INTO `book` VALUES ('10016', '高数', '张盛', '同济大学出版社', '2008.10.9', '否', '否');
INSERT INTO `book` VALUES ('10017', '大学英语', '宋暖', '同济大学出版社', '2007.4.10', '否', '否');
INSERT INTO `book` VALUES ('10018', '那年我们青春正好', '周格格', '东方出版社', '2015.6.16', '否', '否');
INSERT INTO `book` VALUES ('10019', '何以笙箫默', '顾漫', '沈阳出版社', '2011.1.1', '否', '否');
INSERT INTO `book` VALUES ('10020', '夏有乔木，雅望天堂', '籽月', '花山文艺出版社', '2014.7.10', '否', '否');
INSERT INTO `book` VALUES ('10067', '大学英语', '向右', ' 人民教育出版社', '2016.6.25', '否', '否');
INSERT INTO `book` VALUES ('10069', '大学语文', '向左', ' 人民教育出版社', '2016.6.26', '否', '否');
INSERT INTO `book` VALUES ('100121', '平凡的世界', '路遥', '文联出版社', '2005.12.12', '否', '否');
INSERT INTO `book` VALUES ('1008611', '英语六级', '星火', ' 清华大学', '2016.6.26', '否', '否');

-- ----------------------------
-- Table structure for exceedtime
-- ----------------------------
DROP TABLE IF EXISTS `exceedtime`;
CREATE TABLE `exceedtime` (
  `StuNo` int(11) NOT NULL,
  `BookNo` int(11) DEFAULT '0',
  `BookName` varchar(50) NOT NULL,
  `DelayTime` int(11) DEFAULT NULL,
  PRIMARY KEY (`StuNo`,`BookName`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of exceedtime
-- ----------------------------
INSERT INTO `exceedtime` VALUES ('10002', '10002', '数据库项目案例', '50');
INSERT INTO `exceedtime` VALUES ('10003', '10003', 'oracle快速入门', '50');
INSERT INTO `exceedtime` VALUES ('10004', '10004', '数据库项目案例', '50');

-- ----------------------------
-- Table structure for losebook
-- ----------------------------
DROP TABLE IF EXISTS `losebook`;
CREATE TABLE `losebook` (
  `LBNO` int(11) NOT NULL,
  `StuNO` int(11) DEFAULT NULL,
  `BookNo` int(11) DEFAULT NULL,
  `BookName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`LBNO`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of losebook
-- ----------------------------
INSERT INTO `losebook` VALUES ('1', '10001', '10009', 'java me');
INSERT INTO `losebook` VALUES ('2', '10001', '10006', '计算机网络');
INSERT INTO `losebook` VALUES ('3', '10001', '10005', '英语大全');

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `mgNo` int(11) NOT NULL,
  `permitted` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`mgNo`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO `manager` VALUES ('1001', '1', '1001');
INSERT INTO `manager` VALUES ('1002', '1', '1002');
INSERT INTO `manager` VALUES ('1003', '1', '1003');

-- ----------------------------
-- Table structure for orderreport
-- ----------------------------
DROP TABLE IF EXISTS `orderreport`;
CREATE TABLE `orderreport` (
  `BookNo` int(11) NOT NULL,
  `StuName` varchar(50) DEFAULT NULL,
  `Class` varchar(50) DEFAULT NULL,
  `BookName` varchar(50) DEFAULT NULL,
  `StuNo` int(11) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BookNo`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orderreport
-- ----------------------------
INSERT INTO `orderreport` VALUES ('10001', '陈小诗', '计算机1班', 'oracle快速入门', '10001', '王海亮');
INSERT INTO `orderreport` VALUES ('10002', '陈小诗', '计算机1班', '数据库项目案例', '10001', '周兴华');
INSERT INTO `orderreport` VALUES ('10003', '陈小诗', '计算机1班', '大学体育', '10001', '王海');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `BookNo` int(11) NOT NULL,
  `StuNo` int(11) DEFAULT NULL,
  `BorrowTime` varchar(50) DEFAULT NULL,
  `ReturnTime` varchar(50) DEFAULT NULL,
  `Brrowed` varchar(50) DEFAULT NULL,
  `ordered` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BookNo`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `StuNo` int(11) NOT NULL,
  `StuName` varchar(50) DEFAULT NULL,
  `StuAge` int(11) DEFAULT NULL,
  `StuSex` varchar(50) DEFAULT NULL,
  `Class` varchar(50) DEFAULT NULL,
  `Department` varchar(50) DEFAULT NULL,
  `Tel` char(11) DEFAULT NULL,
  `Permitted` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`StuNo`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('10001', '陈小诗', '20', '女', '计算机1班', '计算机系', '2592921', '是', 'number1');
INSERT INTO `student` VALUES ('10002', '李飞', '21', '女', '计算机1班', '计算机系', '13730120123', '是', 'number2');
INSERT INTO `student` VALUES ('10003', '孙亚', '20', '男', '计算机1班', '计算机系', '13633654578', '是', 'number3');
INSERT INTO `student` VALUES ('10004', '何二', '22', '男', '计算机1班', '计算机系', '2568975', '是', 'number4');
INSERT INTO `student` VALUES ('10005', '唐雨', '21', '女', '计算机1班', '计算机系', '13936968956', '是', 'number5');
INSERT INTO `student` VALUES ('10006', '宋江', '20', '男', '计算机2班', '计算机系', '1234667', '是', 'number6');
