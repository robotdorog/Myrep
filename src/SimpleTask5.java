import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimpleTask5 {
    public static void main(String[] args) {
        System.out.println('\u0041');
        System.out.println(generate(10));
    }

    public static String generate(int lengthPass) {

        Random random = new Random();
        String substr;
        String result = "";
        int randomInt;
        List<Character> charArray = new ArrayList<>();

        for (int i = 0; i < lengthPass; i++) {
            randomInt = random.nextInt(100);
            StringBuilder myStr = new StringBuilder();
//            substr = "\\u00" + randomInt;
            substr = Character.toString((char)randomInt);
            result += substr;
//            for (int j = 0; j < result.length(); j ++) {
//
//                char currentChar = result.charAt(i);
//                result += currentChar;
//            }

        }
       return result;
    }
}
