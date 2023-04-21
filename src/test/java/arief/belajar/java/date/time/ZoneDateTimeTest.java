package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeTest {

    @Test
    void create() {

        ZonedDateTime
                zonedDateTime =
                ZonedDateTime.now();

        ZonedDateTime
                zonedDateTime1 =
                ZonedDateTime.of(
                        LocalDateTime.now(),
                        ZoneId.of(
                                "Asia/Jakarta"
                        )
                );

        ZonedDateTime
                zonedDateTime2 =
                ZonedDateTime.now(
                        ZoneId.of(
                                "GMT"
                        )
                );

        ZonedDateTime
                zonedDateTime3 =
                ZonedDateTime.now(
                        ZoneOffset.ofHours(5)
                );

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }

    @Test
    void parsing() {

        ZonedDateTime
                zonedDateTime1 =
                ZonedDateTime
                        .parse(
                                "2003-12-03T11:32+07:00[Asia/Jakarta]"
                        );

        ZonedDateTime
                zonedDateTime2 =
                ZonedDateTime
                        .parse(
                                "2003-12-03T11:32+05:00[Asia/Jakarta]"
                        );

        ZonedDateTime
                zonedDateTime3 =
                ZonedDateTime
                        .parse(
                                "2003-12-03T11:32+05:00"
                        );
    }

    @Test
    void changeZoneId() {

        ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = zonedDateTime1.withZoneSameLocal(ZoneId.of("GMT"));
        ZonedDateTime zonedDateTime3 = zonedDateTime1.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
