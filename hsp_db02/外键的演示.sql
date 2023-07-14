创建外键演示
my_class 
CREATE table my_class (
id int PRIMARY key ,`name`VARCHAR(32)not null DEFAULT'');
创建从表
CREATE TABLE my_stu(
id int PRIMARY key ,`name` VARCHAR(32)not null default '',class_id int ,
foreign key (class_id)REFERENCES my_class(id))

测试数据
insert into my_class VALUES(100,'java'),(200,'web');
SELECT *FROM my_class;
INSERT INTO my_stu VALUES(1,'tom',100);
INSERT INTO my_stu VALUES(2,'jack',200);
INSERT INTO my_stu VALUES(3,'hsp',300);   这个会失败 因为300id不存在