package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodeTest {
    @Test
    void create() {

        Period period1 = Period.ofDays(7);
        Period period2 = Period.ofWeeks(4);
        Period period3 = Period.ofMonths(12);
        Period period4 = Period.ofYears(1);
        Period period5 = Period.of(2, 24, 31);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }

    @Test
    void get() {

        Period period = Period.of(2, 24, 29);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test
    void between() {

        Period period1 = Period.between(
                LocalDate.of(2003, 3, 12),
                LocalDate.now()
        );

        System.out.println(period1.getYears());
        System.out.println(period1.getMonths());
        System.out.println(period1.getDays());
    }
}
