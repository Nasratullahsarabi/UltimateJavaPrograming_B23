package day12_scanner;

public class passengerMembers {
    public static void main(String[] args) {
        int numberOfPeople = 100; String result = "";
        switch (numberOfPeople){
            case 50:
                result= "20 crew, 30 passenger";
                break;
            case 75:
                result= "25 crew, 50 passenger";
                break;
            case 100:
                result= "30 crew, 70 passenger";
                break;
            default:
                result = "not valid";


        }
        System.out.println("result = " + result);
    }
}
