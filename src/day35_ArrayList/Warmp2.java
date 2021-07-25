package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Warmp2 {
    public static void main(String[] args) {

        LocalDate [] dates = new LocalDate[10];

        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i);
            System.out.println(dates[i].format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
        }
    }
}
