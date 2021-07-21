package day25_ForEachLoop;

public class oddAndEvenNumbers {
    public static void main(String[] args) {

        int[]number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int odd = 0, even = 0;

        for (int i : number) {

            if (i%2!=0){
                odd++;
            }else {
                even++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
    }
}
