package day24_Arrays;

public class classmates {
    public static void main(String[] args) {

        String[] names = {"Gulistan", "Fruza", "Ahmet", "Memet", "Muhtar", "Tamara", "abbos", "Shirin"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].substring(0,3)+", ");

        }
    }
}
/*
create string array, and store the names of your  class mates (10)
            print the first three characters of each name
 */