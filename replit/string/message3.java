package string;

import java.util.Scanner;

public class message3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        int indexOfCh1 = message.indexOf("<");
        int indexofCh2 = message.indexOf(">");
        int indextOfCh3 = message.indexOf("[");
        int indexOfCh4 = message.indexOf("]");
        int indextOfCh5 = message.indexOf("{");
        int indexOfCh6 = message.indexOf("}");

        String sender = message.substring(0 ,indexOfCh1)+message.substring(indexOfCh1+1, indexofCh2);
        String phoneNumber = message.substring(indexofCh2+3,indextOfCh3)+message.substring(indextOfCh3+2, indexOfCh4);
        String messageBody = message.substring(indexOfCh4+3,indextOfCh5)+message.substring(indextOfCh5+1,indexOfCh6);

        System.out.println(sender+"\n"+phoneNumber+"\n"+messageBody);

        scan.close();
    }
}
