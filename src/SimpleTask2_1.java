import java.util.*;

public class SimpleTask2_1 {


    public static void main(String[] args) {
        System.out.println("Сумма четных цифр числа равна " + inCount(22214));
    }

    public static int inCount(int num) {

        List<Integer> ints = new ArrayList<>(); //Массив в который будем записывать выделенные цифры из числа
        while (num != 0) {
            int n = num % 10; // выделяем по одной цифре с конца числа
            ints.add(n); // добавляем цифру в массив
            num /= 10; // переходим к следующей цифре в числе

        }
        Collections.reverse(ints); // Разворачиваем массив т.к. цифры добавлялись с конца

        int sum = 0;
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {    // Ищем каждый четный участник массива
                sum += ints.get(i); // суммируем четные цифры согласно задания
            }

        }
        return sum;
    }
}


