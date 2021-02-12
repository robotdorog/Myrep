public class SimpleTask1 {

    public static void main( final String args[]) {
        String str = "Hello world";
        System.out.println(invStr(str));
    }

    public static  String invStr(String str) {
        final int length = str.length(); // Длина строки
        final String firstResult; // Результат при условии длины строки больше 5
        final String firstChar;
        final String secondResult; // Результат при условии длины строки меньше или равно 5
        if (length > 5) {
            firstResult = str.substring(0, 3) + str.substring(length - 3, length);
            return firstResult;
        }
            firstChar = str.substring(0,1);
            secondResult = firstChar.repeat(length);


        return secondResult;
    }
}
