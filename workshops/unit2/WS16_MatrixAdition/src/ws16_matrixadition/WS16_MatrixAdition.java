/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws16_matrixadition;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS16_MatrixAdition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int a [][]={{5,7,9},{9,5,8},{3,2,4}};
    int b[][]={{8,3,5},{-5,4,-3},{9,10,24}};
    
    int c[][]=new int[3][3];
    for (int i=0;i<3;i++){
        for (int j=0 ; j <3 ; j++){
            
             c [i][j] = a[i][j] + b[i][j];
        }
    }
    System.out.println("and matrix A");
     for (int i=0;i<3;i++){
         System.out.println("");
        for (int j=0 ; j <3 ; j++){
            System.out.println("\t"+c [i][j] );
             
        }
    }

        System.out.println("and matrix B");
     for (int i=0;i<3;i++){
         System.out.println("");
        for (int j=0 ; j <3 ; j++){
            System.out.println("\t"+c [i][j] );
             
        }
    }
     System.out.println("nequals to");
     for (int i=0;i<3;i++){
         System.out.println("");
        for (int j=0 ; j <3 ; j++){
            System.out.println("\t"+c [i][j] );
             
        }
    }
    
    }
    
}
   
    

