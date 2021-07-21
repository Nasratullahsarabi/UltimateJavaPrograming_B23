package mthod2;

import java.util.Scanner;

public class threeBoolean {
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){

        if (notEmpty == true && (taskId+1) == currentId ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));


        in.close();
    }
}
