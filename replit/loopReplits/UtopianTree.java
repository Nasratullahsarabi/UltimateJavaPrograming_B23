package loopReplits;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 0, size = 0, growth = 1;

        for (int i = 0; i < 10; i++) {

            year++; size++;
            if (year > 3){
               growth = (year+2)/3;
               size++;
            }else {
                growth = 1;
            }

            System.out.println("year "+year+" - growth "+growth+" cm\ntree size: "+size+"cm");
            System.out.println();
        }

    }
}
