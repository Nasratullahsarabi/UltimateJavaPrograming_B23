package statements;

import java.util.Scanner;

public class laptopConfiguration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double laptopPrice = 0;
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if (screenSize == 13.3){
            laptopPrice += 200;
        }else if (screenSize == 15){
            laptopPrice += 300;
        }else if (screenSize == 17.3){
            laptopPrice += 400;
        }else{

        }
        System.out.println("Select CPU type");
        String cpu = scan.next();
        if (cpu.equals("i3")){
            laptopPrice += 150;
        }else if (cpu.equals("i5")){
            laptopPrice +=250;
        }else if (cpu.equals("i7")){
            laptopPrice +=350;
        }else {

        }
        System.out.println("Enter ram size");
        byte ram = scan.nextByte();
        laptopPrice+=ram;
        System.out.println("Enter storage type");
        String storageType = scan.next();

        if (storageType.equalsIgnoreCase("hdd")){
            System.out.println("Selecte memory size");
            int memorySize = scan.nextInt();
            laptopPrice += 50/500*memorySize;
        }else if (storageType.equalsIgnoreCase("ssd")){
            System.out.println("Selecte memory size");
            int memorySize = scan.nextInt();
            laptopPrice += 100/500*memorySize;
        }else{

        }
        System.out.println("Enter screen resolution");
        String resolution = scan.next();
        if (resolution.equalsIgnoreCase("fullhd")){
            laptopPrice += 100;
        }else if (resolution.equalsIgnoreCase("4k")){
            laptopPrice += 200;
        }else {

        }
        System.out.println("Laptop price is: $"+laptopPrice);

        scan.close();
    }
}
