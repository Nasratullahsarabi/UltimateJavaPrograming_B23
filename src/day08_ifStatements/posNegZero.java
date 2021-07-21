package day08_ifStatements;

public class posNegZero {
    public static void main(String[] args) {
        int number = 0;
        boolean positive = number >0;
        boolean negative = number <0;
        boolean zero = number == 0; // or !positive && !negative
        if(positive){ // if the number is positive
            System.out.println(number+ " is positive");
        }
        if(negative){
            System.out.println(number+" is negative");
        }
        if(zero){
            System.out.println(number+" is zero");
        }
    }
}
