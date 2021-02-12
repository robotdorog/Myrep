public class SimpleTask1 {

    public static void main(final String args[]) {
        String str = "";
        System.out.println(invStr(str));
    }

    public static String invStr(String str) {
        final int length = str.length(); // Длина строки

        if (length > 5) {
            return str.substring(0, 3) + str.substring(length - 3, length);

        } else if (length > 1) {
            return str.substring(0, 1).repeat(length);
        }
      else {
          throw new IllegalArgumentException("String can't be empty");
        }
    }
}