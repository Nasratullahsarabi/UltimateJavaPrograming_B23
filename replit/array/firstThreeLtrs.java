package array;

public class firstThreeLtrs {
    public static void main(String[] args) {

        String []arr = {"hello", "why", "bye", "apple" , "note"};

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i].substring(0,3));

        }
    }
}
