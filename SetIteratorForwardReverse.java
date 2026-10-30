import java.util.*;

public class SetIteratorForwardReverse {
    public static void main(String[] args) {
        Set<String> languageSet = new HashSet<>();
        languageSet.add("Python");
        languageSet.add("Java");
        languageSet.add("Node.js");
        languageSet.add("Programming with C++");

        System.out.println("Traversing in forward direction:");
        Iterator<String> itr = languageSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Copy Set into a List so it can be reversed
        List<String> languageList = new ArrayList<>(languageSet);
        Collections.reverse(languageList);

        System.out.println("\nTraversing in reverse direction:");
        for (String language : languageList) {
            System.out.println(language);
        }

    }
}
