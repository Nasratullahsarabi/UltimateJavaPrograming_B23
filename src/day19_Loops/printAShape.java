package day19_Loops;

public class printAShape {
    public static void main(String[] args) {   // remember if we have only one print statement we can do it without curly braces
        for (int i = 0; i <= 8; i++) {
            System.out.println("\t\t* * * * * *");

        }
        System.out.println("======================================");
        System.out.println("* * * * * *");
        for (int i = 1; i <= 8; i++) {

            System.out.println("*         *");

        }
        System.out.println("* * * * * *");
    }
}
/*
print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
 */