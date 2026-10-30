import java.nio.charset.StandardCharsets;
import java.util.*;

public class UnicodeEncodeDecode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Unicode code points:");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character: " + ch + " Code point: " + (int) ch);
        }

        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("String in UTF-8 byte encoding:");
        for (byte b : bytes) {
            System.out.println("Byte: " + b);
        }

        String decoded = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("Decoded string: " + decoded);

        sc.close();
    }
}
