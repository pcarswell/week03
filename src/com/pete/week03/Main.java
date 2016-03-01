package com.pete.week03;

import java.util.Scanner;

public class Main {

    static double convertToCelcius(double degreeStuff) {
        double backAtcha = 0;

        return (degreeStuff - 32) * 5/9.0;
    }

    public static void main(String[] args) {
        String readStr = "";
        String readTemp = "";
        double returnTemp = 0;
        String celciusLabel = "C";
        String farenheitLabel = "F";

        Scanner scan = new Scanner(System.in);
        System.out.println("What farenheit temperature do you wish to convert to celcius -> ");
        readTemp = scan.nextLine();
        returnTemp = Double.parseDouble(readTemp);

        while (returnTemp > -460.0) {
            returnTemp = (returnTemp - 32.0) * 5.0/9.0;

            System.out.println("The temperature, " + readTemp + farenheitLabel
                    + "is " + returnTemp + celciusLabel);

            System.out.println("What farenheit temperature do you wish to convert to celcius -> ");
            readTemp = scan.nextLine();
            returnTemp = Double.parseDouble(readTemp);

        }
    }
}
