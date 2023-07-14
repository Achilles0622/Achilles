package java0708_;

public class TestJDBC {
    public static void main(String[] args) {
        JdbcInterface jdbcInterface = new MysqlJdbcImpl();
        jdbcInterface.getConnection();//通过接口来调用实现类
        jdbcInterface.crud();
        jdbcInterface.close();
        System.out.println("-------------------------------");
        JdbcInterface jdbcInterface1 = new OracleJdbcImpl();
        jdbcInterface1.getConnection();//通过接口来调用实现类
        jdbcInterface1.crud();
        jdbcInterface1.close();
    }
}
