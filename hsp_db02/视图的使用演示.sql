创建一个视图 只能查询部分信息
CREATE view emp_view01 AS SELECT empno,ename,job,deptno, FROM emp;
查看视图
DESC emp_view01
SELECT*FROM emp_view01
SELECT empno,job FROM emp_view01;

创建视图的指令
SHOW CREATE VIEW emp_view01

删除视图的指令
DROP VIEW emp_view01;

修改视图的指令
UPDATE emp_view01 SET job ='manager' where empno=7369
SELECT *FROM emp;--查询基表