import java.util.Scanner;

public class NonRepeatingCharacter{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string :");
        String inputstr = sc.nextLine();

        boolean flag = true;

        for(char i : inputstr.toCharArray())
        {
            if(inputstr.indexOf(i) == inputstr.lastIndexOf(i)){
                System.out.println("First non-repeating character is: "+ i);
                flag = false;
                break;
            }
        }

        if(flag)
             System.out.println("There is no non repeating character in input string");
    }
}