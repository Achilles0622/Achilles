package java0708_;

import java.util.Objects;

public interface JdbcInterface {
    //连接数据库
    public Objects getConnection();
    public void  crud();
    public void  close();
}
