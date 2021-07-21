package pr1;

public class dateConverter {
    public static void main(String[] args) {
        int gregorianDay=31, gregorianMonth=1, gregorianYear=2021;
        int hijriDay = gregorianDay+10, hijriMonth = gregorianMonth+9,
                        hijriYear = gregorianYear-621;
        if(gregorianDay>=1 && gregorianDay <=20 && gregorianMonth==1 && gregorianYear==2021){
            System.out.println(hijriDay+" "+hijriMonth+" "+hijriYear);
        }else if (gregorianDay>=21 && gregorianDay<=31 && gregorianMonth==1 && gregorianYear==2021)
            System.out.println(hijriDay-30+" "+(hijriMonth+1)+" "+hijriYear);
        System.out.println("----------------------------------");
        System.out.println(277984%365);
        }
        }



