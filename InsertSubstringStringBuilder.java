public class InsertSubstringStringBuilder {
    public static void main(String args[]) {
        String og = "Hello World";
        StringBuilder stringBuilder1 = new StringBuilder(og);
        String sub = "Chaotic";

        stringBuilder1.insert(6, sub);
        String result = stringBuilder1.toString();

        System.out.println("Original String: " + og);
        System.out.println("After Insertion: " + result);
    }
}
