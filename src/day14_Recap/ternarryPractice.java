package day14_Recap;

import java.util.Scanner;

public class ternarryPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number between 1 to 7");
        int number = scan.nextInt();
        String name = (number>=1 && number <=7)?
                (number==1)?"Mon":(number==2)?"Tue":(number==3)?"Wed":(number==4)?"thu"
        :(number==5)?"Fri":(number==6)?"Sat":"Sun"
        :"Not such a day";
        System.out.println(name);


        scan.close();
    }
}
