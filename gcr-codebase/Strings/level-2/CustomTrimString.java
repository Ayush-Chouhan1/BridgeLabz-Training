import java.util.Scanner;

public class CustomTrimString {

    // method to find trim indexes
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length()-1;

        while (text.charAt(start) == ' ') {
            start++;
        }

        while (text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare strings
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner sc = new Scanner(System.in);
		
		// taking input from user
        System.out.println("Enter String");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrim = createSubstring(text, indexes[0], indexes[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom Trim = " + customTrim );
        System.out.println("Built-in Trim = " + builtInTrim );
        System.out.println("Result Same = " +compareStrings(customTrim, builtInTrim));
    }
}
