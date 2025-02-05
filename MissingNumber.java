import java.util.Scanner;

public class MissingNumber{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array :");
        int n = sc.nextInt(); 

        int [] arr = new int[n];
        System.out.println("Enter" + n + "numbers from 1 to " + (n+1) + "(one number is missing)");
        int actualSum = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }
        sc.close();

        int expectedSum = (n+1) * (n+2)/2;
        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number : " + missingNumber);
    }
}