package toUpperAndLowerCasePractice;

public class trime {
    public static void main(String[] args) {
        String country  = "               Afghanistan   ";
        country = country.trim();
        System.out.println("country = " + country);
        System.out.println("================================");
        String university = "  Balkh University    ";

        university = university.trim();
        System.out.println("university = " + university);
        System.out.println("========================");
        String car = "    toyota ";

        String carTrim = car.trim();
        System.out.println("carTrim = " + carTrim);
    }
}
