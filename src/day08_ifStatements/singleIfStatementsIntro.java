package day08_ifStatements;

public class singleIfStatementsIntro {
    public static void main(String[] args) {
        String name = "Muhtar";
        int score = 50;
        boolean passed = score>=60;
        if(passed){
            System.out.println(name+" Congrats you passed the exam");
        }
        if(!passed){
            System.out.println(name+" you failed the exam");
        }

    }
}
