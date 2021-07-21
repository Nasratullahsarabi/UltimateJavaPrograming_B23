package day23_NestedLoops;

public class highestAndLowestScore {
    public static void main(String[] args) {
        String[]names = {"Ateeq", "Nasrat", "Wahid", "Asad", "Jawad", "Muzafar", "Hashmat", "Hedayat"};
        int[]scores = {90, 100, 70, 200, 60, 90, 90, 70};
        String maxName = names[0], minName = names[0]; int maxScore = scores[0], minScore = scores[0];

        for (int i = 0; i < names.length; i++) {
            String eachName = names[i];
            int eachScore = scores[i];

            if (eachScore > maxScore){
                maxScore = eachScore;
                maxName = eachName;
            }
            if (eachScore < minScore){
                minName = eachName;
                minScore = eachScore;
            }

        }
        System.out.println(maxName+": "+maxScore);
        System.out.println(minName+": "+minScore);

    }
}
