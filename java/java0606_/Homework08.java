package java0606_;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);
        checkingAccount.withdraw(9 );
        System.out.println(checkingAccount.getBalance());
    }
}
