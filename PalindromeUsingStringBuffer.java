import java.util.*;

public class PalindromeUsingStringBuffer {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();

        if (str.equalsIgnoreCase(sb.toString())) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }

        sc.close();
    }
}
