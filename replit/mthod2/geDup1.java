package mthod2;

public class geDup1 {
    public static void main(String[] args) {

        String [] str = {"1","g","aabb","7","7","2","aa","7","1"};
        int countDup = 0;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {

                if (str[i].equals(str[j])){
                    count++;
                }
            }
            if (count >1){
                countDup++;
            }
        }
        System.out.println(countDup);
    }
}
