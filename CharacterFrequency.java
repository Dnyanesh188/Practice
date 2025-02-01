import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        HashMap<Character,Integer> frequencyMap = new HashMap <>();

        for(char ch : str.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0) + 1);
        }

        System.out.println("Character frequencies:");
        for(char ch : frequencyMap.keySet()){
            System.out.println(ch + " : " + frequencyMap.get(ch));
        }
    }
}