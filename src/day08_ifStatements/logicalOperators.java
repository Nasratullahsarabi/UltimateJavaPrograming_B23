package day08_ifStatements;

public class logicalOperators {
    public static void main(String[] args) {
        System.out.println( !true );
        System.out.println( !false);
        System.out.println( true == !false);
        System.out.println( true != !true);
        System.out.println("-------------------------");
        int scoore = 80;
        boolean passed= scoore>=60;
        boolean failed= !passed;
        System.out.println(failed);
        System.out.println("-----------------------");
        int age = 20;
        boolean eligible = age >= 21;
        boolean notEligible = !eligible;
        System.out.println(notEligible);
        /*
        Logical Operators (!, && and ||) are only applicable for boolean expresion.
         */

    }
}
