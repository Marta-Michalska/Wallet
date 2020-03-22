package wallet;

public class CustomWallet extends Wallet {


    private CurrencyType currencyType;

    public CustomWallet(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public void addMoney(int amount, MoneyType type, CurrencyType currencyType) {
        cash = cash + convert(amount * type.factor, currencyType, this.currencyType);
    }

    @Override
    public void addMoney(int amount, MoneyType type) {
        cash = cash + amount * type.factor;
    }

    private double convert(double amount, CurrencyType fromCurrencyType, CurrencyType toCurrencyType) {
        return amount * (fromCurrencyType.factorInEuro / toCurrencyType.factorInEuro);
    }

    @Override
    public void spendMoney(int amount, MoneyType type, CurrencyType currencyType) {
        cash = cash - convert(amount * type.factor, currencyType, this.currencyType);
    }

    @Override
    public void spendMoney(int amount, MoneyType type) {
        cash = cash - amount * type.factor;
    }

    @Override
    public String toString() {
        return "CustomWallet: \n" +
                toPrint() +
                "\ncurrencyType: " + currencyType;
    }

    @Override
    public double checkBalance(){
        return cash;
    }


    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        cash = convert(cash, this.currencyType, currencyType);
        this.currencyType = currencyType;
    }
}
