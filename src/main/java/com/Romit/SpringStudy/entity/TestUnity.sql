-- auto Generated on 2019-11-24
-- DROP TABLE IF EXISTS test_unity;
CREATE TABLE test_unity(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
	creat_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'creatTime',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'test_unity';
