package day10_moreStatments;

public class fieldGroup {
    public static void main(String[] args) {
        int grade=4, group = 10;
        String location = ""; String teacherName = "";
        if (grade>=1 && grade <=6){
            if(grade==1){
                group=3; location="Apple Orchard"; teacherName="Ms Smith";
            }else if(grade==2){
                group=8; location="Zoo"; teacherName="Mr Lee";
            }else if(grade==3){
                group=2; location="Aquarium"; teacherName="Ms Wilson";
            }else if(grade==4){
                group=8; location="Movie Theater"; teacherName="Ms Reyes";
            }else if(grade==5){
                group=9; location="Musium"; teacherName="Ms Lela";
            }else{
                group=4; location="Six Flag"; teacherName="Mr Watt";
            }

        }else{
            group = 0; location="Unknown"; teacherName="Unknown";
        }
        System.out.println("grade = " + grade);
        System.out.println("group = " + group);
        System.out.println("location = " + location);
        System.out.println("teacherName = " + teacherName);
    }
}



