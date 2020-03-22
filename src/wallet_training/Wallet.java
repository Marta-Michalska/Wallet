package wallet_training;

public abstract class Wallet {

    public double amount;

    public double spendMoney(double money) {
        return amount = amount+money;
    }

    public double addMoney(double money) {
        return amount = amount+money;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

