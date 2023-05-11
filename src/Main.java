import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        TimeHelperClass obj = new TimeHelperClass();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Date and Time: ");
        String input = sc.nextLine();
        obj.convertToETTime(input);

        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("\nToday date: " + date);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("Tomorrow date: " + tomorrow);
        System.out.println("Is Leap Year: " + date.isLeapYear());
    }
}