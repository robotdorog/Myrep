import java.util.ArrayList;
import java.util.List;

public class SimpleTask3_1 {

    public static void main(String[] args) {
        System.out.println(zeroOne(5));
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

        for (int i = 1; i < arraySize; i++) {
            if (i % 2 != 0)
                list.add(i);

        }
        return list;
    }

}