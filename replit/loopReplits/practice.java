package loopReplits;

public class practice {
    public static void main(String[] args) {
        int number = 6; int count = 0;

        if (number == 0) {
            System.out.println("-------EXTINCTION--------------");

        }else {
            for (int i = number; i > 0; i--) {

                System.out.println("Day " + count + "[" + i + "]");
                i /= 2;
                i++;
                count++;
                if (i == 1){
                    System.out.println("---EXTINCTION---");
                }
            }
        }

    }
}
