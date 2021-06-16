import java.util.*;

public class Salary {

    HashMap<String,  Integer> salaryMap = new HashMap<>();
    HashMap<String, Integer> fillSalaryMap = fillIn(salaryMap);

    private int generateSalary() {   //Метод для генерации зарплаты
        Random random = new Random();
        return (random.nextInt(100 - 25) + 25) * 1000;
    }


    private HashMap<String, Integer> fillIn(HashMap<String, Integer> hashMap) {  // Метод для заполнения мапы
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



    private ArrayList<Integer> hashValues  (HashMap<String, Integer> hashArr) {
        hashArr = fillSalaryMap;

        return new ArrayList<>(hashArr.values());
    }


    private ArrayList<String> hashKeys (HashMap<String, Integer> hashArr) {
        hashArr = fillSalaryMap;

        return (ArrayList<String>) new ArrayList(hashArr.keySet());
    }



    public int findMin() {  //Метод поиска минимальной зарплаты

        ArrayList <Integer> arrInt = hashValues(fillSalaryMap);
        int smallest = arrInt.get(0);
        int smallest_index = 0;

        for (int i = 1; i < arrInt.size(); i++) {
            if (arrInt.get(i) < smallest) {
                smallest = arrInt.get(i);
                smallest_index = i;
            }

        }
    return smallest;}

    public int findMax() { //Поиск максимальной зарплаты

        ArrayList<Integer> arrInt = hashValues(fillSalaryMap);
        int biggest = arrInt.get(0);
        int biggest_index = 0;

        for (int i = 1; i < arrInt.size(); i++) {
            if (arrInt.get(i) > biggest) {
                biggest = arrInt.get(i);
                biggest_index = i;
            }

        }
        return biggest;}


}



