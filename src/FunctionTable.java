import java.util.ArrayList;
import java.util.List;

public class FunctionTable {

    double start = -5;
    double end = 5;
    double y = 0;

    public void result() {
        for (double x = start; x <= end; x += 0.5) {
            double pow = Math.pow(x, 2);
            y = 5 - pow / 2;
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
