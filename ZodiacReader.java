package Astrology;

public class ZodiacReader {
    public static Zodiac getSign(int day, Month month) {
        return switch (month) {
            case JANUARY -> day < 20 ? Zodiac.CAPRICORN : Zodiac.AQUARIUS;
            case FEBRUARY -> day < 19 ? Zodiac.AQUARIUS : Zodiac.PISCES;
            case MARCH -> day < 21 ? Zodiac.PISCES : Zodiac.ARIES;
            case APRIL -> day < 20 ? Zodiac.ARIES : Zodiac.TAURUS;
            case MAY -> day < 21 ? Zodiac.TAURUS : Zodiac.GEMINI;
            case JUNE -> day < 21 ? Zodiac.GEMINI : Zodiac.CANCER;
            case JULY -> day < 23 ? Zodiac.CANCER : Zodiac.LEO;
            case AUGUST -> day < 23 ? Zodiac.LEO : Zodiac.VIRGO;
            case SEPTEMBER -> day < 23 ? Zodiac.VIRGO : Zodiac.LIBRA;
            case OCTOBER -> day < 23 ? Zodiac.LIBRA : Zodiac.SCORPIO;
            case NOVEMBER -> day < 22 ? Zodiac.SCORPIO : Zodiac.SAGITTARIUS;
            case DECEMBER -> day < 22 ? Zodiac.SAGITTARIUS : Zodiac.CAPRICORN;
            default -> Zodiac.ERROR;
        };
    }
}