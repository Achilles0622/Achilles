创建测试表 演员表
CREATE table actor(
id int PRIMARY key auto_increment,
name VARCHAR(32)not null default '',
sex CHAR(1) not null default '女',
borndate datetime ,
phone VARCHAR(12));
SELECT *FROM actor
 INSERT INTO actor
 VALUES(NULL,'jack','男''1990-11-11','112');