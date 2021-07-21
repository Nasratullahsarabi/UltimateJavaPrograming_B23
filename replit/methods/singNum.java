package methods;

public class singNum {
    public static void sign (int n){
        System.out.println( (n>0)?"positive":(n<0)?"negative":"zero" );
    }

    public static void main(String[] args) {
        sign(5);
    }
}
