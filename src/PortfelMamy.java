public class PortfelMamy extends Wallet{

public PortfelMamy (double am) {

    amount=am;
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
        return "PortfelMamy = " + amount ;
    }
}
