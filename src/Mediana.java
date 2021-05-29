import java.util.ArrayList;

public class Mediana {

    public ArrayList<Integer> difference(ArrayList<Integer> startList) {


        ArrayList<Integer> difference = new ArrayList<>();
        for (int i = 0; i < startList.size() - 1; i++) {

            for (int j = i; j < startList.size() - 1; j++) {
                int differenceResult = startList.get(j + 1) - startList.get(i);
                System.out.println("Первый элемент: " + startList.get(j + 1) + " Второй элемент: " + startList.get(i));
                System.out.println("Результат вычитания: " + differenceResult);
                difference.add(differenceResult);

            }

        }
        return difference;
    }

}

