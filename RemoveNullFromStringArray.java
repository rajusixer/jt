import java.util.*;

public class RemoveNullFromStringArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("null")) {
                arr[i] = null;
            } else {
                arr[i] = input;
            }
        }

        int count = 0;
        for (String value : arr) {
            if (value != null) {
                count++;
            }
        }

        String[] newArr = new String[count];
        int index = 0;
        for (String value : arr) {
            if (value != null) {
                newArr[index] = value;
                index++;
            }
        }

        System.out.println("\nArray after removing null values:");
        for (String value : newArr) {
            System.out.print(value + " ");
        }
        System.out.println();
        sc.close();
    }
}
