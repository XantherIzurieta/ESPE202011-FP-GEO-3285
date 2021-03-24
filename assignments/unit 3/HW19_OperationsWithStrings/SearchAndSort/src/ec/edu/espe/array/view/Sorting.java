/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array.view;

/**
 *
 * @author PC1
 */
public class Sorting {
   public static void sort(int[] Array) {
        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = Array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    //swap-------------------------
                    temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = temp;
                }
                
            }
            
        }
    }

    static void sort(int Array) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
