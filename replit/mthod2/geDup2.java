package mthod2;

public class geDup2 {
    public static void main(String[] args) {
        String [] sentence ={"Ateeq", "Ateeq", "Nasrat", "wahid", "Ateeq", "Nasrat", "Ateeq", "javad", "Asad"};
        int count =0; String word = "Nasrat";



        for (String each : sentence) {
            if (each.equals(word)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
