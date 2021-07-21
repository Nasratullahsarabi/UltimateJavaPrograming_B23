package day27_recap;

public class firstUniqElement {
    public static void main(String[] args) {

        int []nums = {1, 1, 2, 3, 3, 4 };
        int frstUnqeElmnt = 0;

        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] ==  nums[j]){
                    freq++;
                }
            }
            if (freq == 1){
                frstUnqeElmnt = nums[i];
                break;
            }
        }
        System.out.println(frstUnqeElmnt);

    }
}
/*
write a program that can return the first uniq element from the above array
 */