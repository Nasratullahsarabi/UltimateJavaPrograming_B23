package day11_switch;

public class cybertekBatch {
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
        String batch = "EU Batch"; int time = 10;
        if (batch == "US Batch Morning"||batch=="US Batch Evening" || batch =="EU Batch" ){

            if (batch=="US Batch Morning"){
                batch = "Class times are 10-5 EST. M, T, Th, F";
            }else if (batch=="US Batch Evening"){
                batch = "Class times are 7-10 EST. M,T, Th,F,S,S";

            }else{
                batch = "Class times are 10-5 PST. M, T, W, Th, F";
            }
            System.out.println(batch);

        }else {
            batch = "Invalid Batch";
        }

        }

    }

