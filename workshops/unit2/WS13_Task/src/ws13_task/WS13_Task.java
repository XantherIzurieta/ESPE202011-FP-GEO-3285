/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13_task;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS13_Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //XANTHER IZURIETA
        //12/02/21
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
        while (option > 2) {
            System.out.println("");
        }
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("[Choose a option]");
            System.out.println("---------------------------------------------");
            System.out.println("1.----> Calculate the area of scalene triangle ");
            System.out.println("2.----> Calculate the area of ellipse ");
            System.out.println("3.----> Calculate the area of regular polygon "
                    + "with more than 5 sides ");
            System.out.println("4.----> Calculate acceleration");
            System.out.println("5.----> Calculate gravitational potential energy");
            System.out.println("6.----> Calculate Kinetic energy ");
            System.out.println("7.----> Exit");
            System.out.println("");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the base of triangle");
                    float Base = input.nextFloat();

                    System.out.println("Enter the hieght of triangle");
                    float Height = input.nextFloat();

                    float AreaTriangle = PrintAreaTriangle(Base, Height);

                    System.out.println("The area of trianlge is " + AreaTriangle);
                    break;

                case 2:
                    System.out.println("Enter the major radius");
                    float MajorRadius = input.nextFloat();

                    System.out.println("Enter the minor radius");
                    float MinorRadius = input.nextFloat();

                    float AreaEllipse = PrintTheAreaEllipse(MajorRadius, MinorRadius);

                    System.out.println("The area of ellipse is " + AreaEllipse);

                    break;

                case 3:
                    System.out.println("Enter the one side length  ");
                    float SideLength = input.nextFloat();

                    System.out.println("Enter the number of sides");
                    float Sides = input.nextFloat() * SideLength;

                    System.out.println("Enter the length from center of figure to one side ");
                    float Radius = input.nextFloat();

                    float AreaPolygon = PrintTheAreaPolygon(Sides, SideLength, Radius);

                    System.out.println("The area of regular polygon " + AreaPolygon);

                    break;

                case 4:
                    System.out.println("Enter the final velocity (m/seg) ");
                    float Velocity = input.nextFloat();

                    System.out.println("Enter the inical velocity (m/seg)");
                    float InicialVelocity = input.nextFloat();

                    System.out.println("Enter the time (seg)");
                    float Time = input.nextFloat();

                    float Acceleration = PrintAceleration(Time, Velocity, InicialVelocity);

                    System.out.println("The aceleration is " + Acceleration+"m/s^2");

                    break;

                case 5:
                    System.out.println("Enter the mass (kg) ");
                    float Mass = input.nextFloat();

                    System.out.println("Enter the height (m)");
                    float Height2 = input.nextFloat();

                    float Gravity = PrintGravity(Height2, Mass);

                    System.out.println("The gravitational potential energy is " + Gravity+"Joules");

                    break;

                case 6:
                    System.out.println("Enter the mass  (kg)");
                    float Mass2 = input.nextFloat();

                    System.out.println("Enter the velocity (m/s)");
                    float Velocity2 = input.nextFloat();

                    float kinetic = PrintKinetic(Mass2, Velocity2);

                    System.out.println("The gravitational potential energy is " + kinetic+"Joules");

                    break;

                case 7:
                    System.out.println("Until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 7);

    }
//------------------------------------------------------------------------------

    public static float PrintAreaTriangle(float Base, float Height) {
        float AreaTriangle = 0.0F;

        AreaTriangle = (Base * Height) / 2;

        return AreaTriangle;

    }

    public static float PrintTheAreaEllipse(float MajorRadius, float MinorRadius) {
        float AreaEllipse = 0.00F;

        AreaEllipse = (float) (3.1416 * MajorRadius * MinorRadius);

        return AreaEllipse;
    }

    public static float PrintTheAreaPolygon(float Sides, float SideLength, float Radius) {
        float AreaPolygon = 0.00F;

        AreaPolygon = (float) ((Sides * Radius) / 2);

        return AreaPolygon;
    }

    //--------------------------------------------------------------------------
    public static float PrintAceleration(float Time, float Velocity, float InicialVelocity) {
        float Acceleration = 0.00F;

        Acceleration = (float) (Velocity - InicialVelocity) / Time;

        return Acceleration;
    }

    public static float PrintGravity(float Height2, float Mass) {
        float Gravity = 0.00F;

        Gravity = (float) (Height2 * Mass * 9.8);

        return Gravity;
    }

    public static float PrintKinetic(float Mass2, float Velocity2) {
        float Kinetic = 0.00F;

        Kinetic = (float) (Mass2 * Velocity2 * Velocity2) / 2;

        return Kinetic;
    }
}
