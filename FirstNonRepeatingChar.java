import java.util.Scanner;

public class FirstNonRepeatingChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        sc.close();

        int [] freq = new int[256];

        for(char ch : str.toCharArray()){
            freq[ch]++;
        }

        for(char ch : str.toCharArray()){
            if(freq[ch] == 1){
                System.out.println("First non-repeating character : " + ch);
                return;
            }
        }
        System.out.println("No no-repeating character found");
    }
}