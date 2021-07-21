package pr1;

public class first {
    public static void main(String[] args) {
        int dayGreg = 10;
        int dayHij = 10;
        int diffGregToHijD = 10+dayHij;
        int diffHijToGregD = dayGreg-10;
        int monthGreg = 1;
        int monthHij = 2;
        int diffGregToHijM = 9+monthGreg;
        int  diffHijToGregM= monthHij-9;
        int yearGreg = 2021;
        int yearHij = 1400;
        int  diffGregToHijY= yearGreg-621;
        int  diffHijToGregY= yearHij+621;
        System.out.println("                 Month   Day  Year");
        System.out.print("Gregorian Date");
        System.out.println("    "+monthGreg+"     "+dayGreg+"   "+yearGreg);
        System.out.print("Hijri Date");
        System.out.println("       "+diffGregToHijM+"     "+diffGregToHijD+"   "+diffGregToHijY);





    }
}
