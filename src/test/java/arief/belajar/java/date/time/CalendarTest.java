package arief.belajar.java.date.time;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    void create() {
        Calendar calendar = Calendar.getInstance();

        Date date = calendar.getTime();
        System.out.println(date);
    }

    @Test
    void modifyCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2003);
        calendar.set(Calendar.MONTH, Calendar.MARCH);
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 21);
        calendar.set(Calendar.MILLISECOND, 300);

        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    void getCalendar() {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Tahun " + calendar.get(Calendar.YEAR));
        System.out.println("Bulan " + calendar.get(Calendar.MONTH));
        System.out.println("Minggu ke " + calendar.get(Calendar.WEEK_OF_YEAR) + " di tahun ini");
        System.out.println("Minggu ke " + calendar.get(Calendar.WEEK_OF_MONTH) + " di bulan ini");
        System.out.println("Hari ke " + calendar.get(Calendar.DAY_OF_YEAR) + " di tahun ini");
        System.out.println("Hari ke " + calendar.get(Calendar.DAY_OF_MONTH) + " di bulan ini");
        System.out.println("Jam " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Menit " + calendar.get(Calendar.MINUTE));
        System.out.println("Detik ke " + calendar.get(Calendar.SECOND));
        System.out.println("Millidetik ke " + calendar.get(Calendar.MILLISECOND));

    }
}
