public class SimpleTask8 {

    public static void main(String[] args) {
        Salary item = new Salary();
        System.out.println("ЗП: " + item.fillSalaryMap);
        System.out.println("");
        System.out.println(item.findMin());
        System.out.println("");
        System.out.println(item.findMax());
        System.out.println("");
        System.out.println("Список сотрудников с ЗП выше средней: " + item.moreThanAverage());
        System.out.println("");
        item.taxResult();
    }
}
