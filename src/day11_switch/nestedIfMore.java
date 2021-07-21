package day11_switch;

public class nestedIfMore {
    public static void main(String[] args) {
        String batchType = "EU";
        boolean batch = batchType =="US Morning" || batchType=="US Evening" || batchType == "EU";
        String result = "";
        if (batch){
            if (batchType=="US Morning"){
                result = "Morning Class";
            }else if (batchType=="US Evening"){
                result = "Evening Class";
            }else{
                result = "European Class";
            }
        }else{
            result = "Invalid";
        }
        System.out.println(result);


    }
}
