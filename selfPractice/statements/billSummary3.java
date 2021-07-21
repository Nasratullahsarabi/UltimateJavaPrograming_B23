package statements;

public class billSummary3 {
    public static void main(String[] args) {
        String item = "Mobile"; int customerPoint = 500;
        int unit = 1, unitPrice = 1200, totalPrice = unit*unitPrice;
        double discount1 = 200, discount2 = totalPrice*0.1, discount3 = discount1+discount2;
        double tax=totalPrice*0.1;
        double tax1=totalPrice-discount1, tax2=totalPrice-discount2, tax3= totalPrice-discount3;
        double payment = totalPrice+tax, payment1 = totalPrice-discount1+tax1;

    }
}
