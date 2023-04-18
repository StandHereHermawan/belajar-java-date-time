package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class TestZone {

    @Test
    void ZoneIdTest() {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zoneIdGMT = ZoneId.of("GMT");
        System.out.println(zoneIdGMT);
        System.out.println(" ");

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(id -> System.out.println(id));
    }

    @Test
    void createZoneOffset() {

        ZoneOffset zoneOffset = ZoneOffset.of("+07:00");
        ZoneOffset zoneOffset1= ZoneOffset.ofHours(7);
        ZoneOffset zoneOffset2= ZoneOffset.ofHours(-6);
        ZoneOffset zoneOffset3= ZoneOffset.ofHoursMinutes(7,10);

        System.out.println(zoneOffset);
        System.out.println(zoneOffset1);
        System.out.println(zoneOffset2);
        System.out.println(zoneOffset3);
    }
}
