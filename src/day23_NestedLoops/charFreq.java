package day23_NestedLoops;

public class charFreq {
    public static void main(String[] args) {
        int[] number = {5, 5, 5, 6, 6, 6, 6, 6, 8, 8, 8, 8, 3, 4}; int freq = 0; int count = 4;

        for (int i = 0; i < number.length; i++) {
            if (number[i] == count){
                freq++;
            }
            System.out.print(freq+" ");
        }

    }
}
