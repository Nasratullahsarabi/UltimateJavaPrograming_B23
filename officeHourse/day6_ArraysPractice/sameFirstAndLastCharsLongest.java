package day6_ArraysPractice;

public class sameFirstAndLastCharsLongest {
    public static void main(String[] args) {
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        int count = 0; String longestNames = "";
        for (int i = 0; i < names.length; i++) {

            String first = names[i].substring(0,1);
            String last = names[i].substring(names[i].length()-1);

            if (first.equalsIgnoreCase(last) && names[i].length() > longestNames.length()){
                count++;
                longestNames=names[i];

            }
        }
        System.out.println(count);
        System.out.print(longestNames);
    }
}
