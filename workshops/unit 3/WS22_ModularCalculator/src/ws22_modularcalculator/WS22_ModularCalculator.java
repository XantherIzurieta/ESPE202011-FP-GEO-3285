/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22_modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;

/**
 *
 * @author PC1
 */
public class WS22_ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    float operand1;
        float operand2;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.println("---> ADITION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("+");
        operand2 = input.nextFloat();

        result = BasicOperation.addTwoNumbers(operand1, operand2);
        
        System.out.println("The sum is --> "+BasicOperation.addTwoNumbers(operand1, operand2));
        
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
         System.out.println("---> SUBTRACTION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("-");
        operand2 = input.nextFloat();

        result = BasicOperation.subtractTwoNumbers(operand1, operand2);
        
        System.out.println("The subtraction is --> "+BasicOperation.subtractTwoNumbers(operand1, operand2));
        
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
         System.out.println("---> MULTIPLICATION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("*");
        operand2 = input.nextFloat();

        result = BasicOperation.multiplyTwoNumbers(operand1, operand2);

        System.out.println("The multiplication is --> " + BasicOperation.multiplyTwoNumbers(operand1, operand2));

        System.out.println("--------------------------------------------------");
        System.out.println("");

        System.out.println("---> DIVISION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("/");
        operand2 = input.nextFloat();

        result = BasicOperation.divideTwoNumbers(operand1, operand2);

        System.out.println("The division is --> " + BasicOperation.divideTwoNumbers(operand1, operand2));
    }

}
