package array;

public class temprature {
    public static void main(String[] args) {

        int[]temp = {80, 88, 88, 84, 82, 78, 60, 68};
        int sum = 0, count = 0;

        for (int i = 0; i < temp.length; i++) {
            sum+=temp[i];
            count++;
        }
        System.out.println((double)sum/count);
    }
}
