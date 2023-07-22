package CodeSchool;

public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew "+300);

        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited "+600);

        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited "+600);

        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

    }
}

