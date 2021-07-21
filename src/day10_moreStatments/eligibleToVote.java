package day10_moreStatments;

public class eligibleToVote {
    public static void main(String[] args) {
        int age = 10;
        String vote = (age>=20)? "Eligible to Vote":"Not Eligible to vote";
        System.out.println("vote = " + vote);
    }
}
