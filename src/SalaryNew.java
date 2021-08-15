import java.util.*;

public class SalaryNew {
    HashMap<String, Integer> salaryMap = new HashMap();

    /**
     * Конструктор. Заполнение HashMap
     */
    public SalaryNew() {

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
        String maxSalaryEmployee = "";
        for (int i : salaryMap.values()) {
            if (i < min) {
                min = i;
            }
        }

        for (String s : salaryMap.keySet()) {
            if (salaryMap.get(s) == min) {
                maxSalaryEmployee = s;
            }
        }
        return "Минимальная ЗП у сотрудника: " + maxSalaryEmployee + " равна: " + min;

    }

    /**
     * Поиск сотрудника с максимальной ЗП
     *
     * @return
     */
    public String salaryMaxValue() {

        int max = Integer.MIN_VALUE;
        String maxSalaryEmployee = "";
        for (int i : salaryMap.values()) {
            if (i > max) {
                max = i;
            }
        }
        for (String s : salaryMap.keySet()) {
            if (salaryMap.get(s) == max) {
                maxSalaryEmployee = s;
            }
        }
        return "Максимальная ЗП у сотрудника: " + maxSalaryEmployee + " равна: " + max;
    }

    /**
     * Поиск средней ЗП среди сотрудников
     *
     * @return
     */
    public String averageSalary() {

        int amount = 0;
        for (int i : salaryMap.values()) {
            amount += i;
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
        for (String s : salaryMap.keySet()) {
            int taxSalary;
            int afterTax;
            taxSalary = (salaryMap.get(s) * 13) / 100;
            afterTax = salaryMap.get(s) - taxSalary;
            result.add("Сотрудник: " + s + "." + " ЗП после вычета налога: " + afterTax);

        }
        return result;
    }

}
