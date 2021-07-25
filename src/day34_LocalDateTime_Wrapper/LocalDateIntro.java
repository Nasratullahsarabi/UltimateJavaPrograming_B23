package day34_LocalDateTime_Wrapper;
import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        String []names = {"Asad", "Nasrat", "Ateeq", "Wahid", "Jawad"};
        LocalDate[]DOB = {LocalDate.of(1980,8,21),
                LocalDate.of(1983,3,2),
        LocalDate.of(1989,8,30),
        LocalDate.of(1992,5,2),
        LocalDate.of(1978,4,25)};

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]+" "+DOB[i]);
        }
        System.out.println("============================");
        LocalDate p1 = LocalDate.of(1980,8,29);
        LocalDate p2 = LocalDate.of(1990,12,25);

        if (p1.isBefore(p2)){
            System.out.println("p1 is older");
        }else {
            System.out.println("p2 is older");
        }
        if (p1.isAfter(p2)){
            System.out.println("p1 is younger");
        }else {
            System.out.println("p2 is younger");
        }
        System.out.println("============================================");

        boolean leapYear = p1.isLeapYear();

        System.out.println(leapYear);
        boolean nasratBD = LocalDate.of(1983,3,2).isLeapYear();
        System.out.println(nasratBD);

        LocalDate todaysDate = LocalDate.now();

        System.out.println(todaysDate);
        LocalDate quize = todaysDate.plusDays(10);

        System.out.println(quize);

        LocalDate finisheCourse = todaysDate.plusMonths(5);
        System.out.println(finisheCourse);

        LocalDate edd = todaysDate.plusWeeks(6);
        System.out.println(edd);
    }
}
