package day08_ifStatements;

public class gradeReport2 {
    public static void main(String[] args) {
        int score = 55;
        boolean madeA = score >=90 && score<=100;
        boolean madeB = !madeA && score >=80; // did not make A and score is greater or equal than 80
        boolean madeC = !madeA && !madeB && score>=70; // did not make A and B and score is greater or equal to 70
        boolean madeD = !madeA && !madeB && !madeC && score>=60;// did not make A, B and C and score is greater or equal to 60
        boolean failed = !madeA&&!madeB&&!madeC&&!madeD;// made below 60
        if (madeA){
            System.out.println("you made A");
        }
        if (madeB){
            System.out.println("you made B");
        }
        if (madeC){
            System.out.println("you made C");
        }
        if (madeD){
            System.out.println("you made D");
        }
        if (failed){
            System.out.println("failed");
        }

    }
}
