/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author PC1
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend;
        int difference;
        
        int factor1;
        int factor2;
       
        int divisor;
        int dividend;
        int quotient;
        
        int divisor2;
        int dividend2;
        
        
        
        //initilization
        addend1 = 5;
        addend2 = 18;
        //initilization
        minuend = -23;
        subtrahend = -6;
        //initilization
        factor1 = 3;
        factor2 = 11;
        //initilization
        divisor = 10;
        dividend = 2;
        //initilization
        divisor2 = 15;
        dividend2 = 2;
        
                
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The eaddition of" + addend1 + "+" + addend2 + 
                "is equal to -->"+sum);
        // operation
        ++sum;
        System.out.println("sum is equal to -->" + sum);
        
        sum++;
        System.out.println("sum is equal to -->" + sum);
        
        System.out.println("adding one to sum" + (sum++));
        
        System.out.println("adding one to sum" + ((++sum)));
        
        //operation rest
        System.out.println(" the subtraction of " + minuend + " + " + subtrahend + 
                "is equal to " + (minuend - subtrahend));
        //operation 
        
        System.out.println("The multiplication of " + factor1 + "*" + factor2 + 
                 "is equal to" + (factor1 * factor2));
        //operation
        
        System.out.println("The division of " + divisor + "/" + dividend + 
                "is equal to the quotient"  + (divisor/dividend));
        //operation
        System.out.println("The module of" + divisor2 + "%" + dividend2 + 
                "is equal to" + (divisor2 % dividend2));
    }
    
}
