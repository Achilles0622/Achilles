#演示字符串类型使用char varchar
CREATE TABLE t09(
`name`CHAR(255));
CREATE TABLE t10(
`name`VARCHAR(32766))CHARSET gbk;
DROP TABLE t10;