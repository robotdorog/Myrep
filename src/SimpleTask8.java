public class SimpleTask8 {

    public static void main(String[] args) {
        SalaryNew item = new SalaryNew();

        System.out.println(item.salaryMap.toString());
        System.out.println(item.salaryMinValue());
        System.out.println(item.salaryMaxValue());
        System.out.println(item.averageSalary());
        System.out.println(item.taxSlary());

    }
}
