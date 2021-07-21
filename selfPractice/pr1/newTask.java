package pr1;

public class newTask {
    public static void main(String[] args) {
/*
Name applicant,
salary 150000
age 50


 */
        String name = "Applicant";
        int salary = 2100;
        int age = 40;
        int children = 2;
        boolean tax= salary>=1&&salary<=2000&&children>=0&&children<=1&&age>=20&&age<=40;
        System.out.println("You are eligible for two bed: "+tax);
        boolean tax1=salary>=1&&salary<=2500&&children>=2&&children<=3&&age>=20&&age<=40;
        System.out.println("You are eligible for two bed: "+tax1);
        boolean tax2= salary>=1&&salary<=3000&&children>=4&&children<=5&&age>=20&&age<=40;
        System.out.println("You are eligible for two and three bed: "+tax2);
        boolean tax3= salary>=1&&salary<=3500&&children>=6&&children<=7&&age>=20&&age<=40;
        System.out.println("You are eligible for two and three bed: "+tax3);
        boolean tax4=salary>2000 && children>0&&children<2 || salary>2500&&children<3&&children>2||salary>3000&&children<3 &&children<5||salary<3500&&children<5;
        System.out.println("sorry you are not eligible: "+tax4);

    }
}
