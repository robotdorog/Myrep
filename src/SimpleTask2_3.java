import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleTask2_3 {

    public static void main(String[] args) {
        System.out.println("Число наоборот: " + count(123456));
    }

    public static int count(int num) {
        List<Integer> inst = new ArrayList<Integer>();

        while (num != 0) {
            int n = num % 10;
            inst.add(n);
            num /= 10;
        }

        StringBuilder str = new StringBuilder();

        for (int i : inst) str.append(i);
        return Integer.parseInt(str.toString());
    }
}
