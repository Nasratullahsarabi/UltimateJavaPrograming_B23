package statements;

public class atiqProjects3 {
    public static void main(String[] args) {

  /* the store gives discount on specific products and customers:
       1- buy 2 get 1 free
       2- buy 3 get %40 discount for total.
       3- customers with over 400 points can get 4$ off on the total.
 */
        String item = "Chocolate";
        int customerPoint=500,pricePerUnit= 5,quantity = 2;
        double discount1 = 4;
        double discount2 = 0.4;
        int totalPrice = pricePerUnit*quantity;
        System.out.println("Your bill summary");
        System.out.println("Customer Point: "+customerPoint);
        System.out.println("Item: "+item);
        System.out.println("Count: "+quantity);
        System.out.println("Price: "+pricePerUnit);
        System.out.println("T-Price: "+totalPrice);
        if (quantity>=3){

        }
        if (customerPoint>=400){
            System.out.println("Discount Applied: "+(discount1+(discount2*totalPrice)));
            double priceBeforeTax = (discount1+(discount2*totalPrice));
            double tax = priceBeforeTax*0.15;
            System.out.println("State Tax: "+tax);
            System.out.println("Payment: "+(priceBeforeTax-tax));

        }

    }
}
