package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(new Locale("hu","HU"));

        System.out.println(now.format(formatter));
        System.out.println(formatter.format(now));

        System.out.println(now);

        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("yy*MM*dd");
        System.out.println(myFormatter.format(now));

    }
}
