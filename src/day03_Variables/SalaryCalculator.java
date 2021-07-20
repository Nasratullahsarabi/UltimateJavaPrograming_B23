package day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        int hourlyRate = 30;
        int weeklyHours = 40;
                int yearlySalary = hourlyRate * weeklyHours * 52;

        System.out.println(yearlySalary);

        double taxRate = 0.32;
        double totalTax = yearlySalary * taxRate;
        double netSalary = yearlySalary - totalTax;

        System.out.println(netSalary);

        System.out.println();
    }
}
