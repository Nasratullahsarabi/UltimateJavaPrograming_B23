package statements;

import java.util.Scanner;

public class lapTopConfiguration2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select screen size:");
        double screen = scan.nextDouble();  double laptopPrice = 0;

        if (screen == 13.3){
            laptopPrice += 200;
        }else if (screen == 15){
            laptopPrice += 300;
        }else if (screen == 17.3){
            laptopPrice += 400;
        }else {
            System.out.println("Sorry we don't have that size");
        }
        System.out.println("Select CPU");
        String cpu = scan.next();
        if (cpu.equalsIgnoreCase("i3")){
            laptopPrice += 150;
        }else if (cpu.equalsIgnoreCase("i5")){
            laptopPrice += 250;
        }else if (cpu.equalsIgnoreCase("i7")){
            laptopPrice +=350;
        }else {
            System.out.println("Sorry we don't have that cpu type");
        }
        System.out.println("Select RAM size");
        double ram = scan.nextByte();
        laptopPrice += (50*ram/4);
        System.out.println("Select storage type");
        String storageType = scan.next();
        if (storageType.equalsIgnoreCase("hdd")){
            System.out.println("Selected memory size");
            double memory1 = scan.nextDouble();
            laptopPrice += (50*memory1/500);
        }else if (storageType.equalsIgnoreCase("ssd")){
            System.out.println("Select memory size");
            double memory2 = scan.nextDouble();
            laptopPrice += (100*memory2/500);
        }else {
            System.out.println("Sorry we don't have that memory size");
        }
        scan.nextLine();
        System.out.println("Select screen resolution");
        String screenResolution = scan.nextLine();
        if (screenResolution.equalsIgnoreCase("full HD")){
            laptopPrice += 100;
        }else if (screenResolution.equalsIgnoreCase("4k")){
            laptopPrice += 200;
        }else {
            System.out.println("Sorry we don't have that resultion type");
        }

        System.out.println("Laptop price is: "+laptopPrice);



        scan.close();
    }
}
