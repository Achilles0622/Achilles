SELECT COUNT(*)FROM student; -- 统计有多少个学生
SELECT COUNT(*)FROM student WHERE math>90 -- 统计总分大于250人有多少？
SELECT COUNT(*)FROM student 
WHERE (math+english+chinese)>250 -- count(*)和count（列）的区别
CREATE TABLE t15(
 `name` VARCHAR(20));
 INSERT INTO 	t15 VALUES('TOM');
  INSERT INTO 	t15 VALUES('JACK');
	 INSERT INTO 	t15 VALUES('MARY');
	  INSERT INTO 	t15 VALUES(NULL);
		SELECT*FROM t15;
		
		SELECT COUNT(*)FROM t15; 
		SELECT COUNT(name) FROM t15;
  
	
	SELECT SUM(math) FROM student; -- 统计一个班的数学成绩
	SELECT SUM(math)AS math_total_score,SUM(english),SUM(chinese)FROM student; -- 统计一个班的数学英语语文各个的成绩
	SELECT SUM(math+english+chinese)FROM student; -- 统计总和
	SELECT SUM(chinese)/COUNT(*)FROM student; -- 统计语文的平均分
	
	
	SELECT AVG(math)FROM student; -- 一个班数学平均分
	SELECT AVG(math+english+chinese)FROM student; -- 一个班总平均分
	
	SELECT MAX(math+english+chinese)FROM student; -- 最高分
		SELECT MIN(math+english+chinese)FROM student; -- 最低分
