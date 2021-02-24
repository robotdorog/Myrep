import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Result {
    private final int even;
    private final int uneven;
    public Result(int even, int uneven) {
        this.even = even;
        this.uneven = uneven;
    }

    public int getEven() {
        return even;
    }

    public int getUneven() {
        return uneven;
    }
}

public class SimpleTask2_2 {
    public static void main(String[] args) {
        int number = 1234567;
        Result result = makeResult(number);
        System.out.println("Четные: " + result.getEven());
        System.out.println("Нечентные: " + result.getUneven());

    }


    public static Result makeResult(int number) {
        List<Integer> list = convertIntToList(number);
        return countEvenUneven(list);
    }

    public static List<Integer> convertIntToList(int num) {
        List<Integer> ints = new ArrayList<>();

        while (num != 0) {
            int n = num % 10;
            ints.add(n);
            num /= 10;

        }
        return ints;
    }

    public static Result countEvenUneven(List<Integer> ints) {
        int even = 0;
        int uneven = 0;

        for (int i: ints) {
            if (i % 2 == 0) {
                even++;
            }
            else {
                uneven++;
            }


        }
        return new Result(even, uneven);


    }

}











