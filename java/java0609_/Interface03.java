package java0609_;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDb mysqlDb = new MysqlDb();
        t(mysqlDb);
        OracleDB oracleDB=new OracleDB();
        t(oracleDB);

    }
    public static void t(DBInterface db){
        db.connect();
        db.close();
    }

}