package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.ArrayList;
import java.util.List;

public class TemporalTest {
    @Test
    void temporal() {

        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
        System.out.println(temporal4);
    }

    @Test

    void temporalAmount() {

        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(10));
        Temporal temporal3 = temporal1.plus(Period.ofDays(3));

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
    }

    @Test
    void temporalAmountIseng() {

        Temporal temporal1 = LocalDateTime.of(2003,3,12,11,11);
        Temporal temporal2 = temporal1.plus(Period.ofDays(10000));

        System.out.println(temporal2);

        Temporal temporal3 = LocalDateTime.of(2004,3,8,11,11);
        Temporal temporal4 = temporal3.plus(Period.ofDays(10000));

        System.out.println(temporal4);
    }

    @Test
    void temporalUnit() {

        long temporalUnit1 = ChronoUnit.MINUTES.between(
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(11)
        );
        System.out.println(temporalUnit1);

        long temporalUnit2 = ChronoUnit.DAYS.between(
                LocalDateTime.of(2003, 3, 12, 11, 29),
                LocalDateTime.now()
        );
        System.out.println(temporalUnit2);

        long temporalUnit3 = ChronoUnit.DAYS.between(
                LocalDateTime.of(2004, 3, 12, 11, 39),
                LocalDateTime.now()
        );
        System.out.println(temporalUnit3);

        long temporalUnit4 = ChronoUnit.DAYS.between(
                LocalDateTime.of(2004, 3, 12, 11, 39),
                LocalDateTime.now().plusDays(20)
        );
        System.out.println(temporalUnit4);

    }

    @Test
    void temporalField() {

        LocalDateTime temporal = LocalDateTime.now();

        System.out.print(temporal.get(ChronoField.YEAR)+", ");
        System.out.print(temporal.get(ChronoField.MONTH_OF_YEAR)+", ");
        System.out.print(temporal.get(ChronoField.DAY_OF_MONTH)+", ");
        System.out.print(temporal.get(ChronoField.HOUR_OF_DAY)+":");
        System.out.print(temporal.get(ChronoField.MINUTE_OF_HOUR)+":");
        System.out.print(temporal.get(ChronoField.SECOND_OF_MINUTE)+":");
        System.out.print(temporal.get(ChronoField.MILLI_OF_SECOND)+":");
        System.out.print(temporal.get(ChronoField.NANO_OF_SECOND));

    }

    @Test
    void temporalQuery() {

        LocalDateTime temporal = LocalDateTime.now();

//        List<Integer> integers = temporal.query(new TemporalQuery<List<Integer>>() {
//
//            public List<Integer> queryFrom(TemporalAccessor temporal) {
//                ArrayList<Integer> list = new ArrayList<>();
//
//                list.add(temporal.get(ChronoField.YEAR));
//                list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
//                list.add(temporal.get(ChronoField.DAY_OF_MONTH));
//                list.add(temporal.get(ChronoField.HOUR_OF_DAY));
//                list.add(temporal.get(ChronoField.MINUTE_OF_HOUR));
//                list.add(temporal.get(ChronoField.SECOND_OF_MINUTE));
//
//                return list;
//            }
//        });

        List<Integer> integers = temporal.query((TemporalQuery<List<Integer>>) temporal1 -> {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(temporal1.get(ChronoField.YEAR));
            list.add(temporal1.get(ChronoField.MONTH_OF_YEAR));
            list.add(temporal1.get(ChronoField.DAY_OF_MONTH));
            list.add(temporal1.get(ChronoField.HOUR_OF_DAY));
            list.add(temporal1.get(ChronoField.MINUTE_OF_HOUR));
            list.add(temporal1.get(ChronoField.SECOND_OF_MINUTE));

            return list;
        });

        System.out.println(integers);
    }

    @Test
    void temporalAdjuster() {

        Temporal temporal1 = LocalDate.now();
        System.out.println(temporal1);

        Temporal temporal2 = temporal1.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                return LocalDate.of(
                        temporal.get(ChronoField.YEAR),
                        temporal.get(ChronoField.MONTH_OF_YEAR),
                        1
                );
            }
        });
        System.out.println(temporal2);

        Temporal temporal3 = temporal1.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(temporal3);
        Temporal temporal4 = temporal1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(temporal4);
    }
}
