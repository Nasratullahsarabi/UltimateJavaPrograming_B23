package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        String names[] = {"Oz", "Ebrahim", "Dentrol", "Oleg", "Nasrat"};
        LocalDate [] DOB = {
                LocalDate.of(2001,1,3),
                LocalDate.of(1998,4,6),
                LocalDate.of(1980,4,5),
                LocalDate.of(1970,6,5),
                LocalDate.of(1995,2,9)};

        LocalDate youngest = DOB[0];
        int index = 0;

        for (int i = 0; i < names.length; i++) {
            if (DOB[i].isAfter(youngest)){
                youngest = DOB[i];
                index = i;
            }
        }
        System.out.println(youngest);
        System.out.println(names[index]);
    }
}
