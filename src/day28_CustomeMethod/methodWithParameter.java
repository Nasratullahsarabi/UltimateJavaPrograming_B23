package day28_CustomeMethod;

public class methodWithParameter {

    public static void main(String[] args) {
        eligible(20);
    }
    public static void eligible(int age){
        if (age >=21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not elegible");
        }

    }
}
