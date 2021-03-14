/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import ec.edu.espe.BasicOperation.BasicOperations;
import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float operand1;
    float operand2;
    float result = 0;
    Scanner input = new Scanner(System.in);
    //--------------------------------------------------------------------------
        System.out.println("---> ADITION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("+");
        operand2 = input.nextFloat();   
        
        System.out.println("The sum is --> "+BasicOperations.addTwoNumbers(operand1, operand2));
    //--------------------------------------------------------------------------    
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
        System.out.println("---> SUBTRACTION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("-");
        operand2 = input.nextFloat();       
        
        System.out.println("The subtraction is --> "+BasicOperations.subtractTwoNumbers(operand1, operand2));
        //----------------------------------------------------------------------       
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
         System.out.println("---> MULTIPLICATION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("*");
        operand2 = input.nextFloat();

        System.out.println("The multiplication is --> " +BasicOperations.multiplyTwoNumbers(operand1, operand2));
        //----------------------------------------------------------------------
        System.out.println("--------------------------------------------------");
        System.out.println("");

        System.out.println("---> DIVISION <---");
        System.out.println("Enter two numbers");

        operand1 = input.nextFloat();
        System.out.println("/");
        operand2 = input.nextFloat();

        System.out.println("The division is --> " +BasicOperations.divideTwoNumbers(operand1, operand2));
    }

}
    
    
  