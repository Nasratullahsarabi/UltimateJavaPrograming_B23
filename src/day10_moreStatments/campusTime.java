package day10_moreStatments;

public class campusTime {
    public static void main(String[] args) {
        int time = 25;
        String name = "";
        if (time>=1 && time<=24){
            if (time>=8 && time<=23){
                name = "Open";
            }else{
                name="Closed";
            }

        }else{
            name="Not Valie Time";
        }
        System.out.println(name);

    }
}
