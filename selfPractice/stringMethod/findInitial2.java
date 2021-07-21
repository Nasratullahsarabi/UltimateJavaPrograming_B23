package stringMethod;

public class findInitial2 {
    public static void main(String[] args) {
        String fullName = "Cybertek school";

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        String intial = firstName.substring(0,1)+"."+lastName.substring(0,1);

        System.out.println(intial.toUpperCase());











    }
}
