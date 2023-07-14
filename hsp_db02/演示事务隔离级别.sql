1.开了2个mysql的控制台
2.查看了当前的myqsql的隔离级别
 SELECT @@tx_isolation;
3. 把其中的一个控制台的隔离级别设置成  READ UNCOMMITTED
  SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
	
4.创建一个表
CREATE TABLE `account`(id int ,`name`VARCHAR(32),money int );


	
查看当前的会话了隔离级别
SELECT@@tx_isolation
查看当前系统隔离级别
SELECT@@global.tx.isolation
设置当前回话的隔离级别
set SESSION TRANSACTION ISOLATION DELETE READ UNCOMMITTED
设置当前系统隔离级别
SET GLOBAL TRANSACTION ISOLATION DELETE 此处写想设置级别