package loopReplits;

public class UtopianTree3 {
    public static void main(String[] args) {

        int year = 0, size = 0, growth = 1; String result = "";

        for (int i = 0; i < 10; i++) {
            year++; size++;

            if (year < 3){
                growth = 1;
                result = "year "+year+" - growth "+growth+" cm\ntree size: "+size+"cm";
            }else if (year == 3){
                growth = 1;
                result = "year "+year+"  - growth "+growth+" cm\ntree size: "+size+"cm";
            } else{
                growth = 2; size++;
                result = "year "+year+" - growth "+growth+" cm\ntree size: "+size+"cm";
            }

            System.out.println(result);
            System.out.println();
        }


    }
}
