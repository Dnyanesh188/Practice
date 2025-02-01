import java.util.Scanner;
public class CountString{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the String :");
        String s = sc.nextLine();
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sum += (s.charAt(i) - '0');
            }
        }
        System.out.println("Sum of all digits " + sum);
    }
}