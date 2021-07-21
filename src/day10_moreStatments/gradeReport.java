package day10_moreStatments;

public class gradeReport {
    public static void main(String[] args) {
        int score = 85;
        String grade = "";
        if(score>=0 && score <=100){
            if (score>=90){
                grade="A";
            }else if (score>=80){
                grade="B";
            }else if (score>=70){
                grade="C";
            }else if (score>=60){
                grade="D";
            }else {
                grade ="F";
            }
        }else{
            grade = "Invalid";
        }
        System.out.println(grade);
    }
}
