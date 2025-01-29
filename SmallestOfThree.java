import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();

        // Find the smallest number using Math.min()
        int smallest = Math.min(a, Math.min(b, c));

        // Output the smallest number
        System.out.println("The smallest of the three numbers is: " + smallest);

        scanner.close();
    }
}
