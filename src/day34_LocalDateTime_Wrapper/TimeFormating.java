package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormating {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        DateTimeFormatter now1 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(now.format(now1));
        LocalTime quize = LocalTime.of(9,15);
        DateTimeFormatter quizeF = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(quize.format(quizeF));
        LocalTime sport = LocalTime.of(7,10,15);
        DateTimeFormatter TF = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(sport.format(TF));
        LocalDateTime now2 = LocalDateTime.now();

        System.out.println(now2);

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MM/dd/YYYY EE hh:mm: a");

        System.out.println(now2.format(DTF));

      LocalDateTime DAT = LocalDateTime.of(2020, 11, 24, 13, 00);

      DateTimeFormatter DTF5 = DateTimeFormatter.ofPattern("EEEE, hh:ss a, MMM/dd/YYYY");
        System.out.println(DAT.format(DTF5));

        String result = LocalDate.of(2022, 1,1).format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(result);

        LocalDate quiz = LocalDate.of(2018, 6,25);
        String result1 = quiz.format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(result1);
        System.out.println("========================================");

        LocalDate arrival  = LocalDate.of(2019,10,10);

        String day = arrival.format(DateTimeFormatter.ofPattern("EEEE"));

        System.out.println(day);
    }
}
