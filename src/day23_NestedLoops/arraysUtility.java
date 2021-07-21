package day23_NestedLoops;
import java.util.Arrays;
public class arraysUtility {
    public static void main(String[] args) {

        String[]names = {"Nasrat", "Ateeq", "Jawad", "Asad", "Wahid"};
        int[]number = {3, 5, 1, 8, 4, 0, 9};

        Arrays.sort(names); Arrays.sort(number);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(number));

        int[]number1 = {3, 5, 1, 8, 4, 0, 9};
        int[]number2 = {3, 5, 1, 8, 4, 0, 9};

        boolean equal = Arrays.equals(number1, number2);

        System.out.println(equal);

    }
}
