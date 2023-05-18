package locale;

import java.text.NumberFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        Locale l = new Locale.Builder()
                .setLanguage("hi")
                .setRegion("IN")
                .build();

        System.out.println(l);

        long number = 3200000;
        long yearAverage = number/12;

        NumberFormat numberInstance = NumberFormat.getNumberInstance(l);
        System.out.println(numberInstance.format(yearAverage));
        NumberFormat numberInstance1 = NumberFormat.getNumberInstance(Locale.GERMAN);

        System.out.println(numberInstance1.format(yearAverage));

        NumberFormat frenchCurrency = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(frenchCurrency.format(500));

        NumberFormat indianCurrency = NumberFormat.getCurrencyInstance(l);
        System.out.println(indianCurrency.format(5478565));

        ZonedDateTime now = ZonedDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy MM,dd hh:mm a z",Locale.ITALIAN));
        System.out.println(format);
    }
}
