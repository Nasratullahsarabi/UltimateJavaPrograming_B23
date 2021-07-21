package day11_switch;

public class switchStatement2 {
    public static void main(String[] args) {
        String name = "firefox";
        switch (name){
            case "chrome":
                System.out.println("Chrom Browser is selected");
                break;
            case "firefox":
                System.out.println("Firefox Browser is selected");
                break;
            default:
                System.out.println("Invalied Browser Name");
                break;
        }
    }
}
