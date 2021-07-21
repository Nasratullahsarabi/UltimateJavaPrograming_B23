package day10_moreStatments;

public class convertNumberToWords {
    public static void main(String[] args) {
        int num = 10;
        String name = "zero";
        if (num>=0 && num<=9){
            if (num==0) {
                name = "Zero";
            }else if (num==1){
                name="One";
            }else if (num==2){
                name="Two";
            }else if (num==3){
                name="Three";
            }else if (num==4){
                name="Four";
            }else if (num==5){
                name="Five";
            }else if (num==6){
                name="Six";
            }else if (num==7){
                name="Seven";
            }else if (num==8){
                name="Eight";
            }else{
                name="Nine";
            }

        }else{
           name = "Not in range";
        }
        System.out.println(name);
    }
}
