package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmupTask1 {
    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[15];

        for (int i = 0; i < dates.length; i++) {

            dates[i] = LocalDate.now().plusDays(i);
            System.out.println(dates[i].format(DateTimeFormatter.ofPattern("MMM/dd/YY EEE")));
        }

    }
}
