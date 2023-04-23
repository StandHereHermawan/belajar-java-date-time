package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeekTest {
    @Test
    void create() {
        DayOfWeek day1 = DayOfWeek.SUNDAY;
        DayOfWeek day2 = day1.plus(7);
        DayOfWeek day3 = day1.plus(1);
        DayOfWeek day4 = day1.minus(5);
        DayOfWeek day5 = day1.minus(4);

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
        System.out.println(day5);
    }
}
