import java.util.*;

public class Salary {

    HashMap<String, Integer> salaryMap = new HashMap<>();
    HashMap<String, Integer> fillSalaryMap = fillIn();
    ArrayList<Integer> arrInt = hashValues();
    ArrayList<String> arrStr = hashKeys();

    private int generateSalary() {   //Метод для генерации зарплаты
        Random random = new Random();
        return (random.nextInt(100 - 25) + 25) * 1000;
    }


    private HashMap<String, Integer> fillIn() {  // Метод для заполнения мапы
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

        return salaryMap;
    }


    private ArrayList<Integer> hashValues() { //Метод получения значений
        HashMap<String, Integer> hashArr = fillSalaryMap;

        return new ArrayList<>(hashArr.values());
    }


    private ArrayList<String> hashKeys() { //Метод получения ключей
        HashMap<String, Integer> hashArr = fillSalaryMap;

        return (ArrayList<String>) new ArrayList(hashArr.keySet());
    }


    public String findMin() {  //Метод поиска минимальной зарплаты

        String resultSmallest;
        int smallest = arrInt.get(0);
        int smallest_index = 0;

        for (int i = 1; i < arrInt.size(); i++) {
            if (arrInt.get(i) < smallest) {
                smallest = arrInt.get(i);
                smallest_index = i;
            }

        }
        resultSmallest = "Самая маленькая ЗП: " + arrStr.get(smallest_index) + " " + arrInt.get(smallest_index);
        return resultSmallest;
    }


    public String findMax() { //Поиск максимальной зарплаты

        String resultBiggest;
        int biggest = arrInt.get(0);
        int biggest_index = 0;

        for (int i = 1; i < arrInt.size(); i++) {
            if (arrInt.get(i) > biggest) {
                biggest = arrInt.get(i);
                biggest_index = i;
            }

        }
        resultBiggest = "Самая большая ЗП: " + arrStr.get(biggest_index) + " " + arrInt.get(biggest_index);
        return resultBiggest;
    }


    private int averageValue() {  // Поиск средней ЗП
        int averageSalary = 0;
        for (int i : arrInt) {
            averageSalary = averageSalary + i;
        }
        averageSalary = averageSalary / arrInt.size();
        return averageSalary;
    }

    public ArrayList<String> moreThanAverage() { // Список ЗП > средней
        ArrayList<String> listMoreThanAverage = new ArrayList<>();
        for (int i = 0; i < arrInt.size(); i++) {
            if (arrInt.get(i) > averageValue()) {
                listMoreThanAverage.add(arrStr.get(i));
            }


        }
        return listMoreThanAverage;
    }

    private ArrayList<Integer> taxSalary() { // Налог по каждой ЗП
        ArrayList<Integer> listTaxSalary = new ArrayList<>();
        for (int i : arrInt) {
            int taxSalary;
            taxSalary = (i * 13) / 100;
            listTaxSalary.add(taxSalary);

        }
        return listTaxSalary;
    }

    private ArrayList<Integer> salaryAfterTax() { // ЗП на руки. После вычета налога
        ArrayList<Integer> listSalaryAfterTax = new ArrayList<>();
        for (int i = 0; i < arrInt.size(); i++) {
            int salaryAfterTax;
            salaryAfterTax = arrInt.get(i) - taxSalary().get(i);
            listSalaryAfterTax.add(salaryAfterTax);
        }
        return listSalaryAfterTax;
    }


    public void taxResult() { // Вывод по заданию 3
        String strTaxResult;
        for (int i = 0; i < arrInt.size(); i++) {
            strTaxResult = ("ФИО: " + arrStr.get(i) + " На руки: " + salaryAfterTax().get(i) + " Налог: " + taxSalary().get(i));
            System.out.println(strTaxResult);
        }
    }
}



