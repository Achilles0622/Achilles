SELECT *FROM emp
 WHERE hiredate>'1992-01-01'. 直接比较 查找 这个日期之后的行
 
 LIKE模糊查找，显示为首字符为s所有内容行： %表示0到多个的任意字符 _表示单个任意字符
 SELECT ename ,sal FROM emp
  WHERE ename LIKE 'S%'
	
	SELECT ename ,sal FROM emp  显示第三个大写O的所有员工姓名和工资或此行的内容
	WHERE ename LIKE '__O%'
	