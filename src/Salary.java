import java.util.HashMap;
import java.util.Random;

public class Salary {

    HashMap<String,  Integer> salaryMap = new HashMap<>();

    private int generateSalary() {
        Random random = new Random();
        return (random.nextInt(100 - 25) + 25) * 1000;
    }
    public HashMap<String, Integer> fillIn(HashMap<String, Integer> salaryMap) {
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

}
