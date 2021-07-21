package loop;

public class removeDuplicates {
    public static void main(String[] args) {
        String name = "Nasratttulllaahh"; String result = "";

        for (int i = 0; i < name.length(); i++) {
            if (!result.contains(""+name.charAt(i))){
                result+= name.charAt(i);
            }

        }
        System.out.println(result);
    }
}
