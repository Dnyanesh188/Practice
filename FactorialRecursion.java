import java.util.Scanner;

public class FactorialRecursion{
     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Factorial is not defined for negative number");
        }else{
            long factorial = findfactorial(number);
            System.out.println("Factorial of "+ number + " is " + factorial);
        }
        scanner.close();
     }

     public static long findfactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * findfactorial(n-1);
     }
}