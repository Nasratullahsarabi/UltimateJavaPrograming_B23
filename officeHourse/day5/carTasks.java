package day5;

import java.util.Scanner;

public class carTasks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to start car? ");
        boolean isStart = scan.nextBoolean();
        int distance =0;

        if (isStart){
            scan.nextLine();
            System.out.println("Which city do you wanna go?\n\tList of Cities\n\t\tSan Antonio\n\t\tDollas");
            String destination = scan.nextLine();

        }else {
            System.out.println("Thank you see you later.");
        }

    }
}

/*
      - Assume that ;

                            - You live  Houston city in TX state.
                            - You will go to a trip and you have 3 choice

                                == Distance from Houston ==

                                    San Antonio   250 mil
                                    Dallas          300 mil
                                    Austin.       200 mil

                            - Unit Price Of Fuel is $ 3.06
                            - Average Fuel Consumption is 3.2 gal/100 mil
                            - Max speed is 80 mph
                            - Min speed is 40 mph

                        According to this information

                            Ask the user :

                        1. Do you want to start the car ? (as boolean)

                                 true : Continue trip
                                 false: Give a message " see you later "


                        2.if user continues to trip

                                     Which city do you want to go ?  (as String)
                                        List of cities
                                            San Antonio
                                            Dallas
                                            Austin

                                    According to user answer assign your distance related values.

                                    If user input is out of this cities assign as distance 0

                        3.if user choose one of these city assign your speed  60 mph as default

                                    Then Give this info message for user (as int)

                                        to increase the speed press 0
                                        to decrease the speed press 1

                            Option -1 ----- if user press 0

                                    Ask user "How much would you like to increase the speed?"

                                        If totalSpeed is bigger than maxspeed don't do any changes in speed
                                        otherwise you can change(increase) speed according to input

                                        Example :

                                            Default speed:60 mph
                                            User Input :30 mph

                                            output: "It is not allowed.Your speed is " + 60

                                            Default speed:60 mph
                                            User Input :15 mph

                                            output: "Your speed is increased!"+ 75

                            Option -2 -----if user press 1

                                    Ask user "How much would you like to decrease the speed?"

                                        If totalSpeed is smaller than minSpeed don't do any changes in speed
                                        otherwise you can change(decrease) speed according to input

                                        Example :

                                            Default speed:60 mph
                                            User Input :30 mph

                                            output: "It is not allowed.Your speed is " + 60

                                            Default speed:60 mph
                                            User Input :15 mph

                                            output: "Your speed is increased!"+ 45

                            Option -3 -----if user press any number other than 0 or 1

                                        Give an info message

                                             "Your speed is not changed!" + $speed

                                     Ex :     "Your speed is not changed!" + 60



                         3.According to all inputs print out this result

                             EstimatedTime           : distance/speed

                             TotalFuelConsumption : EstimatedTime*Average Fuel Consumption;
... (29 lines left)
 */