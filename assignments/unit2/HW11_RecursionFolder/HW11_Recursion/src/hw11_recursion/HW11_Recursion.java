/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11_recursion;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW11_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;

        do {
            System.out.println("Hello, choose an option");
            System.out.println("1.-Calculate the flow rate by speed and time");
            System.out.println("2.-Calculate the rotational displacement of a "
                    + "landslide using : Width of the break surface, length of"
                    + " the break surface and depth of the break surface by "
                    + "perpendicularity to the original topography "
                    + "of the terrain.");
            System.out.println("0.- Exit");

            System.out.println("Enter your menu option-->");
            option = (int) input.nextFloat();

            switch (option) {

                case 1:
                    System.out.println("Enter the calculated velocity (m^3/hr)-->");

                    float Flow = 0;
                    float Velocity = input.nextFloat();

                    System.out.println("Enter the calculated time (min)--> ");

                    float Time = input.nextFloat();
                    PrintFlow(Flow, Velocity, Time);

                    break;

                case 2:

                    System.out.println("Enter the width of the break surface -->");

                    float Width = input.nextFloat();

                    System.out.println("Enter the length of the break surface --> ");
                    float Length = input.nextFloat();

                    System.out.println("Enter the depth of the break surface by "
                            + "perpendicularity to the original topography "
                            + "of the terrain--> ");

                    float Depth = input.nextFloat();

                    float pi;

                    pi = (float) 3.1415926535897932;

                    PrintRotational(Width, Length, Depth, pi);
                    break;

                case 0:
                    System.out.println(" See you later ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;
                    

            }
        } while (option != 0);
              
    }
    //-------------------------------------------------------------------------

    private static void PrintFlow(float Flow, float Velocity, float Time) {

        Flow = Velocity / Time;

        System.out.println(" The Flow is whit speed -> " + Velocity + " and "
                + " time -> " + Time + " is ->" + Flow);
    }

    //-------------------------------------------------------------------------
    private static void PrintRotational(float Width, float Length, float Depth, float pi) {

        float Displacement = (((pi) * (Width * Depth * Length)) / (6));

        System.out.println("The rotational displacement is --> " + Displacement);

    }

    //-------------------------------------------------------------------------
    
    
  }
    


