package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {

        Year year = Year.now();
        Year year1 = Year.of(2018);
        Year year2 = Year.parse("2015");

        System.out.println(year);
        System.out.println(year1);
        System.out.println(year2);

        YearMonth yearMonth = YearMonth.now();
        YearMonth yearMonth1 = YearMonth.of(2003, Month.AUGUST);
        YearMonth yearMonth2 = YearMonth.parse("2003-03");

        System.out.println(yearMonth);
        System.out.println(yearMonth1);
        System.out.println(yearMonth2);

        MonthDay monthDay = MonthDay.now();
        MonthDay monthDay1 = MonthDay.of(Month.AUGUST,2);
        MonthDay monthDay2 = MonthDay.parse("--08-02");

        System.out.println(monthDay);
        System.out.println(monthDay1);
        System.out.println(monthDay2);

    }

    @Test
    void name() {

        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year
                .atMonth(Month.AUGUST)
                .atDay(2);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay
                .from(localDate);

        System.out.println(monthDay);
    }

    @Test
    void get() {

        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getDayOfMonth());

    }
}
