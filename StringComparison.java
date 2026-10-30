import java.util.*;

public class StringComparison {
    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "Hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("ell"));

    }
}
