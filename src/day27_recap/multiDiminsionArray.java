package day27_recap;

import java.util.Arrays;

public class multiDiminsionArray {
    public static void main(String[] args) {

        String[] scrum1 = {"komijon", "yaliang", "nasrat", "ateeq"};
        String[] scrum2 = {"sabir", "Tamara"};
        String[] scrum3 = {"togba", "hilal", "Dilem"};

        String [][]scrumTeam = {scrum1, scrum2, scrum3};

        for (int i = 0; i < scrumTeam.length; i++) {

            for (int j = 0; j < scrumTeam[i].length; j++) {

                System.out.print(scrumTeam[i][j]+" ");

            }

        }
    }
}
