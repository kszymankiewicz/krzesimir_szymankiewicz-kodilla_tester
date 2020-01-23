import java.util.Random;

public class RandomNumbers { public static void main(String[] args) {
    int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
}

  public int randomNumber(int numbers) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        while (sum >= 5000) {
            int temp = random.nextInt(29);
            sum = sum + temp;
            result++;


        }
        return result;
    }


}
