package day29_CustomMethodPractice;

public class returnMethod3 {
    public static void main(String[] args) {
        String name = "Nasrat";
        revers(name);

        palindrom(name);

    }
    public static String revers(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result+=str.charAt(i);
        }
        System.out.println(result);
        return result;
    }
    public static void palindrom (String str1){
        String reversedN = revers(str1);

        if (reversedN.equals(str1)){
            System.out.println(str1+" is palindrom");
        }else {
            System.out.println(str1+" is not palindrom");
        }
    }
}
