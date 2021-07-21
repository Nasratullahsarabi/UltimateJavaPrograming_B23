package day04_Variables;

public class TaxCalculation {

    public static void main(String[] args) {

        int salary = 100000;
        double stateTax = 0.08;
        double federalTax = 0.21;
        double totalStateTax = salary*stateTax;
        double totalfederalTax = salary*federalTax;
        double salaryAfterTax = salary - totalfederalTax - totalStateTax;
        System.out.println("Your salary is "+salary);

        // you need to pay totalStateTax to sateTax
        System.out.println("you need to pay "+totalStateTax+  "of state tax");
        System.out.println("you need to pay "+totalfederalTax+  "of federal tax");
        System.out.println("your take home salary is " +salaryAfterTax);


    }
}
