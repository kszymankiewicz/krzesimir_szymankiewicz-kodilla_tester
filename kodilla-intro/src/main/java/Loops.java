public class Loops {
   //public static void main(String[] args) {


  // }
//kazde wykonanie zadania to iteracja | pętla "for"  (wyrażenie_początkowe; wyrażenie_warunkowe; wyrażenie_końcowe){}
        //String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
/*
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        } //dekrementowanie - zmniejszanie o 1
 */


        public int sumNumbers(int[] numbers) {
            int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }


    }
