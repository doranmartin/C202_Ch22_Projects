import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise22_01 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        int start = 0;
        String current, longest;
        current = "";
        longest = "";

        for (int i = 1; i < text.length(); i++) {

            if (text.charAt(i-1) >= text.charAt(i)) {
                current = text.substring(start, i);
                start = i;
            }
            else if (i == text.length() - 1) {
                current = text.substring(start);
            }

            if (current.length() > longest.length()) {
                longest = current;
            }

        }

        System.out.println(longest);
    }
}