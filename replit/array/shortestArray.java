package array;

public class shortestArray {
    public static void main(String[] args) {

        String[]arr = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};

        String shortes = "";

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i].length() > arr[j].length()){
                    shortes = arr[j];

                }

            }
        }
        System.out.println(shortes);
    }
}
