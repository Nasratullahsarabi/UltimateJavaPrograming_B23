package loop;

public class findUniqeLetter {
    public static void main(String[] args) {
        String word = "aabbccddj"; String result = "";
        for (int i = 0; i <=word.length()-1;i++){
            char uniqe = word.charAt(i);
            boolean isUnique = word.indexOf(uniqe) == word.lastIndexOf(uniqe);

            if (isUnique){
               result += uniqe;
            }
        }
        System.out.println(result);
    }
}
