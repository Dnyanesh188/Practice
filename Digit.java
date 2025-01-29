import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Digits of the number: ");

        // Logic to print digits
        if (number == 0) {
            System.out.println(0);
        } else {
            // Handle negative numbers
            if (number < 0) {
                System.out.print("- ");
                number = -number;
            }

            // Reverse the number to print digits in order
            int reversed = 0;
            while (number > 0) {
                reversed = reversed * 10 + number % 10;
                number /= 10;
            }

            // Print the digits of the reversed number
            while (reversed > 0) {
                System.out.print(reversed % 10 + " ");
                reversed /= 10;
            }
        }

        scanner.close();
    }
}
