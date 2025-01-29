import java.util.Scanner;

public class PrimeNumbers {
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisor found, it's prime
    }

    // Function to print all prime numbers from 1 to N
    public static void printPrimes(int N) {
        System.out.print("Prime numbers from 1 to " + N + " are: ");
        for (int i = 1; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        printPrimes(N);
        sc.close();
    }
}
