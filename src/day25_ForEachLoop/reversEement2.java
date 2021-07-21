package day25_ForEachLoop;

public class reversEement2 {
    public static void main(String[] args) {

        String[]array = {"Java", "Paython", "C#"};

        for (String element:array) {

            String revers = "";

            for (int i = element.length()-1; i >= 0; i--) {
                revers+=element.charAt(i);

            }
            System.out.println(revers);
        }
    }
}
