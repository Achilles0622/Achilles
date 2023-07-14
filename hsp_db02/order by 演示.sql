 --  演示order by 使用
 SELECT * FROM student 
 ORDER BY math;
 
 
  SELECT `name`,(chinese+english+math)AS total_score FROM student 
 ORDER BY total_score DESC;
 
 SELECT `name`,(chinese+english+math)AS total_score FROM student 
 WHERE `name` LIKE '韩%'
 ORDER BY total_score;