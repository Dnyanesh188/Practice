import java.util.Scanner;

public class RemoveBrackets{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        String result = s.replaceAll("[() {}]","");
        System.out.println("Expression without brackets:"+result);
    }
}