package array;

public class findMax {
    public static void main(String[] args) {

        int []arr = {1, 33, 5, 7, 9}; int max = 0;

        for (int i = 0; i < arr.length; i++) {

            int eachElement = arr[i];

            if (eachElement > max){
                max = eachElement;
            }

        }
        System.out.println(max);
    }
}
