@FunctionalInterface
interface BuildString {
    public String concatenate(String str1, String str2);
}

public class LambdaConcatenateTwoStrings {
    public static void main(String[] args) {
        BuildString string = (str1, str2) -> str1 + str2;

        String name = string.concatenate("Hello ", "World");

        System.out.println(name);
    }
}
