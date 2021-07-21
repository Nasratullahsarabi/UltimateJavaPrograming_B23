package day07_ShortHand_Relational;

public class eligibleForLoan {
    public static void main(String[] args) {
        String name = "John";
        int age = 18;
        int income = 90000;
        int workHistory = 2;
        int creditScor = 700;
        boolean eligibleForLoan = age >= 18 && income >= 60000 && workHistory >= 2 && creditScor >=700;
        boolean elgibleFor = age >= 18 && creditScor >= 700 && (income >=60000 || workHistory >= 2);
        System.out.println(name+" is eligible for loan: "+eligibleForLoan);
        System.out.println("elgibleFor = " + elgibleFor);


    }
}
