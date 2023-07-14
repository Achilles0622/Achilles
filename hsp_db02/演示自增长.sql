CREATE TABLE t24 
(id INT PRIMARY KEY AUTO_INCREMENT, email VARCHAR(32)NOT DEFAULT'',`name`VARCHAR(32)NOT NULL DEFAULT'')
DESC t24 
测试自增长的使用
INSERT INTO 24 VALUES(NULL,'jack@qq.com','tom');
INSERT INTO 24 (email,`name`)VALUES('hap@sohu.com','hsp');
SELECT*FROM t24;
修改默认自增长
ALTER TABLE t25 AUTO_INCREMENT=100
CREATE TABLE t25(id int PRIMARY key AUTO_increment,email VARCHAR(32)not null DEFAULT'',
`name` VARCHAR(32)not null default'');
INSERT into t25 VALUES(null ,'tom@qq.com','tom');
SELECT*FROM t25;   