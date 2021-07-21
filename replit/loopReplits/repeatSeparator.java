package loopReplits;

public class repeatSeparator {
    public static void main(String[] args) {

        String word = "this";
        String sep = "and";
        int num = 2;
        String result = "";

        for (int i = 0; i < num; i++) {

            result+= word;
            if (i == num-1)
                break;
            result+=sep;
        }
        System.out.println(result);
    }
}
