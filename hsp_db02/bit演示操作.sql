#演示bit类型的使用
#bit 后面会带一个1-64的值 添加数据的时候范围 显示按照
CREATE TABLE t05 (num BIT(8));
INSERT INTO t05 VALUES(50);
SELECT* FROM t05;