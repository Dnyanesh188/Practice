import java.util.Scanner;

public class PerfectNumber {
    // Function to check if a number is Perfect
    public static boolean isPerfect(int num) {
        if (num <= 1) return false; // Perfect numbers must be greater than 1

        int sum = 0;

        // Find divisors from 1 to num/2
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) { // If i is a divisor
                sum += i;
            }
        }

        return sum == num; // Compare sum of divisors with original number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}
