import java.util.Scanner;

public class RemoveSpecialCharacter {
    // Function to remove special characters
    public static void removeSpecialCharacter(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);  // Corrected method name
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                sb.append(ch);
            }
        }

        System.out.println("String after removing special characters: " + sb.toString());
    }

    // Corrected main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        scanner.close();

        removeSpecialCharacter(s);  // Corrected method call
    }
}
