CREATE TABLE t23(
id int PRIMARY KEY,`name`VARCHAR(32),sex VARCHAR(6)CHECK(sex in ('man','woman')),
sal DOUBLE CHECK(sal>1000 and sal<2000));

INSERT into t23 VALUES(1,'jack','mid',1)
SELECT *FROM t23;