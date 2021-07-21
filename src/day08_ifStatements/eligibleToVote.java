package day08_ifStatements;

public class eligibleToVote {
    public static void main(String[] args) {
        String name = "James";
        int age = 25;
        String citizen = "USA";
        boolean eligibleToVote = age>=22 && citizen == "USA";
        if (eligibleToVote){ // if the person is eligible
            System.out.println(name+" is eligible to vote");

        }
        if(!eligibleToVote){ // if the person is not eligible
            System.out.println(name+ " is not eligible to vote");
        }
    }
}
