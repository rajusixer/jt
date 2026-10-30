import java.util.Scanner;

public class CountVowelsUsingCharacterClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch) && isVowel(ch)) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        sc.close();
    }

    public static boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i'
                || lowerCh == 'o' || lowerCh == 'u');
    }
}
