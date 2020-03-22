package wallet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Wallet wallet = new CustomWallet(CurrencyType.DOLLAR);
        CustomWallet customWallet = new CustomWallet(CurrencyType.DOLLAR);

        WalletManager wm = new WalletManager();
        wm.start();
    }
}
