package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            teller.withdraw(wallet, 30);
        });
        When("I request $210", () -> {
            teller.withdraw(wallet, 210);
        });

        When("I request $10", () -> {
            teller.withdraw(wallet, 10);
        });

        When("I request $0", () -> {
            teller.withdraw(wallet, 0);
        });

        When("I request $-50", () -> {

            teller.withdraw(wallet, -50);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });
        Then("$210 should be dispensed", () -> {
            Assert.assertEquals(210, cashSlot.getContents());
        });

        Then("$10 should be dispensed", () -> {
            Assert.assertEquals(10, cashSlot.getContents());
        });

        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("$-50 should be dispensed", () -> {
            Assert.assertEquals(-50, cashSlot.getContents());
        });


    }
}
