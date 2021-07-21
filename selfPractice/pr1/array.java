package pr1;

public class array {
    public static void main(String[] args) {
        int[]number = {1,-2,3,0,-9,5};

        for (int i = 0; i < number.length; i++) {

            if (number[i] > 0){
                System.out.println("positive");
            }else if (number[i] < 0){
                System.out.println("negative");
            }else {
                System.out.println("zero");
            }

        }
    }
}
