/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10_functions;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW10_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//FIRST PART--------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------"
                + "--------------------------------------");
        System.out.println("HELLO! This is a program made by Xanther "
                + "Izurieta, hope you like it and it helps you ㋛  ");
        System.out.println("-------------------------------------------------"
                + "--------------------------------------");
        System.out.println("");
        System.out.println("● Please enter the data to perform a division ");
        System.out.println("Enter de dividend :");
        int divd = input.nextInt();

        System.out.println("Enter de divisor :");
        int divr = input.nextInt();

        float quotient = 0;

        quotient = divideTwoNumbers(divd, divr);

        System.out.println("The quotient of " + divd + "/" + divr
                + " is-->" + quotient);

//SECOND PART-------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("● Enter the variable of which you want "
                + "to know its square :");

        int parameter = input.nextInt();
        int resultreturn = 0;

        resultreturn = SquareNumber(parameter);
        System.out.println(+parameter + "^2 = " + resultreturn);

        resultreturn = SquareNumber(-parameter);
        System.out.println("-" + parameter + "^2 = " + resultreturn);

        resultreturn = SquareNumber(parameter);
        System.out.println("The square of  " + parameter
                + " is equal to -> " + resultreturn);
        System.out.println("And the square of  -" + parameter
                + " is equal to -> " + resultreturn);

//THIRD PART--------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("● Enter the variable with which you want to make the"
                + " following equation\n" + "(x ^ 2) + (2x) + 1 ---> (\"x\" is "
                + "the variable you are going to enter) ");
        System.out.println("");
        System.out.println(" Enter de variable :");

        int parameter2 = input.nextInt();
        int resultreturn1 = (parameter2 * parameter2) + (2 * parameter2) + 1;

        System.out.println("The result of : 2^" + parameter2
                + "(2*" + parameter2 + ")" + "+ 1 is : " + resultreturn1);

//FOURTH PART-------------------------------------------------------------------
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("● Enter the name of which you want to know "
                + "its multiplication table : ");

        int parameter3 = input.nextInt();

        System.out.println("The multiplication table of " + parameter3 + " is : "
                + "");
        System.out.println("");

        int resultreturn2 = 0;
        int factor;
        for (factor = 1; factor <= 12; factor++) {

            System.out.println(parameter3 + " x " + factor + " = "
                    + (resultreturn2));
        }

        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println(" ╔═════════════════════════╗ ");
        System.out.println("            -  G O O D   B Y E  -             ");
        System.out.println(" ╚═════════════════════════╝ ");
    }

//FIRST PROCESS-----------------------------------------------------------------
    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

//SECOND PROCESS----------------------------------------------------------------
    public static int SquareNumber(int parameter) {
        int resultreturn = 0;

        resultreturn = parameter * parameter;

        return resultreturn;
    }

//THIRD PROCESS-----------------------------------------------------------------    
    public static int SolveEquation(int parameter2) {
        int resultreturn1 = 0;

        resultreturn1 = (parameter2 * parameter2) + (2 * parameter2) + 1;

        return resultreturn1;
    }
//FOURTH PORCESS----------------------------------------------------------------

    public static int Multiply(int parameter3) {
        int resultreturn2 = 0;
        int factor = 1;

        return resultreturn2;
    }
}
