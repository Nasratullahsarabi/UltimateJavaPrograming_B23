package lengthPractice;

public class howToFindLastWord {
    public static void main(String[] args) {
        String country = "Afghanistan";
       int lastLetter = country.length()-1;
       char lastLetter1 = country.charAt(lastLetter);
        System.out.println("lastLetter1 = " + lastLetter1);
        System.out.println("========================");
        String school = "Cheerooke Point";
        int schoolLastLetter = school.length()-1;

        char schoolLastLetterCh = school.charAt(schoolLastLetter);
        System.out.println("schoolLastLetterCh = " + schoolLastLetterCh);
        System.out.println("========================");
        String university = "Balkh University";
        int universityIndex = university.length()-1;
        char universityLastLetter = university.charAt(universityIndex);
        System.out.println("universityLastLetter = " + universityLastLetter);
        System.out.println("========================");
        String city = "San Diego";
        int cityIndex = city.length()-1;
        char cityLastL = city.charAt(cityIndex);
        System.out.println("cityLastL = " + cityLastL);
        System.out.println("========================");
        String name = "Nasratullah";
        char fName = name.charAt(0);
        int nameIndex = name.length()-1;
        char lName = name.charAt(nameIndex);
        System.out.println("fName = " + fName);
        System.out.println("lName = " + lName);

    }
}
