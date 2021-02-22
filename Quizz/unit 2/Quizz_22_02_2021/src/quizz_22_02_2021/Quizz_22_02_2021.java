/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizz_22_02_2021;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class Quizz_22_02_2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Xanther Izurieta
        //22/02/2021
        Scanner input = new Scanner(System.in);

        String[] userNames;
        int[] ages;
        int n;
        int m ;
        

        System.out.println("Enter the number of the person");
        n = input.nextInt();
        m= n;
        userNames = new String[n];
        ages = new int[m];
        
        for (int i = 0; i < m; i++) {
            
                System.out.println("Age of person " + (i + 1) + " -> ");
                ages[i] = input.nextInt();
            }
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Name of person " + (i+1) + " -> ");
            userNames [i] = input.nextLine();           

        }
        
        for (int i = 0; i < userNames.length; i++) {
            System.out.println("The name of the person " + (i + 1) + " -> " + userNames[i]);
        }
        for (int i = 0; i < ages.length; i++) {
            System.out.println("The age of the person " + (i + 1) + " -> " + ages[i]);
        }
        
    }

}
//.-----------------------------------------------------------------------------
//Correction
//Scanner input = new Scanner(System.in);
//
//        String[] userNames;
//        int[] ages;
//        int n;
//        int m ;
//        
//
//        System.out.println("Enter the number of the person");
//        n = input.nextInt();
//      m= n;
//      userNames = new String[n];
//      ages = new int[m];
//      
//      for (int i = 0; i < m; i++) {
//              System.out.println("Age of person " + (i + 1) + " -> ");
//              ages[i] = input.nextInt();
//          }
//      for (int i = 0; i < n; i++) {
//          input.nextLine();
//          System.out.println("Name of person " + (i+1) + " -> ");
//          userNames [i] = input.nextLine();           
//
//      }
//      
//      for (int i = 0; i < userNames.length; i++) {
//          System.out.println("The name of the person " + (i + 1) + " -> " + userNames[i]);
//      }
//    for (int i = 0; i < ages.length; i++) {
//        System.out.println("The age of the person " + (i + 1) + " -> " + ages[i]);
//    }
// }

//}
