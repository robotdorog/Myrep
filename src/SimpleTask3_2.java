import java.util.ArrayList;
import java.util.List;

public class SimpleTask3_2 {

    public static void main(String[] args) {
        System.out.println(list(10));
    }

    public static List<Integer> list(int arraySize) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < arraySize; i++) {
            if (i % 2 != 0)
            list.add(i);

        }
        return list;
    }
}
