package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {

    @Test
    void create() {

        OffsetTime offsetTime  = OffsetTime.now();
        OffsetTime offsetTime1 = OffsetTime.now(ZoneId.of("Asia/Jakarta"));
        OffsetTime offsetTime2 = OffsetTime.of(10, 21, 39, 10000000, ZoneOffset.ofHours(7));
        OffsetTime offsetTime3 = OffsetTime.parse("19:29:37.1000000+05:00");

        System.out.println(offsetTime);
        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);

        OffsetDateTime offsetDateTime  = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now(ZoneId.of("GMT"));
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDateTime.now(),ZoneOffset.ofHours(8));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("2015-07-15T06:16:16.1000000+08:00");

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
    }

    @Test
    void toLocalTime() {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        OffsetTime offsetTime = localTime.atOffset(ZoneOffset.ofHours(7));
        System.out.println(offsetTime);

        LocalTime localTime1 = offsetTime.toLocalTime();
        System.out.println(localTime1);

    }

    @Test
    void toLocalDateTime() {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(6));
        System.out.println(offsetDateTime);

        LocalDateTime localDateTime1 = offsetDateTime.toLocalDateTime();
        System.out.println(localDateTime1);

    }
}
