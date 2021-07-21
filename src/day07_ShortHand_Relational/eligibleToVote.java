package day07_ShortHand_Relational;

public class eligibleToVote {
    public static void main(String[] args) {
        String name = "Aaron King";
        int age = 34;
        String citizen = "UK";
        int creditScore = 700;

        /*
        to vote:
        1. Must be US citizen
        2. at least 18 years old
         */
        boolean eligibleToVote = age >= 18 && citizen =="USA" && creditScore >=700;
        System.out.println(name+" is eligible to vote for Biden: "+eligibleToVote);

    }
}
