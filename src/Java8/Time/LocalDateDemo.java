package Java8.Time;
import java.time. *;

public class LocalDateDemo {
    public static void main(String[] args) {
//
//        /// Current Date, Time, Date&Time
//        System.out.println(LocalDate.now());   ///2026-10-13
//        System.out.println(LocalTime.now());  ///14:41:06.484971500
//        System.out.println(LocalDateTime.now());    ///2026-10-13T14:41:06.484971500
//
//        /// To add the days in
//        LocalDate d = LocalDate.now();
//        System.out.println(d.plusDays(10));
//        System.out.println(d.plusWeeks(7));
//        System.out.println(d.plusMonths(5));
//        System.out.println(d.plusYears(15));
//
//
//        /// To remove the days from
//        System.out.println(d.minusDays(10));
//        System.out.println(d.minusWeeks(1));
//        System.out.println(d.minusMonths(1));
//        System.out.println(d.minusYears(1));
//
//
//        ///To create our own date:
//        LocalDate d1 = LocalDate.of(2027,3,20);
//        System.out.println(d1);

        /// Difference between two dates
        LocalDateTime t1 = LocalDateTime.now();
        LocalDateTime t2 = LocalDateTime.of(2026,03,20,01,01);
        Duration duration = Duration.between(t2,t1);
        System.out.println(duration.toDays());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
    }
}
