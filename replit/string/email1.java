package string;

public class email1 {
    public static void main(String[] args) {
        String email = "nasratsarabi@gmail.com";

        int indexOf_ = email.indexOf("_");
        int indextOfAt = email.indexOf("@");

        if (email.contains("_")){
            String firstName = email.substring(0, indexOf_);
            String lastName = email.substring(indexOf_+1, indextOfAt);
            System.out.println(lastName+"_"+firstName+email.substring(indextOfAt));

        }else {
            System.out.println(email);
        }





    }
}
