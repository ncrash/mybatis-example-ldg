/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `comment_no` bigint(19) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(32) NOT NULL,
  `comment_content` mediumtext NOT NULL,
  `reg_date` datetime NOT NULL,
  PRIMARY KEY (`comment_no`),
  UNIQUE KEY `XPKnwc_comment` (`comment_no`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `comment` */

insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (1,'user1','댓글1','2012-04-13 15:04:29');
insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (2,'user1','댓글2','2012-04-13 15:04:32');
insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (3,'user2','댓글3','2012-04-13 15:04:35');
insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (4,'user2','댓글4','2012-04-13 15:04:37');
insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (5,'user3','댓글5','2012-04-13 15:04:41');
insert  into `comment`(`comment_no`,`user_id`,`comment_content`,`reg_date`) values (6,'user3','댓글6','2012-04-13 15:04:43');

/*Table structure for table `reply` */

DROP TABLE IF EXISTS `reply`;

CREATE TABLE `reply` (
  `reply_no` bigint(19) NOT NULL AUTO_INCREMENT,
  `comment_no` bigint(19) NOT NULL,
  `user_id` varchar(32) NOT NULL,
  `reply_content` varchar(300) NOT NULL,
  `reg_date` datetime NOT NULL,
  PRIMARY KEY (`reply_no`),
  UNIQUE KEY `XPKnwc_reply` (`reply_no`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

/*Data for the table `reply` */

insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (1,1,'user1','댓글1_1','2012-04-13 15:05:49');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (2,1,'user1','댓글1_2','2012-04-13 15:05:52');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (3,1,'user1','댓글1_3','2012-04-13 15:05:54');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (4,1,'user1','댓글1_4','2012-04-13 15:05:55');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (5,2,'user1','댓글1_5','2012-04-13 15:06:03');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (6,3,'user2','댓글2_1','2012-04-13 15:06:10');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (7,3,'user2','댓글2_2','2012-04-13 15:06:12');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (8,3,'user2','댓글2_3','2012-04-13 15:06:13');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (9,3,'user2','댓글2_4','2012-04-13 15:06:15');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (10,4,'user2','댓글2_5','2012-04-13 15:06:21');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (11,4,'user2','댓글2_6','2012-04-13 15:06:22');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (12,5,'user3','댓글3_1','2012-04-13 15:06:31');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (13,5,'user3','댓글3_2','2012-04-13 15:06:33');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (14,6,'user3','댓글3_3','2012-04-13 15:06:38');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (15,6,'user3','댓글3_4','2012-04-13 15:06:40');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (16,6,'user3','댓글3_5','2012-04-13 15:06:41');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (17,6,'user3','댓글3_','2012-04-13 15:06:42');
insert  into `reply`(`reply_no`,`comment_no`,`user_id`,`reply_content`,`reg_date`) values (18,6,'user3','댓글3_6','2012-04-13 15:06:43');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_id` varchar(32) NOT NULL,
  `user_name` varchar(100) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_id`,`user_name`) values ('user1','사용자1');
insert  into `user`(`user_id`,`user_name`) values ('user2','사용자2');
insert  into `user`(`user_id`,`user_name`) values ('user3','사용자3');