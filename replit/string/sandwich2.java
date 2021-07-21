package string;

public class sandwich2 {
    public static void main(String[] args) {
        String word = "breadbutterbreadxx";


        if (word.indexOf("bread") != word.lastIndexOf("bread")){
            System.out.println(word.substring(word.indexOf("bread")+5, word.lastIndexOf("bread")));
        }else {
            System.out.println("nothing");
        }

    }
}
