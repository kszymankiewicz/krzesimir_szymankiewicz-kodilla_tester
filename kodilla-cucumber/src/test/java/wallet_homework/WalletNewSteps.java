package wallet_homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletNewSteps implements En {
    private NewWallet newWallet = new NewWallet();
    private NewCashSlot newCashSlot = new NewCashSlot();
    private NewTeller newTeller = new NewTeller(newCashSlot);

    public WalletNewSteps() {

        Given("my account has been credited with $100", () -> {
            newWallet.deposit(100);

        });

        When("I check my balance", () -> {
            newWallet.getBalance();
            Assert.assertEquals(100, newWallet.getBalance());
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals(100, newCashSlot.getContents());
        });

        Given("my wallet has been credited with $100", () -> {
            newWallet.deposit(100);
            Assert.assertEquals(100, newWallet.getBalance());
        });

        When("I withdraw $200", () -> {
           newTeller.withdraw(newWallet,200);
        });

        Then("0$ should be dispensed", (String string) -> {
           Assert.assertEquals("Money withdrawal",newCashSlot.getContents());
        });

        Then("I should be told that {string}", (String string) -> {
            Assert.assertEquals("You have no funds in your account",newCashSlot.getDisplay());
        });

    }
}
