update balance set money =money -100 where id =100
update balance set money=money+100 where id =200
创建一个表
CREATE TABLE t27(id int ,`name` VARCHAR(32));
开启一个事务
START TRANSACTION
设置保存点
SAVEPOINT a
insert into t27 VALUES(100,'tom');
SELECT *FROM t27

SAVEPOINT b
insert into t27 VALUES(200,'jack');
回退到b
ROLLBACK to b
表示回退全部的事务
ROLLBACK

如果提交了事务的话 回退节点就全部删除了 没有机会再进行回退了
如果先回退最前面保存点 后面保存点就删除了 