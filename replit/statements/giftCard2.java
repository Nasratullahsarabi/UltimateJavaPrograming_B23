package statements;

public class giftCard2 {
    public static void main(String[] args) {
        String input = "Blanket"; int balance = 100; String result = "";

        if (input.equals("Blanket")|| input.equals("Charger")|| input.equals("Hat")
                || input.equals("Headphon")|| input.equals("Laptop")|| input.equals("Pants")
                || input.equals("Pillow")|| input.equals("Smartphone")|| input.equals("Socks")
                ||input.equals("USB cable")){
            switch (input){
                case "Blanket":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-60)+"$";
                    break;
                case "Charger":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-15)+"$";
                    break;
                case "Hat":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-25)+"$";
                    break;
                case "Headphone":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-30)+"$";
                    break;
                case "Laptop":
                case "Smartphone":
                    result = "Sorry, not funds on your gift card!: ";
                    break;
                case "Pants":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-50)+"$";
                    break;
                case "Pillow":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-40)+"$";
                    break;
                case "Socks":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-5)+"$";
                    break;
                case "USB cable":
                    result = "Thank you for your purchase!\nYour current balance is: "+(balance-10)+"$";
                    break;
                default:
                    result = "Invalid price";
            }
        }else {
            result = "Invalid item!";
        }

        System.out.println(result);
    }
}
