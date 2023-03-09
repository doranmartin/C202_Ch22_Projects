import java.util.ArrayList;
import java.util.Scanner;

public class Exercise22_05 {
    public static void main(String[] args) {
        System.out.print("Enter a series of numbers ending with 0: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<>();
        int sentinel = scanner.nextInt();

        while (sentinel != 0) {
            inputArray.add(sentinel);
            sentinel = scanner.nextInt();
        }

        int start = 0;
        int currentLength, maxLength, currentNumber, maxNumber, index;
        currentLength = maxLength = 1;
        currentNumber = maxNumber = inputArray.get(0);
        index = 0;

        for (int i = 1; i < inputArray.size(); i++) {
            if (inputArray.get(i-1) == inputArray.get(i)) {
                currentLength++;
                currentNumber = inputArray.get(i);
            }
            else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxNumber = currentNumber;
                index = i - currentLength + 1;
            }
        }

        System.out.printf(
                "\nThe longest same number sequence starts at index %d with %d values of %d",
                index, maxLength, maxNumber);
    }
}
