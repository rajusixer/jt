import java.util.*;
import java.text.*;

public class DateToFormattedString {
    public static void main(String args[]) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(currentDate);

        System.out.println("Formatted Date: " + formattedDate);
    }
}
