显示公司员工和他上级的名字
员工名字在emp表 上级名字也是
  SELECT worker.ename AS'worker name',boss.ename AS'boss name' 
	FROM　emp worker,emp boos; 
	WHERE worker.mgr=boss.empno;
	SELECT*FROM emp;