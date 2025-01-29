import java.util.Scanner;

public class PrimeFactorCheck {
    public static void printPrimeFactors(int num) {
        System.out.print("Prime factors of " + num + " are: ");

        // Check for the number of 2s
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        // Check for odd factors from 3 to sqrt(num)
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        // If num is still greater than 2, then it is prime
        if (num > 2) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        printPrimeFactors(num);
        sc.close();
    }
}
