package day10_moreStatments;

public class salaryAfterTax {
    public static void main(String[] args) {
        double salary = 190000;
        double taxRate = 0;
        if (salary>=130000){
            taxRate = 0.35;

        /*
        double tax1 = 0.35; // for salary of 130K ore more
        double tax2= 0.3; // for salary of 130K to 129K
        double tax3 = 0.25; // for salary of 80K to 99K
        double tax4 = 0.2; // for salary of 79K or less
        if (salary>=130000){
            System.out.println(salary-salary*tax1);

         */
        }else if (salary>=100000){
            taxRate = 0.30;
        }else if (salary>=80000){
            taxRate = 0.25;
        }else{
            taxRate = 0.20;
        }
        boolean isMarried = true;
        if (isMarried){
            taxRate -=0.05;
        }
        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("Salary After Tax "+ salaryAfterTax);
    }
}
