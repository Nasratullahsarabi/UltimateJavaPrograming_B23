package pr1;

public class falseTrue {
    public static void main(String[] args) {
        int sales = 500,
                capital=300,
                experience=5;
        String creditScore="great";
        boolean firstType = (creditScore=="fair"|| creditScore=="good"||creditScore=="great") && sales>=100 && (capital>= 100 || experience>=1);
        boolean secondType = (creditScore=="good"||creditScore=="great")&&sales>=200&&(capital>=200||experience>=2);
        boolean thirdType = creditScore=="great"&&sales>=300&&(capital>=300 || experience>=3);
        System.out.println(firstType);
        System.out.println(secondType);
        System.out.println(thirdType);
        if (thirdType){
            System.out.println("you are eligible for 1th, second and 3th type");
        }else if (secondType){
            System.out.println("you are eligible for 1th and 2th type");
        }else if (firstType){
            System.out.println("you are eligible for 1th type");
        }else{
            System.out.println("sorry you are not eligible for loan");
        }
    }

    }
