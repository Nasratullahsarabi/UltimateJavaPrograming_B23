package day10_moreStatments;

public class daysInWeek {
    public static void main(String[] args) {
        int number = 9;
        String name = "";
        if (number == 1){
            name = "Mond";
        }else if(number==2){
            name="Tues";
        }else if (number==3){
            name="Wed";
        }else if(number==4){
            name="Thur";
        }else if (number==5){
            name="Fri";
        }else if(number==6){
            name="Sat";
        }else if (number==7){
            name="Sun";
        }else{
            name="Wrong number";
        }
        System.out.println(name);
    }
}
