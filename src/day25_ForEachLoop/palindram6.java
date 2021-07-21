package day25_ForEachLoop;

import java.util.Arrays;

public class palindram6 {
    public static void main(String[] args) {
        String[]names = {"Muzafar", "Hashmat", "Hedayat", "Hamasa"};
        String[]rev = new String[names.length];

        for (int j = 0; j < names.length; j++) {

        String element = names[j], result = "";

        for (int i = element.length()-1;i >=0;i--){
            result+=element.charAt(i);
        }
        rev[j]=result;
        }

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(rev));
        System.out.println("===================================");

        String[]revers2 = new String[rev.length];

        String element2 = revers2[0];

        int y = 0;
        for (int i = 0;i < element2.length();i++){



        }




    }
}
