package pr1;

public class loanRequirment {
    public static void main(String[] args) {
        /*
        A bank has the following requirment to lend.
         */
        int capita1 = 10000,
                capital2 = 20000,
                capital3 = 30000;
        int sales1 = 12000,
                sales2 = 13000,
                sales3 = 14000;
        int workhistory1 = 2,
                workhistory2 = 3,
                workhistory3 = 4;
        String creditScore = "Good";
        boolean eligibitiy = capita1 >= 10000 && sales1 >= 20000 && workhistory1 >= 4 && (creditScore == "Good" || creditScore == "fair");
        boolean eligibility1 = creditScore == "Good" || creditScore == "fair" && sales2 >= 20000 && capital2 >= 30000;
        boolean eligibility2 = workhistory3 >= 4 && sales3 >= 14000 && (capita1 >= 30000 || creditScore == "Good");
        System.out.println("Ahmad is eligible for first period " + eligibitiy);
        System.out.println("Ahmad is eligible for first period " + eligibility1);
        System.out.println("Ahmad is eligible for first period " + eligibility2);
        if (eligibility1 = true) ;
            System.out.println("This is right");
        System.out.println("this is wrong");

    }
}
