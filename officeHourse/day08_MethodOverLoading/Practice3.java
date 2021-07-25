package day08_MethodOverLoading;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeter(10,5));
        System.out.println(calcFeetAndInchesToCentimeter(10));

    }
    public static double calcFeetAndInchesToCentimeter(double feet, double inches){
        if (feet <0 || inches < 0 || inches > 12)
            return  -1;
        return  (feet*12*2.54)+(inches*2.54);
    }
    public static double calcFeetAndInchesToCentimeter (double inches){
        if (inches < 0)
            return -1;
        return inches*12;
    }
}
