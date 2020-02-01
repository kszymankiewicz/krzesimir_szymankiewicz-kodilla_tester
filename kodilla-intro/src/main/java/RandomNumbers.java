import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        random();
    }

    public static void random() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum <= 5000) {
            int temp = random.nextInt(31);
            numbers.add(temp);
            sum = sum + temp;
            result++;

        }
        min(numbers);
        max(numbers);
    }

    public static void min(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (min > numbers.get(i)) {
                min = numbers.get(i);
            }

        }
        System.out.println(min);
    }

    public static void max(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }

        }
        System.out.println(max);
    }
}



