package day35_ArrayList;

import java.util.ArrayList;

public class DontKnow {
    public static void main(String[] args) {

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        ArrayList<Character> removeDup = new ArrayList<>();

        for (int i = 0; i < characters.size(); i++) {

            if (!removeDup.contains(characters.get(i))){
                removeDup.add(characters.get(i));
            }
        }
        System.out.println(removeDup);
        System.out.println("===========================================");

        ArrayList<String> names = new ArrayList<>();

        names.add("Nasrat");
        names.add("Asad");
        names.add("Ateeq");
        names.add("Wahid");
        names.add("Asad");
        names.add("Ateeq");

        ArrayList<String> removeDup1 = new ArrayList<>();
        String result = "";

        for (String each: names){
            if (!removeDup1.contains(each)){
                removeDup1.add(each);
                result+=each+" ";
            }
        }
        System.out.println(removeDup1);
        System.out.println(result);
        System.out.println("----------------------------------------------------------------");
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(20);
        num.add(10);
        num.add(30);
        num.add(50);
        num.add(10);
        num.add(30);
        num.add(10);

        ArrayList<Integer> removeDup2 = new ArrayList<>();
        String result2 = "";

        for (Integer each : num){
            if (!removeDup2.contains(each)){
                removeDup2.add(each);
                result2+=each+" ";
            }
        }
        System.out.println(removeDup2);
        System.out.println(result2);
        System.out.println("=================================");

        for (int i = num.size()-1; i >= 0 ; i--) {

            System.out.print(num.get(i)+" ");
        }
    }
}
