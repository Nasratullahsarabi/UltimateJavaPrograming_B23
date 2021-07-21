package day11_switch;

public class statusCode {
    public static void main(String[] args) {
        int number = 410;
        switch (number){
            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;
            case 202:
                System.out.println("Accepted");
                break;
            case 301:
                System.out.println("Moved Permanantly");
                break;
            case 303:
                System.out.println("See other");
                break;
            case 304:
                System.out.println("Not Modified");
                break;
            case 307:
                System.out.println("Temporary Redirected");
                break;
            case 400:
                System.out.println("Bad Request");
                break;
            case 401:
                System.out.println("Unauthorized");
                break;
            case 403:
                System.out.println("forbidden");
                break;
            case 404:
                System.out.println("not found");
                break;
            case 410:
                System.out.println("gone");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            case 503:
                System.out.println("Server Unavailable");
                break;
            default:
                System.out.println("Not Known");
        }
    }
}
