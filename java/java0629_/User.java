package java0629_;

import java.io.Serializable;

public class User implements Serializable {//表示一个用户信息
    private static final long seriaLVersionUID=1L;

    private  String userID;
    private String passwd;
    public User(){}

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public User(String userID, String passwd) {
        this.userID = userID;
        this.passwd = passwd;
    }
}
