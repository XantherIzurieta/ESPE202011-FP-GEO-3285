/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11_recursion_example;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW11_Recursion_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number");
        int Number = input.nextInt();
        
        System.out.println("Enter the pontecial");
        int Potencial = input.nextInt() ; 
        
        int Result;
        
        Result= PrintSquare(Number,Potencial);
        System.out.println("factorial number of "+ Number +"is"+ Result);
             
    }
    
    private static int PrintSquare(int number, int Potencial) {                 
        
    if (Potencial == 0){
        return 1;
        
    }else {   
    return (number*PrintSquare(number,Potencial-1));   
        
      }
    
    }
}

