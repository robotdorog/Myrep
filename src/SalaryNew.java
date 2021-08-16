import java.util.*;

public class SalaryNew {
    HashMap<String, Integer> salaryMap;

    /**
     * Конструктор. Заполнение HashMap
     */
    public SalaryNew() {
        salaryMap = new HashMap();
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
    }

    /**
     * Генерация ЗП
     *
     * @return
     */
    private int generateSalary() {
        Random random = new Random();
        return (random.nextInt(75) + 25) * 1000;
    }

    /**
     * Поиск сотрудника с минимальной ЗП
     *
     * @return
     */

    public String salaryMinValue() {

        int min = Integer.MAX_VALUE;
        String minSalaryName = "";

        for (String name : salaryMap.keySet()) {
            if (salaryMap.get(name) < min) {
                min = salaryMap.get(name);
                minSalaryName = name;
            }
        }

        return "Минимальная ЗП у сотрудника: " + minSalaryName + " равна: " + min;
    }

    /**
     * Поиск сотрудника с максимальной ЗП
     *
     * @return
     */

    public String salaryMaxValue() {

        int max = Integer.MIN_VALUE;
        String maxSalaryName = "";

        for (String name : salaryMap.keySet()) {
            if (salaryMap.get(name) > max) {
                max = salaryMap.get(name);
                maxSalaryName = name;
            }
        }

        return "Максимальная ЗП у сотрудника: " + maxSalaryName + " равна: " + max;
    }

    /**
     * Поиск средней ЗП среди сотрудников
     *
     * @return
     */
    public String averageSalary() {

        int amount = 0;
        for (int salary : salaryMap.values()) {
            amount += salary;
        }
        int average = amount / salaryMap.size();
        return "Средняя ЗП среди сотрудников: " + average;
    }

    /**
     * Список ЗП сотрудников после вычета налогов
     *
     * @return
     */
    public ArrayList<String> taxSlary() {
        ArrayList<String> result = new ArrayList<>();
        for (String name : salaryMap.keySet()) {
            int taxSalary;
            int afterTax;
            taxSalary = (salaryMap.get(name) / 100) * 13;
            afterTax = salaryMap.get(name) - taxSalary;
            result.add("Сотрудник: " + name + "." + " ЗП после вычета налога: " + afterTax);

        }
        return result;
    }
}
