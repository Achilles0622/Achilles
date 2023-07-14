比如列出部门名称和这些部门的员工名称和工作，同时要求显示出哪些没有员工的部门 
SELECT ? FROM emp,dept WHERE emp.deptno=dept.deptno ORDER BY dname

SELECT *FROM dept ;
SELECT *FROM emp;

CREATE table stu(
id int ,`name`  VARCHAR(32));
 INSERT INTO stu VALUES(1,'jack'),(2,'tom'),(3,'kity'),(4,'nono');
 SELECT *FROM stu ;
 
 CREATE TABLE exam(
 id int , grade int );
  INSERT INTO exam  VALUES(1,56),(2,76),(11,8);
	SELECT *FROM exam ;
	
	SELECT `name` ,stu.id FROM stu,exam WHERE stu.id=exam.id;
	
改成左外连接

	SELECT `name` ,stu.id FROM stu LEFT JOIN exam on  stu.id=exam.id;