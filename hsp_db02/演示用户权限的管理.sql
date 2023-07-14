 创建一个用户 密码
 CREATE user 'shunping'@'localhost'IDENTIFIED BY '123'
 
 使用root用户创建testdb 表news
 CREATE DATABASE testdb CREATE TABLE news(id int,content VARCHAR(32));
 添加一条测试数据
 insert into news VALUES (100,'beijing news')
 SELECT *FROM news;
 给用户分配查看新闻表和添加权限
 GRANT SELECT ,INSERT on testdb.news to'shunping'@'localhost'   
CREATE DATABASE  testdb CREATE TABLE news(id int,content VARCHARACTER(32));
添加一条测试数据
insert into news VALUES(100,'beijingnews')
SELECT *FROM news;


给用户分配查看news表和添加news的权限
GRANT SELECT ,INSERT ON testdb.news to 'shunping'@'localhost'