public class SimpleTask8 {

    public static void main(String[] args) {
        Salary item = new Salary();
        System.out.println("Список сотрудников: " + item.fillIn());
        System.out.println("Минимальная и Максимальная ЗП: " + item.checkMinMax());
    }
}
