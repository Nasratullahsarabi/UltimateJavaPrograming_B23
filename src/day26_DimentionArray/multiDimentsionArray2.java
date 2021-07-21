package day26_DimentionArray;

public class multiDimentsionArray2 {
    public static void main(String[] args) {

        int[][][]arr = { {{7, 8, 9}, {15, 16}}, {{1, 2, 3}, {4, 5, 6}}, {{10, 11}, {12, 13, 14}} };

        for (int[][] each1 : arr) {
            for (int[] each2 : each1) {
                for (int element : each2) {

                    System.out.print(element+" ");

                }


            }

        }
    }
}
