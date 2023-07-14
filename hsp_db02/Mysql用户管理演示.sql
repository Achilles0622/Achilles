原因当我们做项目开发时候，根据不同开发人员，可以赋给相对应的操作权限，特定的人干特定的活
所以数据库管理人员可以创建不同用户 付给相应的权限 提供使用

1.创建新用户 一旦创建过后放到表示是加密过后的密码
CREATE USER 'hsp_edu'@'localhost' IDENTIFIED BY'123456'
SELECT *FROM mysql.user

2.删除用户
DROP USER 'hsp_edu'@'localhost'

3.登陆

不同的数据库用户登陆到dbms后根据相应的权限，可以操作的数据库和数据对象都不一样

修改自己的密码 
SET PASSWORED=PASSWORD('abcdef') 

修改别人的密码需要求改权限
SET PASSWORD FOR 'root'@'localhost'=PASSWORD('123456')

root用户修改hsp_edu@localhost的密码是可以成功的