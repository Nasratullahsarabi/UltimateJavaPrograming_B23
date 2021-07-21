package day10_moreStatments;

public class daysInWeek2 {
    public static void main(String[] args) {
        int number = 9;
        String name = "";
        if(number >= 1 && number <= 7){

            if (number == 1){
                name = "Mon";
            } else if (number == 2) {
                name = "Tues";
            } else if (number == 3) {
                name = "Wed";
            } else if (number == 4) {
                name = "Thur";
            }else if (number == 5) {
                name = "Fri";
            }else if (number == 6) {
                name = "Sat";
            }else{
                name = "Sun";
            }

        }else{
            name = "Not Such Day";
        }
        System.out.println(name);
    }
}
