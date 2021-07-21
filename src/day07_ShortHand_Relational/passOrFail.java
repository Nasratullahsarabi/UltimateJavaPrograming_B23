package day07_ShortHand_Relational;

public class passOrFail {
    public static void main(String[] args) {
         int score = 60;
         boolean pass = score>=60;
         boolean fail = score<=39;
        System.out.println("passed the exam: "+pass);
        System.out.println("failed the exam: "+fail);
    }
}
