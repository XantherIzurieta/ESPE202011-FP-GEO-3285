/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03_menus;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class Assignment03_Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
        
        do {
            System.out.println("Calculator");
            System.out.println("1.- --> Module");
            System.out.println("2.- --> Square root");
            System.out.println("3.- -->Square and cube of a number");
            System.out.println("4.- -->Multiplication table of a number");
            System.out.println("5.- Exit");
            
            System.out.println("Enter your menu option-->");
            option = input.nextInt();
            
            switch(option){
                
                case 1:
                    float value3;
                    float value4;
                    float module;
                    System.out.println("Enter Value 1");
                    value3=input.nextInt();
                    System.out.println("enter Value 2");
                    value4=input.nextInt();
                    module = value3%value4;
                    System.out.println("The module is -->"+module);
                    break ;
                    
                case 2 :
                    float number, Squareroot;
                    System.out.println("Enter the number-->");
                    
                 number=input.nextFloat();
                 Squareroot=(float) Math.sqrt(number);
                 
                    System.out.println("The square room of-->" + number + "is--->"+Squareroot);
                  
               break;
                   
                case 3 :
                    
                    float number1, Square,Cube;
                    System.out.println("Enter the number-->");
                                       
                 number1=input.nextFloat();
                 Square =(float) Math.pow(number1, 2);
                 Cube= (float) Math.pow(number1, 3);
                 
                 System.out.println("The square of-->"  +  number1 + "is-->" +Square);
                 System.out.println(" And he Cube of-->"  +  number1 + "is-->" +Cube);                                                 
                                        
                    break;
                    
                    
                case 4 :
                    System.out.println("Enter the number you want to know its multiplication table");
                 int top=12;
                 int product=0;
                 int table;
                 table = input.nextInt();
                 for(int j=1 ; j<=top ; j++){
                  product = table * j;
                 System.out.println(table + "*" + j + " = " + product);
            
                }
                 break;
           
                case 5 :
                    System.out.println("Until next time :D ");
                    System.exit(0);
                    break;
                default :
                    System.out.println("invalid option\n\n");
                    break;
                    
            }
        } while ( option !=5);
        
        // TODO code application logic here
    }
    
}
