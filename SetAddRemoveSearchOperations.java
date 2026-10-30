import java.util.*;

public class SetAddRemoveSearchOperations {
    public static void main(String[] args) {
        int search_item = 4;

        // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();

        // a) Add elements to set1
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(6);
        System.out.println("Set1: " + set1);

        // d) Search the specified item in the set
        boolean result = set1.contains(search_item);
        System.out.println("is the search item exist in set1 " + result);

        // c) Remove the item from the set if it exists
        if (result) {
            set1.remove(search_item);
        }
        System.out.println("After removing the search item display the set1 " + set1);

        // b) Insert items of one set into another set
        Set<Integer> set2 = new HashSet<>(set1);

        Iterator<Integer> itr = set2.iterator();
        System.out.println("Set2:regular Traversing");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
