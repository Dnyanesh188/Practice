// import java.util.Scanner;

// public class RemoveSpaces{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the Sentence");
//         String s = sc.nextLine();

//         char [] c = s.toCharArray();
//         StringBuffer sb = new StringBuffer();

//         for(int i = 0; i < c.length; i++){
//             if((c[i] != ' ') && (c[i] != '\t')){
//                 sb.append(c[i]);
//             }
//         }
//         System.out.println("String after removing spaces : "+sb);
//     }
// }

import java.util.Scanner;

public class RemoveSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence");
        String s = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        
        String[] s1 = s.split("[\\s]");

        for(String string : s1){
            sb.append(string);
        }
        System.out.println(sb);
    }
}