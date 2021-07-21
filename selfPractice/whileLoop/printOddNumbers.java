package whileLoop;

public class printOddNumbers {
    public static void main(String[] args) {

        int evenNumbers = 0;
        while (evenNumbers<=15){
            if (evenNumbers%2==0){
                System.out.print(evenNumbers);
            }
            evenNumbers++;
        }
        System.out.println();
        System.out.println("================================");
         int oddNumbers = 0;
         while (oddNumbers<=15){
             if (oddNumbers%2!=0){
                 System.out.print(oddNumbers);
             }
             oddNumbers++;
         }
        System.out.println();
        System.out.println("================================");
        int num = 0;

        while (num<50){
            if (num%2==0){
                System.out.print(num);
            }
            num++;

        }
        System.out.println();
        System.out.println("================================");

        int n = 0;
        while (n<9){
            if (n%2!=0){
                System.out.print(n);
            }
            n++;
        }
        System.out.println();
        System.out.println("================================");
        int n2 = 0;

        while (n2<10){
            if (n2%2==0){
                System.out.print(n2);

            }
            n2++;
        }
    }
}
