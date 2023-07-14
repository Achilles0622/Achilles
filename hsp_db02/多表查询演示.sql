 SELECT ename,(SELECT CASE  
 WHEN job ='CLEAK'THEN '职员'
  WHEN job ='MANAGER'THEN '经历'
	 WHEN job ='SALESMAN'THEN '销售人员'
		WHEN job END)AS 'job'
		 FROM emp;
		 SELECT *FROM emp;
		 	 SELECT *FROM dept;	 
			 SELECT *FROM salgrade;

