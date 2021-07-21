package array;

public class printInFourLines2 {
    public static void main(String[] args) {

        String []arr = {"apple", "banana", "kiwi", "grape", "milk", "soda", "juice", "coffee"};


        for (int i = 0; i < arr.length-1; i++) {

            System.out.println(arr[i]+", "+arr[i+1]);
            i++;

        }

    }
}
