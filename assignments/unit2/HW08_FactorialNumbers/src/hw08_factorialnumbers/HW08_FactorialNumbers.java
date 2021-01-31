/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08_factorialnumbers;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW08_FactorialNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean mainLoop = true;
        int option = 0;

        do {
            System.out.println("Calculator");
            System.out.println("1.- --> Factorial of a number");
            System.out.println("2.- --> Exit");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter a number from 0 to 15 to"
                            + " calculate its factorial-->");
                    int number;
                    number = 0;
                    int factorial;
                    factorial = 1;
                    number = input.nextInt();
                    while (number != 0) {
                        factorial = number * factorial;
                        number--;
                    }
                    System.out.println("The factorial of your number is-->"
                            + factorial);

                    break;
                case 2:
                    System.out.println("Good Bye :D ");
                    System.exit(0);
            }

        } while (option != 2);

    }

}
