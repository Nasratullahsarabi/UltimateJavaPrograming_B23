package day25_ForEachLoop;

public class findAUniqeElement {
    public static void main(String[] args) {
        String []words = {"Java", "Python", "C#", "Java"};

        for (String each : words){

            int count = 0;

            for (String word : words){
                if (word.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
