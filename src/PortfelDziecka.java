public class PortfelDziecka extends Wallet {


public PortfelDziecka (double amountPD){

    amount=amountPD;
}

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
        return "PortfelDziecka = "+ amount;
    }
}
