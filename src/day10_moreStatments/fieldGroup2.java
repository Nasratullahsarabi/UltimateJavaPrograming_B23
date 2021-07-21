package day10_moreStatments;

public class fieldGroup2 {
    public static void main(String[] args) {
        int group = 10;
        String location = ""; String teacherName = "";
        if (group>=1 && group <=6){
            if(group==1){
                group=1;
                location="Apple Orchard";
                teacherName="Ms Smith";
            }else if(group==2){
                group=2;
                location="Zoo";
                teacherName="Mr Lee";
            }else if(group==3){
                group=3;
                location="Aquarium";
                teacherName="Ms Wilson";
            }else if(group==4){
                group=4;
                location="Movie Theater";
                teacherName="Ms Reyes";
            }else if(group==5){
                group=5;
                location="Musium";
                teacherName="Ms Lela";
            }else{
                group=6;
                location="Six Flag";
                teacherName="Mr Watt";
            }

        }else{
            group = 0;
            location="Unknown";
            teacherName="Unknown";
        }
        System.out.println("group = " + group);
        System.out.println("location = " + location);
        System.out.println("teacherName = " + teacherName);
    }
}



