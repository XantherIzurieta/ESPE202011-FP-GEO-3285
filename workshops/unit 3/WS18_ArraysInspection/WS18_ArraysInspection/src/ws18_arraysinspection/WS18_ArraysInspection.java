/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws18_arraysinspection;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS18_ArraysInspection {

    /**
     * @param args the command line arguments
     */
    
      
     public static void Inicializer(double Notes[], String Alumns[], Scanner num)
         
         
         
         {
             
                 
                 for (int j = 0; j < Notes.length; j++)
                 {
                   System.out.println("Name of alum");
           
             Alumns[j]= num.next();
             System.out.println("Enter the notes:");
             Notes[j] = num.nextDouble();   
                 }
             
                     
             }
       public static double average(double Notes[])   
       {
           double prom, suma = 0;
           for (int j = 0; j < Notes.length; j++)
           suma += Notes[j];  
           prom = suma/Notes.length;
           return prom;
           
       }
       
       public static void Print(double Notes[], String Alumns[], double average)
       {
           System.out.printf("%-15s %-15s", "Alumns", "Notes");  
           for(int j=0; j< Notes.length ;j++)
           {
               System.out.printf("%-15s %-15f", Alumns[j], Notes[j]);    
           }  
           System.out.println("The average is:" + average);
       }
              
                     
    public static void main(String[] args) {
        
        System.out.println("-------------Array of 5 integers------------------");
        
        
       System.out.println("Enter the number of sum: ");
        Scanner num = new Scanner(System.in);
        int Num = num.nextInt();
        int total = 0;
        
        
        
        int array[]= new int[Num];       
        for(int i=0; i< array.length ;i++)
        
        
        {
            
            array[i] = num.nextInt();
            total = total + array[i];
        }  
        System.out.println("DATES:");
        for(int i=5; i<array.length;i++)
        {
            System.out.println(array[i]);
            
        }
          System.out.println("The sum is:" +total); 
          
          
          
          
 
         System.out.println("-----------------Compute the average of three elements--------------------"); 
         double Notes[];
         String Alumns[];
         int n;
         double average;
         System.out.println("Enter the number of alumn: ");
         n = num.nextInt();
         
         Notes = new double[n];
         Alumns = new String[n];
         
         Inicializer(Notes, Alumns, num);
         
        average = average(Notes);
        Print(Notes, Alumns, average);
        }
        
        
      }
      
    