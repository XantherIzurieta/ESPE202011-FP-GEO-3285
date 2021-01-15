/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
while(option > 2){
    System.out.println("");
}
        do {
            System.out.println("Calculator");
            System.out.println("1.- --> Addition");
            System.out.println("2.- --> Substraction");
            System.out.println("3.- -->Multiplication");
            System.out.println("4.- -->Division");
            System.out.println("5.- Exit");
            
            System.out.println("Enter your menu option-->");
            option = input.nextInt();
            
            switch(option){
                
                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend1");
                    addend1=input.nextInt();
                    System.out.println("enter addend2");
                    addend2=input.nextInt();
                    sum= addend1+addend2;
                    System.out.println("the sum is -->"+sum);
                    break;
                case 2 :
                    int addend3;
                    int addend4;
                    int rest;
                    System.out.println("enter addend1");
                    addend3=input.nextInt();
                    System.out.println("enter addend2");
                    addend4=input.nextInt();
                    rest= addend3-addend4;
                    System.out.println("the rest is -->"+rest);
                   
                    break;
                case 3 :
                    int value1;
                    int value2;
                    int multiplication;
                    System.out.println("enter Value1");
                    value1=input.nextInt();
                    System.out.println("enter Value2");
                    value2=input.nextInt();
                    multiplication= value1*value2;
                    System.out.println("the result is -->"+multiplication);
                    
                    break;
                case 4 :
                    int value3;
                    int value4;
                    int division;
                    System.out.println("enter Value1");
                    value3=input.nextInt();
                    System.out.println("enter Value2");
                    value4=input.nextInt();
                    division= value3/value4;
                    System.out.println("the result is -->"+division);
                    
                    
                    break;
                case 5 :
                    System.out.println("until next time");
                    System.exit(0);
                    break;
                default :
                    System.out.println("invalid option\n\n");
                    break;
                    
            }
        } while ( option !=5);
        
        
        
        

}

}
    

