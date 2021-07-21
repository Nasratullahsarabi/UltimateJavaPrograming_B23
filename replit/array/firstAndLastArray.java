package array;

public class firstAndLastArray {
    public static void main(String[] args) {
        String []arr = {"hello", "why", "by", "apple" , "note"};

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i].charAt(0)+""+arr[i].charAt(arr[i].length()-1));

        }
    }
}
