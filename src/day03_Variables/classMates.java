package day03_Variables;

public class classMates {
    public static void main(String[] args) {

        double kg = 1;
        kg = 5;
        double pound = kg*2.2;

        double gallon = 1;
        gallon = 5;
        double liter = gallon*3.79;

        double inch = 1;
        inch = 5;
        double cm = inch*2.54;

        System.out.println("There are "+pound+" pounds in "+kg+" kilograms");
        System.out.println("There are "+liter+" liters in "+gallon+" gallons");
        System.out.println("There are "+cm+" centimeters in "+inch+" inches");
    }
}
