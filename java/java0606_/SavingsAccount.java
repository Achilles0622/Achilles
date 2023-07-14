package java0606_;

public class SavingsAccount extends BankAccount {
    private int count=3;
    private double rate=0.01;

    @Override
    public void deposit(double amount) {
        //判断是否可以面手续费
        if(count>0){
            super.deposit(amount);
        }else {
            super.deposit(amount-1);
        }
count--;
    }

    public SavingsAccount(double initialBalance, int count) {
        super(initialBalance);
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
