package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;

public class Birthday {
    public static void main(String[] args) {
        birthDay(1989,7,25);

    }
    public static void birthDay (int year, int month, int day){
        LocalDate DOB = LocalDate.of(year, month,day);

        LocalDate today = LocalDate.now();
        int age = today.getYear() - DOB.getYear();
        if (DOB.getMonthValue()==(today.getMonthValue()) && DOB.getDayOfMonth() == today.getDayOfMonth()){

            System.out.println("Happy Birthday");
            System.out.println("Today you are "+age+" year old");
        }else {
            System.out.println("Today is not y our brithday!");
        }
    }
}
