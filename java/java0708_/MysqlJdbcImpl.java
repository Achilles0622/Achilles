package java0708_;

import java.util.Objects;

public class MysqlJdbcImpl implements  JdbcInterface{

    @Override
    public Objects getConnection() {
        System.out.println("连接到Mysql");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成Mysql的增删改查");

    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
