package quize;

public class quize2 {
    public static void main(String[] args) {

        int wd = 0;

        String []days = {"sun","mon","wed","sat"};

        for (int i = 0; i < days.length; i++) {

            if (days[i].equals("sun")  && days[i].equals("sat")){
                wd-=1;
            }else if (days[i].equals("mon")){
                wd++;
            }else if (days[i].equals("wed")){
                wd+=2;
            }

        }
        System.out.println(wd);

    }
}
