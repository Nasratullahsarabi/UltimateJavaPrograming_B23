package day10_moreStatments;

public class namesOfMonths2 {
    public static void main(String[] args) {
        int month = 20;
        String name = "";
        if (month>=1 && month <=12){
            if (month==1){
                name = "Jan";
            }else if (month==2){
                name = "Feb";
            }else if (month==3){
                name = "Mar";
            }else if (month==4){
                name = "Apr";
            }else if (month==5){
                name = "May";
            }else if (month==6){
                name = "Jun";
            }else if (month==7){
                name = "Jul";
            }else if (month==8){
                name = "Aug";
            }else if (month==9){
                name = "Sep";
            }else if (month==10){
                name = "Oct";
            }else if (month==11){
                name = "Nov";
            }else{
                name = "Dec";
            }

        }else{
            name = "Not such a month";
        }
        System.out.println(name);
    }
}
