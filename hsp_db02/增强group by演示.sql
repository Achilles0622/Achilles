显示人数总数和平均工资
SELECT COUNT(*),AVG(sal),job FROM emp GROUP BY job;
显示雇员总数和以及获得补助的雇员 
SELECT COUNT(*),COUNT(comm)FROM emp
统计没获得补助人数
SELECT COUNT(*)COUNT(IF(comm IS NULL,1,NULL))
显示管理者总人数
SELECT count (DISTINCT mgr)FROM emp;  DISTINCT去掉重复
显示员工工资最大差额
SELECT MAX(sal)-MIN(sal) FROM emp;

SELECT*FROM emp;



大于1000并且按照平均工资从高到低，取出前2行，各个部门的平均工资
SELECT deptno,AVG(sal) FROM emp GROUP BY deptno HAVING avg_sal>1000 ORDER BY avg_sal DESC LIMIT 0,2