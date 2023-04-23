package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {
    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 03 12", formatter);
        System.out.println(localDate);

    }

    @Test
    void format() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2020 03 12", formatter);
        String format = localDate.format(formatter);

        System.out.println(format);

    }

    @Test
    void defaultFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2018 07 17", formatter);
        String format1 = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = localDate.format(DateTimeFormatter.ISO_DATE);

        System.out.println(format1);
        System.out.println(format2);
        
    }

    @Test
    void i18n() {
        Locale locale = new Locale("id", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.of(2018 , 8 , 12);
        String format = localDate.format(formatter);

        System.out.println(format);
    }
}
