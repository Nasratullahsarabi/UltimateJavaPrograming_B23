package day34_LocalDateTime_Wrapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {

        LocalDate myBirthday = LocalDate.of(1983,3,2);

        DateTimeFormatter DFNasrat = DateTimeFormatter.ofPattern("MM,dd,YYYY");

        System.out.println(myBirthday.format(DFNasrat));
        LocalDate muzDOB = LocalDate.of(2010,8,31);
        DateTimeFormatter DF1 = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        System.out.println(muzDOB.format(DF1));
        LocalDate freshtaDOF = LocalDate.of(1991,6,25);
        DateTimeFormatter DF2 = DateTimeFormatter.ofPattern("MM:dd:YYYY");
        System.out.println(freshtaDOF.format(DF2));
        System.out.println("================================================");
        LocalDate nBD = LocalDate.of(1983,3,2);
        DateTimeFormatter DF3 = DateTimeFormatter.ofPattern("dd/MM/YYYY EEEE");
        System.out.println(nBD.format(DF3));
        LocalDate fDB = LocalDate.of(1991,6,25);
        DateTimeFormatter DF4 = DateTimeFormatter.ofPattern("YYYY-MM-dd EE");
        System.out.println(fDB.format(DF4));
        LocalDate mDOB = LocalDate.of(2010,8,31);
        DateTimeFormatter DF5 = DateTimeFormatter.ofPattern("MM/dd/YY EE");
        System.out.println(mDOB.format(DF5));





    }
}
