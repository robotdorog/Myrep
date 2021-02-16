import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTask2_2 {
    public static void main(String[] args) {

        System.out.println("Количество нечетных цифр в числе: " + first(count(12345)));
        System.out.println("Количество четных цифр в числе: " + second(count(12345)));

    }

    public static List<Integer> count(int num) { // Переносим цифры из числа в массив
        List<Integer> ints = new ArrayList<>();

        while (num != 0) {
            int n = num % 10;
            ints.add(n);
            num /= 10;
        }
        Collections.reverse(ints);

        return ints;
    }

    public static int first(List<Integer> ints) { //Считаем количество нечетных цифр в числе

        int i = 0;
        int odd = 0;

        while (i != ints.size()) {
            if (ints.get(i) % 2 != 0) {
                odd++;
            }
            i++;
        }
        return odd;
    }

    public static int second(List<Integer> ints) { //Считаем количество нечетных цифр в числе

        int i = 0;
        int even = 0;

        while (i != ints.size()) {
            if (ints.get(i) % 2 == 0) {
                even++;
            }
            i++;
        }
        return even;
    }
}

