package wallet;

public enum MoneyType {
    DECIMAL(0.01),
    NORM(1),
    KILO(1000);

    final double factor;

    MoneyType(double factor) {
        this.factor = factor;
    }
}