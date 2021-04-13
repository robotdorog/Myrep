import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleTask4 {
    public static void main(String[] args) throws IOException {
        checkGame(5);

    }

    public static void checkGame(int guessNumb) throws IOException {
        //int item = 6;
        int item = (int) (Math.random() * 11);

        System.out.println("Вам необходимо угадать число за " + guessNumb + " попыток");
        for (int guessCount = 0; guessCount <= guessNumb; guessCount++) {

            if (guessCount == guessNumb) {
                System.out.println("");
                System.out.println("Попытки закончились");
                break;
            } else {
                System.out.println("Введите число");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String strPrompt = reader.readLine();
                int prompt = Integer.parseInt(strPrompt);

                if (prompt == item) {
                    System.out.println("Вы угадали! Число попыток " + (guessCount + 1));
                    break;
                } else if (prompt < item) {
                    System.out.println("Вы не угадали! Загаданное число больше");
                    System.out.println("Осталось попыток: " + (guessNumb - guessCount - 1));

                } else {
                    System.out.println("Вы не угадали! Загаданное число меньше");
                }

            }
        }
    }
}