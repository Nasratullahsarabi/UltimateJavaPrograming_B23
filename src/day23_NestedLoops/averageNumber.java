package day23_NestedLoops;
public class averageNumber {
    public static void main(String[] args) {
        int []averag1 = {11, 22, 5, 43, 57};
        int[]number = new int[5];
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            number[i] = averag1[i];

            sum+=number[i];
        }
        System.out.println(sum);

        System.out.println((double) sum/number.length);
        System.out.println(sum/number.length);




    }
}
