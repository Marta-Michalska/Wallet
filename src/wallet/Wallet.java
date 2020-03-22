package wallet;

public abstract class Wallet {

    public double cash;

    public abstract void addMoney(int amount, MoneyType type);
    public abstract void addMoney(int amount, MoneyType type, CurrencyType currencyType);
    public abstract void spendMoney(int amount, MoneyType type);
    public abstract void spendMoney(int amount, MoneyType type, CurrencyType currencyType);
    public String toPrint() {
        double decimal = cash / MoneyType.DECIMAL.factor;
        double normal = cash;
        double kilo = cash / MoneyType.KILO.factor;
        return String.format("Cash in decimal %d\nCash in normal %d\n Cash in kilo: %d", decimal, normal, kilo);
    }
    public abstract double checkBalance();

}

