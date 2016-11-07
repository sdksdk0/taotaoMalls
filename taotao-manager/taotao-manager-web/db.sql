--管理员表

CREATE TABLE `tb_admin_user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(32) NOT NULL COMMENT '密码，加密存储',
  `phone` VARCHAR(20) DEFAULT NULL COMMENT '注册手机号',
  `email` VARCHAR(50) DEFAULT NULL COMMENT '注册邮箱',
  `created` DATETIME NOT NULL,
  `updated` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`) USING BTREE,
  UNIQUE KEY `phone` (`phone`) USING BTREE,
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='管理员表'


INSERT INTO tb_admin_user VALUES(1,'admin','0cc175b9c0f1b6a831c399e269772661','1243565','11@qq.com','2016-11-1','2016-11-7');
SELECT * FROM tb_admin_user;


