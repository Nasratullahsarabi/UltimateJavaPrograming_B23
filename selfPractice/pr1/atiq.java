package pr1;

public class atiq {
    public static void main(String[] args) {
        String company = "Starbucks";
        byte workHistory = 5;
        int sales = 100_000;
        int capital = 100_000;
        String pHistory = "Good";


        boolean eligibilityForFirstPeriod = (pHistory == "Good" || pHistory == "fair" ) && workHistory >= 2 && sales >= 50_000 && capital >= 50_000;
        boolean eligibilityForSecondPeriod = workHistory >= 3 && sales >= 60_000 && capital >= 60_000 && (pHistory == "Good" || pHistory == "Fair");
        boolean eligibilityForThirdPeriod = workHistory >= 5 && sales >= 100_000 && capital >= 100_000 && pHistory == "Good";


        System.out.println("eligibility For First Period = " + eligibilityForFirstPeriod);
        System.out.println("eligibility For Second Period = " + eligibilityForSecondPeriod);
        System.out.println("eligibilityFor  Third period = " + eligibilityForThirdPeriod);
        System.out.println();

        System.out.println("__________________________________________________________________");

        if (eligibilityForThirdPeriod = workHistory >= 5 && sales >= 100_000 && capital >= 100_000 && pHistory == "Good") {

            System.out.println(company + " You are qualified for 3rd period");

        }else if (eligibilityForSecondPeriod = workHistory >= 3 && sales >= 60_000 && capital >= 60_000 && (pHistory == "Good" || pHistory == "Fair")){
}
    }
}



