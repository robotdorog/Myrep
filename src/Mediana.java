import java.util.ArrayList;

public class Mediana {

    public ArrayList<Integer> difference(ArrayList<Integer> diffList) {


//        ArrayList<Integer> difference = new ArrayList<>();
        ArrayList<Integer> diffSumArr = new ArrayList<>();
        int diffSum = 0;

        for (int i = 0; i < diffList.size(); i++) {

            for (int j = 0; j < diffList.size(); j++) {
                int differenceResult = Math.abs(diffList.get(j) - diffList.get(i));
//                System.out.println("Первый элемент: " + diffList.get(j) + " Второй элемент: " + diffList.get(i));
//                System.out.println("Результат вычитания: " + differenceResult);
                if (differenceResult > 0) {
//                    difference.add(differenceResult);
                    diffSum += differenceResult;

                }

            }
            diffSumArr.add(diffSum);
            diffSum = 0;

        }

        return diffSumArr;
    }

    /* Следующий этап разнести в массивы значения модулей разностей по каждому числу. затем посчитать сумму значений этих массивов. и сравнить
    минимальная и будет медианой
     */


    public int findSmallest(ArrayList<Integer> outOfMedianaList) {

        ArrayList<Integer> resultList = difference(outOfMedianaList);

        int smallest = resultList.get(0);
        int smallest_index = 0;

        for (int i = 1; i < resultList.size(); i++) {

            if (resultList.get(i) < smallest) {
                smallest = resultList.get(i);
                smallest_index = i;
            }
        }

        return smallest_index;
    }


    public int findMediana(ArrayList<Integer> startList) {

        int smallest_index = findSmallest(startList);

        return startList.get(smallest_index);
    }

}
