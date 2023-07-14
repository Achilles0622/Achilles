查看所有的存储引擎
 SHOW ENGINES


innodb 存储引擎，是之前使用过的。
 1.支持事务 2.支持外键 3.支持行级锁
  myisam存储引擎
	CREATE TABLE t28(id INT,`name`VARCHAR(32)) MYISAM 
	
	
	1.添加事务快 2.不支持外键 3.支持表级锁
	START TRANSACTION;
	SAVEPOINT t1
	INSERT INTO t28 VALUES(1,'jack');
	SELECT*FROM t28;
	ROLLBACK to t1
	
	memory存储引擎 存储在内存的引擎如果关闭mycal的话表结果存在 表的内容数据就不存在了
	1.存书在内存中 2.执行速度很快没有io的读写 3.默认支持索引
	CREATE TABLE t29(id INT,`name` VARCHAR(32))ENGINE memory
	INSERT into t29 VALUES(1,'tom')(2,'jack')(3,'hsp');
	
	指令来修改存储引擎
	ALTER TABLE`t29`ENGINE=INNODB
	
	