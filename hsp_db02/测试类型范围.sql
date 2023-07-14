＃演示一个整形的文件
#NO_WRITE_TO_BINLOG
#表的字符集和存储引擎使用默认，遵循数据库的排序规则
CREATE TABLE  t3(
id TINYINT);
INSERT INTO t3 VALUES(-128);#这是一个非常简单添加语句 以后会大量使用的

SELECT * FROME t3
CREATE TABLE  t4(
id TINYINT UNSIGNED);
INSERT INTO t4 VALUES(250);