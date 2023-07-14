CREATE TABLE t17
(id INT PRIMARY KEY,`name` VARCHAR(32),email VARCHAR(32));
主键的列是不可以重复的 
INSERT INTO t17 VALUES (1,'jack','jack@sohu.com');
INSERT INTO t17 VALUES(2,'tom','tom@sohu.com');
INSERT INTO t17 VALUES(1,'hsp','hsp@sohu.com');
SELECT*FROM t17;