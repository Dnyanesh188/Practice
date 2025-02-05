import java.util.Scanner;

public class MissingNumber2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array(N-1)");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter" + n + "numbers from 1 to " + (n+1) + "(one number is missing)");

        int xorAll = 0;
        int xorArr = 0;

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            xorArr ^= arr[i];
        }
        sc.close();

        for(int i = 1; i <= n+1; i++){
            xorAll ^= i;
        }

        int missingNumber = xorAll ^ xorArr;
        System.out.println("Missing number:" + missingNumber);
    }
}