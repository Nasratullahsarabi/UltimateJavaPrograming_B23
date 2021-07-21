package day14_Recap;

import java.util.Scanner;

public class switchPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of poeple you live with");
        short num = scan.nextShort();

        if (num>=1){

            switch (num){
                case 1:
                case 2:
                    System.out.println("Live with less than 3 poeple");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Live with 3 - 6 poeple");
                    break;
                default:
                    System.out.println("Live with more than 6 poeple");

            }


        }else {
            System.out.println("invalid number");
        }

        scan.close();
    }
}
