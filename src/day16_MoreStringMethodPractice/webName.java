package day16_MoreStringMethodPractice;

public class webName {
    public static void main(String[] args) {
        String url = "www.amazon.com";

        String name = url.substring(url.indexOf(".")+1,url.lastIndexOf("."));

        System.out.println(name);
    }
}
