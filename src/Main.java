public class Main {
    public static void main(String[] args) {
        int x = 60, y = 30;
        int result = multiply(x, y);
        System.out.println(result);

        String str = "ciao";
        int num = 8;

        String concatenatedResult = concat(str, num);
        System.out.println(concatenatedResult);

        String[] originalArray = {"uno", "due", "tre", "quattro", "cinque"};
        String newString = "sei";

        String[] resultArray = insertStringAtPosition(originalArray, newString);

        for (String s : resultArray) {
            System.out.println(s);
        }
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static String concat(String str, int num) {
        return str + num;
    }

    public static String[] insertStringAtPosition(String[] array, String str) {
        String[] newArray = new String[6];

        for (int i = 0; i < 3; i++) {
            newArray[i] = array[i];
        }

        newArray[2] = str;

        if (array.length > 3) {
            newArray[3] = array[3];
        }

        if (array.length > 4) {
            newArray[4] = array[4];
        }

        newArray[5] = null;

        return newArray;
    }
}