/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02iterations;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author PC1
 */
public class Assignment02Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ASSIGNMENT02ITERATIONS
        //1)USE "WHILE" WITH A NUMBER LIST
        //2) USE "FOR" IN MULTIPLICATION TABLE WITH A NUMBER LIST
        //3) IDEA WHIT A LOOP
        
        System.out.println("1.-USE \"WHILE\" WITH A NUMBER LIST");
        int i ;
        i= 0;
        System.out.println("This is a while loop from 1 to 21");
        
        while  (i <21) {
            System.out.println("i-->" +(i+1));
            i+=1;
        }
        
        System.out.println("2.-USE \"FOR\" IN MULTIPLICATION "
                + "TABLE WITH A NUMBER LIST");
        System.out.println("Multiplication tables :21 ");
        
        int stop=12;
        int product=0;
        int table = 21;
        for(int k=1 ; k<=stop ; k++){
            product = table * k;
            System.out.println("21 * " + k + " = " + product);
        }
        
        System.out.println("3.-IDEA WHIT A LOOP");
        System.out.println("USE \"FOR\" IN ");
        int Value1;
        int Value2;
        int z;
        Scanner n=new Scanner (System.in);
        
        
        System.out.println("ENTER A NUMBER TO START THE SEQUENCE");
        Value1 = n.nextInt();
        
        System.out.println("ENTER A NUMBER TO FINISH THE SEQUENCE");
        Value2 = n.nextInt();
        
      
        z = Value1;
        
        System.out.println("NUMBERS WITHIN THE RANGE " + Value1 + " & " + Value2 );
        
        while(z < Value2){
            System.out.println(z+ " ");
            z++;
        }
        }
}
    
    

