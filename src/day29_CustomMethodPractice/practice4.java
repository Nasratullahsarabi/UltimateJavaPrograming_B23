package day29_CustomMethodPractice;

public class practice4 {
    public static void main(String[] args) {

        int[]arr = {200,300,500,5,-1,0,-100,1000,2000};

        System.out.println(maxArr(arr));
        System.out.println(minArr(arr));


    }
    public static int max (int num1, int num2){
        return (num1>num2)?num1:num2;
    }

    public static int min (int num1, int num2){
        return (num1 < num2)?num1:num2;
    }

    public static int maxArr (int []arr1){
        int maxNum = arr1[0];
        for (int i = 0; i < arr1.length; i++) {

            maxNum = max(maxNum, arr1[i]);
        }
        return maxNum;
    }

    public static int minArr(int[]arr2){
        int minNum = arr2[0];
        for (int i = 0; i < arr2.length; i++) {

            minNum = min(minNum, arr2[i]);
        }
        return minNum;
    }
}
