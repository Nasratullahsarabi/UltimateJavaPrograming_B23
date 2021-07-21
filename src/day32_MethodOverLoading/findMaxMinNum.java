package day32_MethodOverLoading;

public class findMaxMinNum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        double arr2[] = {1.9,2.1,3,4,5.6,6,7,8,9,10};

        System.out.println(max(arr));

        System.out.println(min(arr));

        System.out.println(max(arr2));

        System.out.println(min(arr2));
        
    }
    public static int max(int[]arr){
        int max = arr[0];
        
        for (int each : arr){
            max = Math.max(each,max);
        }
        return max;
    }

    public static double max(double[]arr){
        double max = arr[0];

        for (double each : arr){
            max = Math.max(each,max);
        }
        return max;
    }

    public static int min(int[]arr){
        int min = arr[0];

        for (int each : arr){
            min = Math.min(each,min);
        }
        return min;
    }

    public static double min(double[]arr){
        double min = arr[0];

        for (double each : arr){
            min = Math.min(each,min);
        }
        return min;
    }
    
    
    
    
}
