import java.util.Scanner;

public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        int originalNum = num;  // Store the original number
        int reversedNum = 0;
        
        // Reverse the number
        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reversedNum = reversedNum * 10 + digit;  // Add the digit to reversedNum
            num /= 10;  // Remove the last digit
        }
        
        // Check if the original number and the reversed number are the same
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        
        scanner.close();
    }
}
