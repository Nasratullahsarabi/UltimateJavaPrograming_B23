package day11_switch;

public class nestedIfPractice {
    public static void main(String[] args) {
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
        String batchType = "EU";
        boolean isValid = batchType=="US morning"||batchType=="US evening"||batchType=="EU";
        String result = "";

        if(isValid){
            if (batchType=="US morning"){
                result = "class time are 10-5 EST. M,T,W,Th,F.";
            }else if (batchType=="US evening"){
                result = "class time are 7-10 EST. M,T,W,Th,F,S,S";
            }else{
                result = "class times are 10-5 PST. M,T,W,Th,F.";
            }

        }else{
           result = "Invalid Batch Type";
        }
        System.out.println(result);
        System.out.println("-----------------------------");
        int age = 15; String ageGroup = "";
        if (age >= 0 && age <= 150){
            if(age<21){
                ageGroup="Teenager";
            }else if(age>=21 &&age<=55){
                ageGroup = "Adult";
            }else{
                ageGroup = "Senior";
            }

        }else {
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);
    }
}
