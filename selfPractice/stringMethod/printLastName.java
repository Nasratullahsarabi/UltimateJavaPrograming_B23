package stringMethod;

public class printLastName {
    public static void main(String[] args) {
        String name = "Nasratulla";
        char firstName = name.charAt(0);
        int index = name.length()-1;
        System.out.println(firstName);
        char lastName = name.charAt(index);
        System.out.println(lastName);
        System.out.println("================");
        String name2 = "Mohammadjawad";
        int lastIndex = name2.length()-1;
        char lastLetter = name2.charAt(lastIndex);

        System.out.println("lastLetter = " + lastLetter);
        System.out.println("-------------------------");

        String country = "Afghanistan";
        int lastIndex4 = country.length()-1;

        char lastC = country.charAt(lastIndex4);

        System.out.println("lastC = " + lastC);
        System.out.println("========================");
        String tv = "ElgeTheBest";
        String tvsub = tv.substring(7);
        String tvsub2 = tv.substring(4,7);

        System.out.println("tvsub = " + tvsub);
        System.out.println("tvsub2 = " + tvsub2);



    }
}
