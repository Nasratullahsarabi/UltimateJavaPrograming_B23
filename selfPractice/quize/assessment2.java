package quize;

public class assessment2 {
    public static void main(String[] args) {

        String one = "Nasrullah";
        String two = "Asadul";

        String merge = "";
        String merge2 = "";

        for (int i = 0; i < one.length() && i < two.length(); i++) {

            merge += ""+one.charAt(i)+two.charAt(i);
        }
        System.out.println(merge);
    }
}