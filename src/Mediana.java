import java.util.ArrayList;

public class Mediana {

    private ArrayList<Integer> difference(ArrayList<Integer> diffList) {  // 1. Ищем модуль разницы чисел в списке 2. Находим сумму п.1 для каждого числа и добавляем в массив

        int diffSum = 0;
        ArrayList<Integer> diffSumArr = new ArrayList<>();


        for (int i = 0; i < diffList.size(); i++) {

            for (int j = 0; j < diffList.size(); j++) {
                int differenceResult = Math.abs(diffList.get(j) - diffList.get(i));
                if (differenceResult > 0) {
                    diffSum += differenceResult;
                }
            }
            diffSumArr.add(diffSum);
            diffSum = 0;
        }
        return diffSumArr;
    }

    private int findSmallest(ArrayList<Integer> outOfMedianaList) {   // Находим минимальное значение из  списка

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

    public int findMediana(ArrayList<Integer> startList) { // Находим медиану из списка
        int smallest_index = findSmallest(startList);
        return startList.get(smallest_index);
    }


    public int findMedianaNew(int a, int b, int c) {

        int resultA = Math.abs((b - a) + (c - a));
        int resultB = Math.abs((a - b) + (c - b));
        int resultC = Math.abs((a - c) + (b - c));

        if ( resultA < resultB && resultA < resultC)
            return a;
        else if (resultB < resultA && resultB < resultC)
            return b;
        else
            return c;








    }

}