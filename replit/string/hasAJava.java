package string;

public class hasAJava {
    public static void main(String[] args) {
        String word = "xxjava";
        boolean hasJava= word.startsWith("java") || word.substring(1).startsWith("java");

        System.out.println(hasJava);



    }
}
