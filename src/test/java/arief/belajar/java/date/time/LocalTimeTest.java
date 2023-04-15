package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(23,22);
        LocalTime localTime2 = LocalTime.parse("23:49");

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void change() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.withHour(10);
        LocalTime localTime2 = localTime.withHour(5).withMinute(12).withSecond(49);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void modify() {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = localTime.plusHours(8);
        LocalTime localTime2 = localTime
                .plusHours(2)
                .plusMinutes(76)
                .plusSeconds(300);

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
    }

    @Test
    void get() {
        LocalTime localTime = LocalTime.now();

        System.out.println("Jam ke "+localTime.getHour());
        System.out.println("Menit ke "+localTime.getMinute());
        System.out.println("Detik ke "+localTime.getSecond());
        System.out.println(localTime.getNano()+ " Nanodetik");
    }
}
