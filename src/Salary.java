import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Salary {

    HashMap<String,  Integer> salaryMap = new HashMap<>();

    private int generateSalary() {
        Random random = new Random();
        return (random.nextInt(100 - 25) + 25) * 1000;
    }
    public HashMap<String, Integer> fillIn() {
        salaryMap.put("Иван Петров", generateSalary());
        salaryMap.put("Петр Иванов", generateSalary());
        salaryMap.put("Василий Иванов", generateSalary());
        salaryMap.put("Мария Михайлова", generateSalary());
        salaryMap.put("Елена Белова", generateSalary());
        salaryMap.put("Юлия Ветрова", generateSalary());
        salaryMap.put("Игорь Смирнов", generateSalary());
        salaryMap.put("Екатерина Беглова", generateSalary());
        salaryMap.put("Марина Вересова", generateSalary());
        salaryMap.put("Илья Игорев", generateSalary());

  return salaryMap;  }



    private int findMin() {

        ArrayList<Integer> values = new ArrayList<>(salaryMap.values());
        int smallest = values.get(0);
        int smallest_index = 0;

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) < smallest) {
                smallest = values.get(i);
                smallest_index = i;
            }

        }
    return smallest;}

    private int findMax() {

        ArrayList<Integer> values = new ArrayList<>(salaryMap.values());
        int biggest = values.get(0);
        int biggest_index = 0;

        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) < biggest) {
                biggest = values.get(i);
                biggest_index = i;
            }

        }
        return biggest;}

    public HashMap<Object, Object> checkMinMax (){
        fillIn();
        boolean test = false;
        HashMap<Object, Object> hmMinMax = new HashMap<>();

        for (Map.Entry entry : salaryMap.entrySet()) {

            test = salaryMap.containsValue(findMin());
            System.out.println("Значение тест: " + test);
            if (test) {
             hmMinMax.put(entry.getKey(), entry.getValue());
            }
//            test = false;
//
//            test =salaryMap.containsValue(findMax());
//            if (test == true) {
//              hmMinMax.put(entry.getKey(), entry.getValue());
//            }

        }
    return hmMinMax;

    }



}



