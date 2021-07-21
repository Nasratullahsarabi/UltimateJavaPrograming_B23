package day23_NestedLoops;

public class highestScore {
    public static void main(String[] args) {

        String []names = {"Nasrat", "Asad", "Ateeq", "Javad", "Hedayat", "Hashmat"};
        int []scors  = {220, 30, 190, 70, 80, 60};

        int maxScore = scors[0], minScore = scors[0];
        String maxName = names[0]; String minName = names[0];

        for (int i = 0; i < scors.length;i++){
            int each = scors[i];
            String each1 = names[i];

            if (each > maxScore){
                maxScore = each;
                maxName = each1;
            }
            if (each < minScore){
                minScore = each;
                minName = each1;
            }
        }

        System.out.println(maxName+": "+maxScore);
        System.out.println(minName+": "+minScore);

        System.out.println("maxName = " + maxName);
    }
}
