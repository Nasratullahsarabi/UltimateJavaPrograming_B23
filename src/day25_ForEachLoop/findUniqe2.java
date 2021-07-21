package day25_ForEachLoop;

public class findUniqe2 {
    public static void main(String[] args) {
        String[]names = {"Nasrat", "Ateeq", "Ateeq", "Wahid", "Asad"};



        for (String each2: names) {
            int count = 0;
        for (String each:names) {

            if (each.contains(each2)){
                count++;
            }

        }

        if (count == 1){
            System.out.println(each2);
        }
    }
    }
}
