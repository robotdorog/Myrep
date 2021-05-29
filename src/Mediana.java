import java.util.ArrayList;

public class Mediana {

public ArrayList<Integer> difference (ArrayList<Integer> startList) {

    int lenght =startList.size();
    ArrayList<Integer> difference = new ArrayList<>();
     for (int i = 0; i < lenght; i++) {

        int differenceResult = startList.get(i) - startList.get(i);
         difference.add(differenceResult);

    }
return difference;
}

}

