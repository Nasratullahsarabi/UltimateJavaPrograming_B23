package day6_ArraysPractice;

public class sameFirstAndLastChars {
    public static void main(String[] args) {
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        int count = 0; String allNames = "";
        for (int i = 0; i < names.length; i++) {

            String first = names[i].substring(0,1);
            String last = names[i].substring(names[i].length()-1);

            if (first.equalsIgnoreCase(last)){
                count++;
                allNames+=names[i]+" ";

            }
        }
        System.out.println(count);
        System.out.print(allNames);
    }
}
