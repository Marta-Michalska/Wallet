package wallet_training;

public class PortfelTaty extends Wallet {

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "wallet_training.PortfelTaty = " + amount;
    }
}
