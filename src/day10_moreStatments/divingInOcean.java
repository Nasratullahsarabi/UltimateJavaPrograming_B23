package day10_moreStatments;

public class divingInOcean {
    public static void main(String[] args) {
        int oxygen = 59; String message = "";
        message= (oxygen>90)?"your tank is full":(oxygen>80)?"still ok":(oxygen>70)?"don't go too far":
                (oxygen>60)?"start to head back":"be careful now you are at 50%";
        System.out.println("message = " + message);

    }
}
