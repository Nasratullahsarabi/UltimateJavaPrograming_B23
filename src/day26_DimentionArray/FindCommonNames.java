package day26_DimentionArray;

public class FindCommonNames {
    public static void main(String[] args) {
        String[]name1 = {"Nasrat", "Ateeq", "Asad", "Wahid"};
        String[]name2 = {"Ateeq", "Jawad", "Nasrat", "Muzafar"};

        for (int i = 0; i < name1.length; i++) {

            for (int j = 0; j < name2.length; j++) {

                if (name1[i].equals(name2[j])){
                    System.out.println(name1[i]);
                }

            }

        }
    }
}
