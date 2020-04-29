package wallet_homework;

public class NewWallet {
    private int balance = 0;

    public NewWallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public int withdraw(int money) {
        if (balance >= money) {
            this.balance -= money;
            return money;
        } else {
            int balance1 = this.balance;
            this.balance = 0;
            return balance1;
        }

    }
}
