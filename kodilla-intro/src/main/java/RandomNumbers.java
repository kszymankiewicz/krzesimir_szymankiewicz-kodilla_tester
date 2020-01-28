import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {


        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum <= 5000) {
            int temp = random.nextInt(29);
            sum = sum + temp;
            result++;
            System.out.println(result);
        }
        int max =0;
        for (int i=0; i<30; i++) {
            if (random[i] + result > max) {
                max = sum + result;

            }
        }
    }
}




