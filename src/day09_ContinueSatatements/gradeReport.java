package day09_ContinueSatatements;

public class gradeReport {
    public static void main(String[] args) {
        int score = 100;
        if(score>=90 && score <=100){
            System.out.println("Excelent you made an A");
        }else if(score>=80){ // false when the number is less than 80 if it is above 80 the first condition will apply
            System.out.println("good you made a B");
        }else if (score>=70){
            System.out.println("you made a C");
        }else if (score>=60){
            System.out.println("you made a D");
        }else{
            System.out.println("you failed");

        }
    }
}
