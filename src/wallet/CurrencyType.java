package wallet;

public enum CurrencyType {
    DOLLAR(1.3),
    EURO(1),
    FRANK(2),
    PLN(0.23);

    double factorInEuro;

    CurrencyType(double factorInEuro) {
        this.factorInEuro = factorInEuro;
    }

    void setFactor(double factor, CurrencyType type) {
        factorInEuro = factor * type.factorInEuro;
    }
}
