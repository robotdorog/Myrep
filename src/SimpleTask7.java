import java.util.ArrayList;

public class SimpleTask7 {

    public static void main(String[] args) {

        ArrayList<Integer> myList1 = new ArrayList<>();
        myList1.add(2);
        myList1.add(5);
        myList1.add(3);

        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(2);
        myList2.add(2);
        myList2.add(1);


        Mediana item = new Mediana();
        System.out.println("Новая медиана равна: " + item.findMedianaNew(2, 5, 3));
        System.out.println("Новая медиана равна: " + item.findMedianaNew(2, 2, 1));
    }
}