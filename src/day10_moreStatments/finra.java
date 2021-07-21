package day10_moreStatments;

public class finra {
    public static void main(String[] args) {
        int number =17;
        String result = "";
        if (number%3==0 && number%5==0){
            result = "Finra";
        }else if (number%5==0){
            result = "Ra";
        }else if (number%3==0){
            result = "Fin";
        }else{
            result = ""+number;
        }
        System.out.println(result);
    }
}
