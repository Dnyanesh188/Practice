import java.util.Scanner;

public class Swap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using multiplication and division
        a = a * b; // Step 1: Multiply both numbers and store the result in a
        b = a / b; // Step 2: Divide the new a by b to get the original a in b
        a = a / b; // Step 3: Divide the new a by the new b to get the original b in a

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}
