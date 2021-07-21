package day11_switch;

public class tennaryPractices {
    public static void main(String[] args) {
        double salary = 50000; int creditScore = 650; String eligible = "";
        eligible = (salary>=60000 && creditScore>=650)?"Loan Approved":"Loan Denied";
        System.out.println(eligible);
        /*
         Given two values: yearly salary and credit score determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650
                    Otherwise print: "Loan Denied"
             NOTE: MUST APPLY TERNARY
         */
        System.out.println("-------------------------");
        String sport = "Soccer";
        int amount = (sport=="Soccer" || sport == "Tennis")? 100 : 50;
        System.out.println(amount);
        /*
        Given a sport you play at the community center you will have to pay some entrance fee.

                    Soccer or Tennis fee is: 100
                    Otherwise fee is: 50
               NOTE: MUST APPLY TERNARY
         */
        System.out.println("------------------------------");
        int n1 = 6, n2 = 2, n3 = 3; String result = "";
        result = (n1>2 && n1>n3)?n1+" n1 is bigger":(n2>n1&&n2>n3)?n2+" n2 is bigger":n3+" n3 is bigger";
        System.out.println(result);

        /*
        write a program that checks for the bigger of 3 numbers.
        you get 3 int variables with different values: n1 , n2 and n3
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
         NOTE: MUST APPLY TERNARY
         */
        System.out.println("--------------------------");



        /*
        In Cybertek we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        First figure out is is a US batch or EU batch

            - for US batches:

                > Figure out is it a morning batch or evening batch
                    > morning - print: Class times are 10-5 EST. M, T, Th, F.
                    > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

            - for EU batches:

                > print: Class times are  10-5 EST. M, T, W, Th, F.

              If Batch type is not EU or US, print Invalid Batch
                NOTE: MUST APPLY NESTED IF
         */

    }
}
