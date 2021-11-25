package Astrology;

import java.util.Scanner;

public class MonthReader {
    public static Month readMonth() {
        System.out.print("Enter the month of birth: ");
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();
        try {
            return Month.valueOf(monthName.toUpperCase());
        } catch (IllegalArgumentException ex) {
            return Month.WRONGMONTH;
        }
    }
}