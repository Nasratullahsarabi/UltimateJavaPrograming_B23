package statements;

import java.util.Scanner;

public class quize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        if(a.equals("a")){
            System.out.println(a+" is wrong");
        }else if(a.equals("b")){
            System.out.println(a+" is correct");
        }else if(a.equals("c")){
            System.out.println(a+" is wrong");
        }else{
            System.out.println(a+" is invalid");
        }

        scan.close();
    }
}
