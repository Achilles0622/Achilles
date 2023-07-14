CREATE table t21
(id int UNIQUE,`name`VARCHAR(32),email VARCHAR(32),PRIMARY key (`name`)); 表示ID不可重复

insert into t21 VALUES(1,'jack','jack@sohu.com');

insert into t21 VALUES(1,'tom','tom@sohu.com');