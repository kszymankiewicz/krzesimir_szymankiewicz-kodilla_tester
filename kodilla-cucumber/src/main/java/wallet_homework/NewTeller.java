package wallet_homework;


import wallet.Wallet;

public class NewTeller {
    private NewCashSlot newCashSlot;
    public NewTeller(NewCashSlot newCashSlot) {
        this.newCashSlot = newCashSlot;
    }

    public void withdraw(NewWallet newWallet, int amount) {
        if (amount < newWallet.getBalance()) {
            int currentWithdraw = newWallet.withdraw(amount);
            newCashSlot.dispense(currentWithdraw);
            newCashSlot.setDisplay("Money withdrawal");
        } else {
            newCashSlot.setDisplay("You have no funds in your account");
        }
    }
}
