package day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime breakTime = LocalTime.now();
        LocalTime nextSesion = breakTime.plusMinutes(10);

        System.out.println(breakTime);
        System.out.println(nextSesion);
        System.out.println("===========================");
        LocalTime comeBack = LocalTime.of(5,55);
        System.out.println(comeBack);
    }
}
