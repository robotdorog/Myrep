import java.util.ArrayList;

public class Mediana {

    public ArrayList<Integer> difference(ArrayList<Integer> startList) {


        ArrayList<Integer> difference = new ArrayList<>();
        for (int i = 0; i < startList.size(); i++) {

            for (int j = 0; j < startList.size(); j++) {
                int differenceResult = Math.abs(startList.get(j) - startList.get(i));
                System.out.println("Первый элемент: " + startList.get(j) + " Второй элемент: " + startList.get(i));
                System.out.println("Результат вычитания: " + differenceResult);
                if (differenceResult > 0) {
                    difference.add(differenceResult);
                }
            }

        }
        return difference;
    }

    /* Следующий этап разнести в массивы значения модулей разностей по каждому числу. затем посчитать сумму значений этих массивов. и сравнить
    минимальная и будет медианой
     */
}

