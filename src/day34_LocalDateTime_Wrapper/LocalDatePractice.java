package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class LocalDatePractice {
    public static void main(String[] args) {
        String names[] = {"Oz Stark", "Ebrahim", "Oleg", "Ebrahim"};
        LocalDate[] dOB = {LocalDate.of(1990,5,25),
                LocalDate.of(1980,6,20),
        LocalDate.of(1985,7,28),
        LocalDate.of(1995, 8, 20)};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]+", birthday is: "+dOB[i]);

        }
        System.out.println("================================================");

        LocalDate person1 = LocalDate.of(1980,12,28);
        LocalDate person2 = LocalDate.of(1980,12,25);

       if (person1.isBefore(person2)){
           System.out.println("person1 is older");
       }else {
           System.out.println("person2 is older");
       }
        System.out.println("================================================");
       if (person1.isAfter(person2)){
           System.out.println("person1 is younger");
       }else {
           System.out.println("person2 is younger");
       }
        System.out.println("================================================");
       boolean r1 = person1.isLeapYear();
        System.out.println(r1);
        boolean r2 = LocalDate.of(2023,1,1).isLeapYear();

        System.out.println(r2);
        System.out.println("================================================");
        LocalDate currentDate = LocalDate.now();
        LocalDate unitAssessment3 = currentDate.plusDays(14);
        LocalDate unitAssessment4 = currentDate.plusMonths(2);
        LocalDate unitAssessement5 = currentDate.plusYears(3);
        LocalDate examDate = currentDate.plusWeeks(2);


    }
}
