import java.util.Scanner;

public abstract class Wallet {

    public double amount;

    public double spendMoney(double money) {
        return amount = amount+money;
    }


    public double addMoney(double money) {
        return amount = amount+money;
    }


   // public abstract double amountMoney ();




    public double getAmount() {
        return amount;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }
}
