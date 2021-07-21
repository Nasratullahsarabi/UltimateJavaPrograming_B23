package day4_Practice;

public class catagoryName {
    public static void main(String[] args) {

        String word = "https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        int indexOfStart = word.indexOf("/t");
        int indextOfEnd = word.indexOf("?");

        String url = word.substring(indexOfStart+1,indextOfEnd);
        url = url.replace("-"," ");

        System.out.println("Catagory name: "+url);


    }
}
