/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izurietaxantherjoelq11;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class IzurietaXantherJoelQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 Scanner input = new Scanner (System.in);
        boolean mainLoop = true;
        int option = 0;
        
        do {
            System.out.println("Hello, with this program you will be able to "
                    + "improve your ability with the multiplication tables, "
                    + "so choose the option 1 so you can enter the number of "
                    + "which you want to know its multiplication table, and if "
                    + "you want to close the program enter 0 in the main menu");
            System.out.println("1.-Multiplication table of a number");
            System.out.println("0.- Exit");
            
            System.out.println("Enter your menu option-->");
            option = input.nextInt();
            
            switch(option){    
                case 1 :
                    System.out.println("Enter the number you want to know "
                            + "its multiplication table");
                 int top=12;
                 int product=0;
                 int table;
                 table = input.nextInt();
                 for(int j=1 ; j<=top ; j++){
                  product = table * j;
                 System.out.println(table + "*" + j + " = " + product);
            
                }
                 break;
           
                case 0 :
                    System.out.println("Keep practicing, see you later :D ");
                    System.exit(0);
                    break;
                default :
                    System.out.println("invalid option\n\n");
                    break;
                    
            }
        } while ( option !=0);
        
        // TODO code application logic here
    }
    
}

