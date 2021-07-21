package statements;

public class billSummary {
    public static void main(String[] args) {

  /* the store gives discount on specific products and customers:
       2- buy 3 get %10 discount for total.
       3- customers with over 400 points can get 5$ off on the total.
 */
        String item = "Chocolate";
        int customerPoint=300,pricePerUnit=5,quantity=10,totalPrice = pricePerUnit*quantity;
        int discount1 = 5; double discount2 = totalPrice*0.1;
        double tax = totalPrice*0.1, tax1=(totalPrice-discount1-discount2)*0.1;
        double tax2 =(totalPrice-discount1)*0.1,tax3=(totalPrice-discount2)*0.1;
        boolean disc1 = customerPoint>=400 && quantity>=3;
        boolean disc2 = customerPoint>=400 && quantity<3;
        boolean disc3 = quantity>=3 && customerPoint<400;
        double finalPayment1 = totalPrice-discount1-discount2+tax1;
        double finalPymnt2 = totalPrice-discount1+tax2;
        double finalPymnt3 = totalPrice-discount2+tax3;
        System.out.println("Your bill summary");
        System.out.println("Customer Point: "+customerPoint);
        System.out.println("Item: "+item);
        System.out.println("Count: "+quantity);
        System.out.println("Price: "+pricePerUnit);
        System.out.println("T-Price: "+totalPrice);

        if (disc1){
            System.out.println("Discount Applied: "+(discount1+discount2));
        }
        if (disc2){
            System.out.println("Discount Applied: "+discount1);
        }
        if (disc3){
            System.out.println("Discount Applied: "+discount2);
        }
        if (disc1){
            System.out.println("After discount: "+(totalPrice-discount1-discount2)+"\n State Tax: "+tax1+"\nFinal Payment: "+finalPayment1);
        }
        if (disc2){
            System.out.println("After discount: "+(totalPrice-discount1)+"\n State Tax: "+tax2+"\nFinal Payment: "+finalPymnt2);
        }
        if (disc3){
            System.out.println("After discount: "+(totalPrice-discount2)+"\n State Tax: "+tax3+"\nFinal Payment: "+finalPymnt3);
        }
        if (!disc1 && !disc2&&!disc3){
            System.out.println("State Tax: "+tax+"\nFinal Payment: "+(totalPrice+tax));

        }


    }
}
