package mthod2;

public class findUniqueElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2,6,7,7};

        String uniqueEl = "";

        for (int i = 0; i < arr.length;i++){
            int count = 0;

            for (int j = 0;j < arr.length;j++){

                if (arr[i] == arr[j]){
                    count++;

                }
            }
            if (count == 1){
               // uniqueEl+=arr[i];
                System.out.println(arr[i]);
            }
        }


    }
}
