package scanner;

import java.util.Scanner;

public class gradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Grader!\nPlease enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double score1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double score2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double score3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double score4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double score5 = scan.nextDouble();

        double average = (score1+score2+score3+score4+score5)/5;

        System.out.println("Summary: "+subject1+" - "+score1+", "+subject2+" - "+score2+", "+subject3+" - "+
                score3+", "+subject4+" - "+score4+", "+subject5+" - "+score5+"\nYour average score is: "+average+"\nThank you for using Grader!\nGoodbye!");

    }
}
