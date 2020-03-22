package wallet;

import java.util.Scanner;

public class WalletManager {

    private Wallet wallet;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Would you like to create wallet?\nWrite Y/N");
        String temp = scanner.next();
        switch (temp.toUpperCase()) {
            case "Y":
                createWallet();
                performWalletOperation();
                return;
            case "N":
                System.out.println("Goodbye");
                return;
            case "Q":
                System.out.println("Thank you for using our service, bye.");
                return;
            default:
                System.out.println("Incorrect parameter");
                start();
        }
    }

    private void createWallet() {
        System.out.println("Please choose currency type by writing it to console.\n(Dollar, Euro, Frank, PLN)");
        String temp = scanner.next();
        for (CurrencyType type : CurrencyType.values()) {
            if (type.name().equals(temp.toUpperCase())) {
                wallet = new CustomWallet(type);
                System.out.println("Wallet created: " + wallet + "\n");
            }
        }
        if (wallet == null) {
            System.out.println("Incorrect parameter\n");
            createWallet();
        }
    }

    private void performWalletOperation() {
        while (scanner.hasNextLine()) {
            System.out.println("Please choose operation You would like to perform.\n(Deposit, Withdraw, Check Balance)");
            String temp = scanner.nextLine();
            switch (temp.toUpperCase()) {
                case "DEPOSIT":
                    deposit();
                    break;
                case "WITHDRAW":
                    withdraw();
                    break;
                case "CHECK BALANCE":
                    checkBalance();
                    break;
                case "Q":
                    System.out.println("Thank you for using our service, bye.");
                    return;
                default:
                    System.out.println("Incorrect parameter");
            }
        }
    }

    private void deposit() {
        System.out.println("Please enter the amount you would like to deposit.");
        while (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            wallet.addMoney(temp, MoneyType.NORM);
            System.out.println("Money has beed deposited:" + wallet.checkBalance());
            return;
        }
        System.out.println("Incorrect parameter");
    }

    private void withdraw() {
        System.out.println("Please enter the amount you would like to withdraw.");
        if (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            wallet.spendMoney(temp, MoneyType.NORM);
            System.out.println("Money has beed withdrawed:" + wallet.checkBalance());
            return;
        }
        System.out.println("Incorrect parameter");
        withdraw();
    }

    private void checkBalance() {
        System.out.println("Your wallet balance is: " + wallet.checkBalance());
    }
}
