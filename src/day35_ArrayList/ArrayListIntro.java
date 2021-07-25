package day35_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(0,50);
        num.add(20);
        num.add(0,45);
        num.add(30);

        System.out.println(num);

        System.out.println(num.get(3));

        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i)+" ");
        }
        System.out.println();
        System.out.println("============================");
        for (Integer each : num) {
            System.out.print(each+" ");
        }


    }
}
