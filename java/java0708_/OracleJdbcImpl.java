package java0708_;

import java.util.Objects;

public class OracleJdbcImpl implements JdbcInterface{
    @Override
    public Objects getConnection() {
        System.out.println("得到oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成增删改拆");
    }

    @Override
    public void close() {
        System.out.println("关闭连接");
    }
}
