在多行子查询中使用all操作符
如何显示工资比部门30的所有员工德国哦你工资高的员工姓名以及部门号
all
SELECT ename, sal,deptno
FROM emp 
WHERE sal>ALL(
SELECT sal FROM emp WHERE deptno=30)

any
SELECT ename, sal,deptno 
FROM emp WHERE sal >ANY(SELECT sal FROM emp WHERE deptno=30)