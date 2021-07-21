package statements;

public class atiqProjects {
    public static void main(String[] args) {

  /* the store gives discount on specific products and customers:
       1- buy 2 get 1 free
       2- buy 3 get %40 discount for total.
       3- customers with over 400 points can get 4$ off on the total.
 */

        String customerN = "Ahmad";
        int customerPnts = 300;                 // over 400 point, customer qualifies for $4 off
        String itemName = " Chocolate";         // this product indicates the discount
        int count = 2;                          // if buy 3 you get 1 free     or if buy 5 or more you get %30 discount on total.
        int eachPrice = 5;// price of product


        double totalPrice = count * eachPrice;
        double stateTax = count * eachPrice * 0.15;
        double totalAfterTax = totalPrice + stateTax; // the total amount customer is supposed to be before discount.

        // 4 categories of discount that may apply:
        int discount1 = 4;                      // if has over 400 reward points can get $4 off
        int discount2 = count / 3 * eachPrice;  // if buys 2 can get 1 free
        double discount3 = totalPrice * 0.30;    // if buys more than 5 can enjoy 30% off on total
        double discount4 = discount1 + discount3; // if has over 400 points and buys more than 5


        System.out.println("Your bill's Summary:"+customerN+customerPnts +"\nItem:"+itemName+"\nCount:"+count+"\n" +"Price:$"+eachPrice+"\nT-Price:$" + totalPrice + "\nStateTax:$"+stateTax);

        System.out.println("TotalAmount:      $" + totalAfterTax);


        //condition for discount eligibility:
        boolean discountEligible1 = customerPnts >= 400 && count < 3;
        boolean discountEligible2 = customerPnts < 400 && count >= 3 && count <= 5;
        boolean discountEligible3 = customerPnts < 400 && count > 5;
        boolean discountEligible4 = customerPnts >= 400 && count >= 5;


        if (discountEligible1) {
            System.out.println("Discount Applied:  $" + discount1 + "\n--------------------------\nTotalPaid:       $" + (totalAfterTax - discount1));

        }
        if (discountEligible2) {
            System.out.println("Discount Applied: $" + discount2 + "\n--------------------------\nTotalPaid:       $" + (totalAfterTax - discount2));

        }
        if (discountEligible3) {
            System.out.println("Discount Applied: $" + discount3 + "\n--------------------------\nTotalPaid:       $" + (totalAfterTax - discount3));

        }
        if (discountEligible4) {
            System.out.println("Discount Applied: $" + discount4 + "\n--------------------------\nTotalPaid:       $" + (totalAfterTax - discount4));

        } else if (!discountEligible1 && !discountEligible2 && !discountEligible3 && !discountEligible4) {
            System.out.println("Discount Applied: $0.00\n---------------------------\nTotalPaid:      $" + totalAfterTax);

        }


    }
}
