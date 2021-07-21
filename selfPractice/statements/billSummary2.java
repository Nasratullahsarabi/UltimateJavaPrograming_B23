package statements;

public class billSummary2 {
    public static void main(String[] args) {
        /*
        A company offers the following discounts:
        1. buy more then 3 you will get 10% discount in total
        2. customers with more or equal to 500 points get 5% discount
         */
        String item = "Energy Drink";
        int customerPoint = 500, price = 5, count=4, totalPrice=price*count;
        double dscnt1 = totalPrice*0.1, dscnt2 = totalPrice*0.05;
        double dscnt3 = dscnt1+dscnt2;
        double tax1 = (totalPrice-dscnt1)*0.1;
        double tax2 = (totalPrice-dscnt2)*0.1;
        double tax3= (totalPrice-dscnt3)*0.1;
        double tax4 = totalPrice*0.1;
        double payment1 = totalPrice-dscnt1+tax1;
        double payment2 = totalPrice-dscnt2+tax2;
        double payment3 = totalPrice-dscnt3+tax3;
        double payment4 = totalPrice+tax4;
        System.out.println("Bill summary");
        System.out.println("Customer Point:   "+customerPoint);
        System.out.println("Item: "+item);
        System.out.println("Count: "+count);
        System.out.println("Prince/Unit: "+price);
        System.out.println("Total Price: "+totalPrice);
        if (customerPoint>=400 && count <3){
            System.out.println("Discount:  "+dscnt1+"\nState Tax: "+tax1+"\nPayment: "+payment1);
        }else if (customerPoint<400 && count >=3){
            System.out.println("Discount: "+ dscnt2+"\nState Tax: "+tax2+"\nPayment: "+payment2);
        }else if (customerPoint>=400 && count >=3){
            System.out.println("Discount: "+dscnt3+"\nState Tax: "+tax3+"\nPayment: "+payment3);
        }else{
            System.out.println("State Tax: "+tax4+"\nPayment: "+payment4);
        }



    }
}
