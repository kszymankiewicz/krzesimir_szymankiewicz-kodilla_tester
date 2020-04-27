package numberchecker;

public class NumberChecker {
    public String checkNumber(int nr) {
        if (nr % 3 == 0 && nr % 5 == 0) {
            return "FizzBuzz";
        } else if (nr % 5 == 0) {
            return "Buzz";
        } else if (nr % 3 == 0) {
            return "Fizz";
        }
        else return "Nope";
    }
}
