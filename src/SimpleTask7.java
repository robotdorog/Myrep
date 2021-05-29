import java.util.ArrayList;

public class SimpleTask7 {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(5);
        myList.add(9);

        Mediana item = new Mediana();
        System.out.println(item.difference(myList));
    }
}