 smith  的部门和岗位完全相同的所有雇员（不含smith本人）
 得到smith部门和岗位
 SELECT deptno,job
 FROM emp WHERE ename='SMITH'
 SELECT* FROM emp WHERE (deptno,job)=(SELECT deptno,job FROM emp WHERE ename='smith') AND ename !='smith'
 SELECT* FROM emp;