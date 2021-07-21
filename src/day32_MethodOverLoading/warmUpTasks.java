package day32_MethodOverLoading;

public class warmUpTasks {
    public static void main(String[] args) {
        System.out.println(sumTwoN(3,2));
        System.out.println(sumThreeN(10,20,30));
        System.out.println(sumFourN(1,2,3,4));
        System.out.println("===============================");
        int s1 = sum(10,20);
        int s2 = sum(10,20, 30);
        int s3 = sum(10,20, 40, 30);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("======================================");
        double s4 = sum(2.3, 4.5, 6, 5.4);

        System.out.println("s4 = " + s4);

    }
    public static int sumTwoN (int a, int b){
        return a+b;
    }
    public static int sumThreeN(int a, int b, int c ){
        return a+b+c;
    }
    public static int sumFourN(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum (int a, int b , int c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        return sum( sum(a,b), sum(c, d) );
        // return a+b+c+d;
    }

    public static double sum(double a, double b, double c, double d){
        return a+b+c+d;
    }

}
