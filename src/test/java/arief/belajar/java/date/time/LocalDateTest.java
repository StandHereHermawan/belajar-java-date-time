package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2003, Month.MARCH, 12);
        LocalDate localDate3 = LocalDate.parse("2003-08-02");

        System.out.println(localDate1 + " Hari Ini");
        System.out.println(localDate2 + " Tempat Tanggal Lahir gwejh");
        System.out.println(localDate3 + " Tempat Tanggal Lahir yang bersangkutan");
    }

    @Test
    void with() {
        LocalDate localDate  = LocalDate.now();
        LocalDate localDate1 = localDate.withYear(2010);
        LocalDate localDate2 = localDate.withYear(2011).withMonth(1);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
    }

    @Test
    void modify() {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.plusDays(100);
        LocalDate localDate2 = localDate.plusWeeks(10);
        LocalDate localDate3 = localDate.plusYears(1);

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
    }
}
