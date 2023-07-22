package CodeSchool;

public class SavingsAccount01 {

    int balance;

    public SavingsAccount01(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+balance);
    }

    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited " + amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw);
        return amountToWithdraw;
    }

    public String toString(){
        return "This is a savings account with " + balance + " saved.";
    }

    public static void main(String[] args){
        SavingsAccount01 savings = new SavingsAccount01(2000);

        savings.checkBalance();

        savings.withdraw(300);

        savings.checkBalance();

        savings.deposit(600);

        savings.checkBalance();

        savings.deposit(600);

        savings.checkBalance();

        System.out.println(savings);
    }
}
