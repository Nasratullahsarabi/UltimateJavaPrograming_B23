package day27_recap;

import java.util.Arrays;

public class shopping {

    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        boolean hasItem = false;
        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("iPad")){
                System.out.println();
                System.out.println("your price is: "+prices[i]+"and item id is: "+itemIDs[i]);
                System.out.println();
            }
            if (items[i].equals("Glove")){
                hasItem = true;
            }
            System.out.println();
            System.out.println(items[i]+" "+prices[i]+" "+itemIDs[i]);

        }
        System.out.println(hasItem);




    }
}
/*
String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print a report of each shopping item
            name - price -#ID
 */