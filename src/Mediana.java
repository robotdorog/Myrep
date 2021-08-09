import java.util.ArrayList;

public class Mediana {

    public int findMedianaNew(int a, int b, int c) {

        int resultA = Math.abs((b - a) + (c - a));
        int resultB = Math.abs((a - b) + (c - b));
        int resultC = Math.abs((a - c) + (b - c));

        if (resultA <= resultB && resultA <= resultC)
            return a;
        else if (resultB <= resultA && resultB <= resultC)
            return b;
        else
            return c;
    }
}