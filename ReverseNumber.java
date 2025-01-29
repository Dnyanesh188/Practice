import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reverse = 0; // Variable to store the reversed number

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reverse = reverse * 10 + digit; // Add the digit to reverse
            number = number / 10; // Remove the last digit from the number
        }

        // Output the reversed number
        System.out.println("Reversed number: " + reverse);

        scanner.close();
    }
}
