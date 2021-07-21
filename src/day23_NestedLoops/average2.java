package day23_NestedLoops;

public class average2 {
    public static void main(String[] args) {
        int[]numbers = {10, 50, 30, 20, 70, 100, 90}; //sum, max, min, ave
        int sum = 0, max = numbers[0], min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int each = numbers[i];

            sum+=each;
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }

        }
        System.out.println("sum = " + sum);
        System.out.println("average: "+(double)sum/numbers.length);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
