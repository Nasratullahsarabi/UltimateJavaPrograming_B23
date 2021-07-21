package variables1;

public class phoneNumber {
    public static void main(String[] args) {
        /*
        Write a program that asks user to input int values: areaCode and localNumber.

Using concatenation put together in this format and assign to String phoneNumber variable:
(222)-3334444

Write a print statement that displays (use the phoneNumber variable ):
Calling number (222)-3334444
         */
        String phoneNuber = "Calling number";
        int areaCode = 222,
                localNumber = 3334444;
        System.out.println(phoneNuber+"  ("+areaCode+")-"+localNumber);
     }
}
