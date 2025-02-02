import java.util.*;

public class Anagram{
    public static boolean isAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second string : ");
        String str2 = sc.nextLine();
        sc.close();

        if(isAnagram(str1,str2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }
}