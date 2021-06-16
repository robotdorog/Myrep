public class SimpleTask8 {

    public static void main(String[] args) {
        Salary item = new Salary();
//        System.out.println("Список сотрудников: " + item.fillIn());
        System.out.println("ЗП: " + item.fillSalaryMap);
        System.out.println(item.findMin());
        System.out.println(item.findMax());
    }
}
