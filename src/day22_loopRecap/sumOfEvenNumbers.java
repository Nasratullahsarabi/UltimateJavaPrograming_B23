package day22_loopRecap;

public class sumOfEvenNumbers {
    public static void main(String[] args) {
        int odd = 0, even = 0, i = 0;

        do {
            if (i%2==0){
                even+=i;
            }else {
                odd+=i;
            }
            i++;
        }while (i<10);

        System.out.println(even);
        System.out.println(odd);

    }
}
