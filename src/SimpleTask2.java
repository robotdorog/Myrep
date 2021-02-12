import javax.sound.midi.Soundbank;

public class SimpleTask2 {
    public static void main(String[] args) {
        System.out.println(inCount(1234));
    }

    public static int inCount(int num) {
        int sum = 0;

        for (int i = 1; i < 5; i++) {
                System.out.println("i = " + i);
                int n = num % 10;
                System.out.println("value = " + n);
                num = num / 10;


                if (i % 2 == 0) {
                    sum =+ n;
                }



        }
                return sum;
    }
}