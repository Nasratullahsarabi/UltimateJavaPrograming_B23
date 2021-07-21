package statements;

public class vehicleYear {
    public static void main(String[] args) {
        int year = 2016; String message = "Your vehicle needs to be recalled";
        if(year>=1995 && year<=1998){
            message = "Your vehicle needs to be recalled!";
        }else if(year>=2001 && year <=2002){
            message = "Your vehicle needs to be recalled!";
        }else if(year>=2004 && year <=2006){
            message = "Your vehicle needs to be recalled!";
        }else if(year>=2015 && year <=2017){
            message = "Your vehicle needs to be recalled!";
        }else{
            message = "Your vehicle is fine, enjoy!";
        }

        System.out.println(message);
    }
}
