import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleTask4 {
    public static void main(String[] args) throws IOException {
        checkGame(5); // Число попыток

    }

    public static int readLn() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strPrompt = reader.readLine();
        int prompt = Integer.parseInt(strPrompt);
        return prompt;

    }

    public static void checkGame(int guessNumb) throws IOException {
        int item = (int) (Math.random() * 11); // Загаданное число
        boolean win = false; // результат игры
        System.out.println("Вам необходимо угадать число. Количество попыток: " + guessNumb);
        System.out.println("Введите число");
        int guessCount;
        for (guessCount = 0; guessCount < guessNumb; guessCount++) {
            int input = readLn();
            if (input > item) {
                System.out.println("Вы не угадали! Загаданное число меньше");
            } else if (input < item) {
                System.out.println("Вы не угадали! Загаданное число больше");
            } else {
                win = true;

                break;
            }

        }
        if (!win) {
            System.out.println("Попытки закончились.");
        } else System.out.println("Вы угадали! Количество попыток: " + (guessCount + 1));
    }
}

