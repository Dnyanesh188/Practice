public class ReplaceWord{

    static void remove(String str, String word){
        String msg[] = str.split(" ");
        String new_str = "";

        for(String words : msg){

            if(!words.equals(word)){
                new_str += words + " ";
            }
        }
        System.out.print(new_str);
    }

    public static void main(String[] args){

        String str = "This is the prepinsta";

        String word = "the";

        ReplaceWord.remove(str, word);
    }
}