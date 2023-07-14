演示sql注入
CREATE TABLE admin( NAME VARCHAR(32)NOT NULL UNIQUE,pwd VARCHAR (32)not NULL DEFAULT'')CHARACTER set utf8;
INSERT into admin values('tom','123')
SELECT*FROM admin WHERE name='tom'AND pwd='123'
SELECT*FROM admin WHERE name='1'OR pwd='OR'1'='1';

CREATE TABLE 