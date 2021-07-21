package quize;

import java.util.Arrays;

public class NotToBeTouched {
    public static void main(String[] args) {

        int wd = 0;

        String []days = {"sun","mon","wed","sat"};

        for (int i = 0; i < days.length; i++) {

            switch (days[i]){
                case "sat":
                case "sun":
                    wd-=1;
                    break;
                case "mon":
                    wd++;
                case "wed":
                    wd+=2;

            }

        }
        System.out.println(wd);


        System.out.println("=================================");

        int wd1 = 0;

        String []days1 = {"sun","mon","wed","sat"};

        for (int i = 0; i < days1.length; i++) {

            if (days1[i].equals("sun")  && days1[i].equals("sat")){
                wd1-=1;
            }else if (days1[i].equals("mon")){
                wd1++;
            }else if (days1[i].equals("wed")){
                wd1+=2;
            }

        }
        System.out.println(wd1);

    }
}
