多表查询 显示雇员名和雇员工资所在部门名字
 
 SELECT*FROM emp,dept  在默认情况下 2个表进行查询时候规则是 
 SELECT;FROM emp       从第一张表取出一行与第二张表每一行进行对比组合 返回含有2张表所有列
  SELECT;FROM dept     所以会返回第一张表*第二张表行数 这样的默认处理返回结果成为笛卡尔集
	                     解决多表的关键就是要写出正确的过滤条件WHERE
  SELECT enmae,sal,danme FROM emp,dept WHERE emp.deptno=dept.deptno
	显示各个员工姓名和工资以及工资的级别
	SELECT ename, sal ,grade FROM emp ,salgrade WHERE sal BETWEEN losal AND hisal;
	