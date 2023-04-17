package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {

    @Test
    void create() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of
                (
                        2003,
                        Month.MARCH,
                        12,
                        12,
                        12,
                        12
                );

        LocalDateTime localDateTime4 = LocalDateTime.of
                (
                        2003,
                        Month.AUGUST,
                        2,
                        11,
                        13,
                        14
                );

        LocalDateTime localDateTime3 = LocalDateTime.parse("2003-03-12T11:12:13");

        System.out.println(localDateTime1 + " Waktu Saat ini");
        System.out.println(localDateTime2 + " Waktu Custom TTL gw");
        System.out.println(localDateTime3 + " Waktu Custom TTL gw parsing");
        System.out.println(localDateTime4 + " Waktu Custom TTL orang");
    }

    @Test
    void with() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1
                .withYear(2003)
                .withMonth(8)
                .withDayOfMonth(2);
        LocalDateTime localDateTime3 = localDateTime1
                .withYear(2018)
                .withMonth(7)
                .withDayOfMonth(26);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void modify() {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1
                .plusYears(4)
                .minusMonths(4);
        LocalDateTime localDateTime3 = localDateTime1
                .minusYears(5)
                .plusMonths(3);

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }

    @Test
    void get() {
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.print(localDateTime.getYear() + ", ");
        System.out.print(localDateTime.getMonth() + ", ");
        System.out.print(localDateTime.getDayOfWeek() + ", ");
        System.out.print(localDateTime.getDayOfMonth() + ", ");
        System.out.print(localDateTime.getDayOfYear() + " Days by, ");
        System.out.print(localDateTime.getHour() + ":");
        System.out.print(localDateTime.getMinute() + ":");
        System.out.print(localDateTime.getSecond());
    }
}
