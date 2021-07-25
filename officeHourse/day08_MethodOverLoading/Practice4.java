package day08_MethodOverLoading;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println(calcInchesAndFeetToCentimeter(72));
        System.out.println(calcInchesAndFeetToCentimeter(5,12));
        System.out.println(calcInchesAndFeetToCentimeter(10));
    }

    public static double calcInchesAndFeetToCentimeter (double feet, double inch){
        if (feet < 0 || inch < 0 || inch >12)
            return -1;
        return (feet*12*2.54)+inch*2.54;
    }

    public static double calcInchesAndFeetToCentimeter (double feet){
        if (feet < 0)
            return -1;
        return feet*12;
    }

    public static double calcInchesAndFeetToCentimeter (float inches ){
        if (inches < 0)
            return -1;
        return  inches*2.54;

    }
}
