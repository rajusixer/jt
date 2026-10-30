public class SplitParagraphIntoSentences {
    public static void main(String args[]) {
        String paragraph = "Java is easy to learn. Do you like Java? It is interesting!";
        String[] sentences = paragraph.split("[.?!]");

        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }

    }
}
