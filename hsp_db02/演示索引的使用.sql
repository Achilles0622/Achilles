CREATE TABLE t25(
id int ,`name `VARCHAR(32));
查询该表是否有索引
SHOW INDEXKEY from t25;
添加唯一索引。如果没有重复id 速度快
CREATE UNIQUE index id_index on t25 (id);
添加普通索引。未来表会有重复数据就使用普通索引
CREATE  index id_index on t25 (id);