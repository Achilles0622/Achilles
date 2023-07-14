#演示时间相关类型 ,创建一张表，date,datetime,timestamp
CREATE TABLE t14(
birthday DATE, -- 生日
job_time DATETIME, -- 记录年月日时分秒
login_time TIMESTAMP
NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP  ); -- 登陆的时间，如果希望自动更新的话需要配置
SELECT * FROM t14;
INSERT INTO t14(birthday,job_time) VALUES('2022-11-11' '2022-11-11 10:10:10');