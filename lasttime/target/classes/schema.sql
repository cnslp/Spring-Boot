DROP TABLE if EXISTS users;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `address` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

INSERT INTO `users` VALUES ('1', '2', '3');
INSERT INTO `users` VALUES ('2', '2', '2');
INSERT INTO `users` VALUES ('3', 'adfdc', '3dd');
INSERT INTO `users` VALUES ('4', 'df', 'hgf');