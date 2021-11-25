package Astrology;

public class MainAstrology {
    public static void main(String[] args) {
        Month month = MonthReader.readMonth();
        int day = Days.readDay(month);
        if (month == Month.WRONGMONTH) {
            System.out.println("You've entered wrong month");
        }
        if (day <= 0) {
            System.out.println("You've entered wrong date");
        }
        Zodiac sign = ZodiacReader.getSign(day, month);
        System.out.println(sign);
        Horoscope.horoscope(sign);
    }
}