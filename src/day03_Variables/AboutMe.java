package day03_Variables;

public class AboutMe {
    public static void main(String[] args) {

        System.out.println("\tHello everyone, May name is Matthew\nmy favorite music is \"Rock from 80,s\"\nMy favorite book is \"The wheel of time\"");
        System.out.println("-----------------------------------------");
        System.out.println("\tMy favorite program is \"Java\"\nMy favorite soft is \"facebook\"");
        System.out.println("------------------------------");

        String name = "John";
        String favoritMusice = "Rock Music";
        String favoriteBook = "How to win friends";
        String favoriteSeries = "Walking Dead";

        System.out.println("\tHello my name is "+name+"\n my favorite music is\""+favoritMusice
                +"\"\n my favorite book is "+favoriteBook+" and my\n favorite series is "+favoriteSeries);

        System.out.println("---------------");
        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Salenium";
        System.out.println("Today is "+today+", today we have "+todayClass);
        System.out.println("Tomorrow is "+tomorrow+", and we have "+tomorrowClass);
    }
}
