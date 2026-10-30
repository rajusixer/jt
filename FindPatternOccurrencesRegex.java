import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindPatternOccurrencesRegex {
    public static void main(String args[]) {
        String input = "abcabcababcdab";
        String regex = "ab";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println("Pattern found at position: " + matcher.start());
        }

    }
}
