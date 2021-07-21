package string;

import java.util.Scanner;

public class smsMessage2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        int indexOfCh1 = message.indexOf("<");
        int indexofCh2 = message.indexOf(">");
        int indextOfCh3 = message.indexOf("[");
        int indexOfCh4 = message.indexOf("]");
        int indextOfCh5 = message.indexOf("{");
        int indexOfCh6 = message.indexOf("}");

        String senderF = message.substring(indexOfCh1+1 ,indexofCh2);
        String phoneF = message.substring(indextOfCh3+1,indexOfCh4);
        String messageBodyF = message.substring(indextOfCh5+1,indexOfCh6);

        System.out.println("Sender: "+senderF+"\nPhone Number: "+phoneF+"\nMessage body: "+messageBodyF);


        scan.close();



    }
}
