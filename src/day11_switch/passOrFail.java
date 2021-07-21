package day11_switch;

public class passOrFail {
    public static void main(String[] args) {
        /*
        pass: A,B,C,D
        failed: F
         */
        char grade = 'Y';
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
