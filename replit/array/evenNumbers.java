package array;

public class evenNumbers {
    public static void main(String[] args) {

    int[]num = {2, 2, 0, 3, 5, 4}; int count = 0;

        for (int i = 0; i < num.length; i++) {

            if (i % 2 == 0){
                count++;
            }

        }
        System.out.println(count);
        System.out.println();
        System.out.println("==================================================");

        int[]arr = {6, 2, 2, 0, 3, 5, 4};

        int qauntity = 0;

        for (int each : arr) {

            if (each % 2 ==0){

                qauntity++;
            }

        }
        System.out.println(qauntity);
    }
}
