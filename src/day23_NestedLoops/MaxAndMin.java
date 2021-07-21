package day23_NestedLoops;

public class MaxAndMin {
    public static void main(String[] args) {

        int []number = {5, 8, 9, 2, 0, 3, 10}; int max = number[0]; int min = number[0];

        for (int i = 0; i < number.length;i++){
            int each = number[i];

            if (each > max){
                max = each;
            }
            if ( each < min){
                min = each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
