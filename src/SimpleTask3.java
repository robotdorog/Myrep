import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleTask3 {

    public static void main(String[] args) {
        System.out.println(zeroOne(10));
        System.out.println(even(10));
        System.out.println(zeroOneRandom(10));
    }

    public static List<Integer> zeroOne(int arraySize) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            list.add(0);
            list.add(1);

        }
        return list;
    }

    public static List<Integer> even(int arraySize) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            if (i % 2 != 0)
                list.add(i);
        }
        return list;
    }

    public static List<Integer> zeroOneRandom(int arraySize) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            list.add(1);
            list.add(random.nextInt(2));
        }

        return list;
    }
}
