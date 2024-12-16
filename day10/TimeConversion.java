import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        String input = scanner.nextLine();

        // Parse input using SimpleDateFormat
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm a");
        Date date = inputFormat.parse(input);

        // Subtract 20 minutes
        long timeInMillis = date.getTime();
        long twentyMinutesInMillis = 20 * 60 * 1000;
        Date updatedDate = new Date(timeInMillis - twentyMinutesInMillis);

        // Convert to 24-hour format
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm");
        String output = outputFormat.format(updatedDate);

        // Print the result
        System.out.println(output);

        scanner.close();
    }
}
