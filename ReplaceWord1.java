public class ReplaceWord1{

    public static void main(String[] args){

        String str = "This is the prepinsta";

        String word = "the";

        str = str.replaceAll("the", "");

        str = str.trim();

        System.out.print(str);
    }
}