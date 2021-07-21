package day29_CustomMethodPractice;

public class scoreGrade {
    public static void main(String[] args) {
        grade(80);
    }
    public static String grade(int score){
        String result = "Invalid";
        if (score >= 0 && score <= 100){
            result = (score >= 90)? "A" :(score >= 80)? "B":(score >= 70)? "C":(score >=  60)?"D":"F";
        }
        System.out.println(result);
        return result;
    }
}
