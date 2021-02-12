public class SimpleTask1 {

    public static void main( final String args[]) {
        String str = "Hello world";
        System.out.println(invStr(str));
    }

    public static  String invStr(String str) {
        final int length = str.length(); // Длина строки

        if (length > 5) {
            return str.substring(0, 3) + str.substring(length - 3, length);

        }

            return str.substring(0,1).repeat(length);
    }
}
