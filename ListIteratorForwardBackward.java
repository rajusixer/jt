import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public final class ListIteratorForwardBackward {
    public static void main(String[] args) {
        // Create fixed-size list
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        // Obtain iterator for forward & backward traversal
        ListIterator<Integer> numIterator = numList.listIterator();

        // Forward Direction Iteration
        System.out.println("Forward Direction Iteration=");
        while (numIterator.hasNext()) {
            System.out.println(numIterator.next());
        }

        // Backward Direction Iteration
        System.out.println("Backward Direction Iteration=");
        while (numIterator.hasPrevious()) {
            System.out.println(numIterator.previous());
        }

    }
}
