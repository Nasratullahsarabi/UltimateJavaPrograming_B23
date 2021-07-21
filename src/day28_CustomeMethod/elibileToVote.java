package day28_CustomeMethod;

public class elibileToVote {
    public static void main(String[] args) {

        votEligibility(18);

    }
    public static void votEligibility(int age){
        if (age >=21){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }

    }
}
