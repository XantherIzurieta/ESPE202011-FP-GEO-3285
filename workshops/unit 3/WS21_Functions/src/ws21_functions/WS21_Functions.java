/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21_functions;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS21_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // XANTHER IZURIETA 10/ 03 / 2021
        //number 1
        //COMPUTERS
        
        Scanner input = new Scanner(System.in);

        float large;

        float hight;

        float total;

        float megabytes;

        float gigabyte;

        System.out.println("Enter the value of the large and the hight of "
                + "monitor");

        System.out.println("You can enter the measurement in centimeters or "
                + "inches, remember that the answer will be in the measurement"
                + "in which you have entered the data ");

        System.out.println("large: ");

        large = input.nextFloat();

        System.out.println("hight: ");

        hight = input.nextFloat();

        System.out.println("The measurement of your monitor is  " + printMesureMonitor(large, hight));

        System.out.println("--------------------------------------------------");

        System.out.println("Transformation from megabytes to gigabytes ");

        System.out.println("Enter the number of megabytes ");

        megabytes = input.nextFloat();

        System.out.println("the amount of " + megabytes + " equals " + printTransformation(megabytes));

    }

    private static float printMesureMonitor(float large, float hight) {

        float total;

        total = (float) Math.sqrt((large * large) + (hight * hight));

        return total;
    }

    private static float printTransformation(float megabytes) {

        float gigabyte;

        gigabyte = (megabytes / 1000);

        return gigabyte;

    }
}
