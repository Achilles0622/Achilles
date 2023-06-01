package hspedu.encap;

public class Account {
    private String name;
    private double balance;
    private String pwd;

    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名长度要求234位，默认为无名");
            this.name = "名前ない";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("必须大于20默认值位0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为6位默认位000000");
            this.pwd = "000000";
        }
    }

    //显示账号信息
    public void showInfo() {//可以增加权限的校验
//        if() {
        System.out.println("账号信息name=" + name + "余额=" + balance + "密码=" + pwd);
    }
}

