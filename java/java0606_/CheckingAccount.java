package java0606_;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount-1);
        //1块入银行账号

    }


    @Override
    public void withdraw(double amount) {
        super.withdraw(amount+1);
    }
}
