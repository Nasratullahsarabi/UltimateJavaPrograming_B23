package day24_Arrays;

public class freqPractice {
    public static void main(String[] args) {
        int[]arr = {1, 1, 4, 3, 2, 4, 5};

        for (int j = 0; j < arr.length; j++) {

            int element = arr[j]; int count = 0;

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == element){
                    count++;
                }

            }

            if (count==1){
                System.out.print(element+",");
            }


        }




    }
}
