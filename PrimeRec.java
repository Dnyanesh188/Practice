import java.util.Scanner;

public class PrimeRec{
    static boolean isPrime(int num, int divisor){

        if(divisor > Math.sqrt(num)){
            return true;
        }

        if(num % divisor == 0){
            return false;
        }
        return isPrime(num,divisor + 1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();
        scanner.close();

        if(num < 2){
            System.out.println(num+ " is not a prime number");
        }else{
            boolean result = isPrime(num,2);
            if(result){
                System.out.println(num + " is a prime number");
            }else{
                System.out.println(num + " is not a prime number");
            }
        }
    }
}