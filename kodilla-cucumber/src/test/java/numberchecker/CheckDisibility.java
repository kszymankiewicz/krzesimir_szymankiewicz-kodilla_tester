package numberchecker;

import io.cucumber.java8.En;
import org.junit.Assert;


public class CheckDisibility implements En {

    private int nr;
    private String answer;

    public CheckDisibility() {

        Given("the number is 3", () -> {
            this.nr = 3;
        });
        Given("the number is 5", () -> {
            this.nr = 5;
        });
        Given("the number is 15", () -> {
            this.nr = 15;
        });
        Given("the number is 6", () -> {
            this.nr = 6;
        });
        Given("the number is -6", () -> {
            this.nr = -6;
        });


        When("I ask whether it's divisible by {int}", (Integer) -> {
            NumberChecker numberChecker = new NumberChecker();
            this.answer = numberChecker.checkNumber(this.nr);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }

}