public class SimpleTask1 {

    public static void main(String args[]) {
        String str = "";
        System.out.println(invStr(str));
    }

    public static String invStr(String str) {
        int length = str.length();
        int index = length - 3;
        String firstSubstr = "";
        String secondSubstr = "";
        String thirdSubstr = "";
        String fourthSubstr = "";


        if (length > 5) {
            for (int i = 0; i < 3; i++) {
                char currentChar = str.charAt(i);
                firstSubstr += currentChar;
            }
            for (int j = index ; j < length; j++){
                char currentChar = str.charAt(j);
                secondSubstr += currentChar;
            }
            return firstSubstr + secondSubstr;
        }


        else if (length > 1 && length <= 5) {
            for (int i = 0; i < length; i++) {
                char currentChar = str.charAt(i);
                thirdSubstr += currentChar;

            }
            for (int j = 0; j < length ; j++) {
                fourthSubstr += thirdSubstr;
            }
            return fourthSubstr;
        }

        else {
            return "Invalid value";
        }
    }
}