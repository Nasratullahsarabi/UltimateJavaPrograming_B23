package loopReplits;

import java.util.Arrays;

public class splitEmail {
    public static void main(String[] args) {
        String email = "info@cybertekschool.com"; String result = "";


        if (email.contains("@") && email.indexOf("@") == email.lastIndexOf("@")){

            String []arrOfEmail = email.split("@", 2);

            for (int i = 0; i < arrOfEmail.length-1; i++) {

                System.out.println("Email id: "+arrOfEmail[i]);
                System.out.println("Email domain: "+arrOfEmail[i+1]);

            }
        }else {


        }


        }
    }

