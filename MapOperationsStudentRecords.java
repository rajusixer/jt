import java.util.*;

public class MapOperationsStudentRecords {
    public static void main(String[] args) {
        // a) Add items in the map
        Map<Integer, String> studentRecords = new HashMap<>();
        studentRecords.put(1, " Santhosh");
        studentRecords.put(2, "Sayyed ");
        studentRecords.put(3, "Shah");
        studentRecords.put(4, " Afsha ");
        studentRecords.put(5, "Student");
        studentRecords.put(6, " Souleh ");

        System.out.println("Initial Records of a group:");
        System.out.println("Map: " + studentRecords);

        // c) Search specific key, b) remove it if present
        boolean isRollNo136There = studentRecords.containsKey(136);
        if (isRollNo136There) {
            studentRecords.remove(136);
        }
        System.out.println("\nAfter removal of roll no. 136:" + studentRecords);

        // d) Get value of specified key
        System.out.println("\nDisplaying the record of roll no. 137:");
        String studentName = studentRecords.get(137);
        System.out.println(137 + " " + studentName);

        // e) Insert map elements of one map into another map
        Map<Integer, String> newStudentGroup = new TreeMap<>(studentRecords);

        newStudentGroup.remove(133);
        System.out.println("\nTraversing the map after removing roll no. 133 from new group:" + studentRecords);

        // f) Print all key-value pairs
        for (Map.Entry<Integer, String> entry : newStudentGroup.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

    }
}
