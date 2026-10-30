import java.util.*;

public class StringBuilderAppendMultipleStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        System.out.println("Enter Strings to concatenate (type 'exit' to stop).");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            result.append(input).append(" ");
        }

        System.out.println("Concatenated result: " + result.toString().trim());
        sc.close();
    }
}
