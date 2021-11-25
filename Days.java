package Astrology;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Days {
    public static int readDay(Month month) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your day of birth with integer:");
        int day = scanner.nextInt();
        try {
            LocalDate.of(2020, month.ordinal() + 1, day);
        } catch (DateTimeException ex) {
            return -1;
        }
        return day;
    }
}