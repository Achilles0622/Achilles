按表中生序排列取id号升序 每页显示三条
SELECT * FROM emp
ORDER BY empno
LIMIT 0,3;
从第三行取向下3个行
SELECT * FROM emp
ORDER BY empno
LIMIT 3,3;
从第六行取向下3个行
SELECT * FROM emp
ORDER BY empno
LIMIT 6,3;