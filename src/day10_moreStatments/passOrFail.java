package day10_moreStatments;

public class passOrFail {
    public static void main(String[] args) {
        int score = 50;
        String result = (score>=60 && score <=100)?"pass":"fail";
        System.out.println("result = " + result);
    }
}
