package isEmptyPractice;

public class equals {
    public static void main(String[] args) {
        String car = "Toyota";
        String car1 = "Toyota";
        String car2 = new String("Toyota");
        String car3 = new String("Toyota");

        System.out.println(car==car1);
        System.out.println(car2.equals(car3));
    }
}
