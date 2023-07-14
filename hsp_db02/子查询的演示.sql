如何显示和smith同一部门所有员工？
先查询到simth的部门号得到，把上面selec语句当作一个子查询来进行
SELECT　deptno FROM emo WHERE ename='smith' 

SELECT*FROM emp WHERE deptno=(
SELECT deptno 
FROM emp 
WHERE ename ='smith')


多行子查询案例
如何查询和部门10的工作想的员工名字，岗位，部门号，但是不含10自己的雇员
1.查询10号部门有哪些工作
2.把上面查询结果当作子查询
SELECT DISTINCT job FROM emp WHERE deptno=20;

SELECT ename,job,sal,deptno
       FROM emp 
			 WHERE job IN(
			 SELECT DISTINCT job 
			 FROM emp 
			 WHERE deptno =10 )AND deptno!=10