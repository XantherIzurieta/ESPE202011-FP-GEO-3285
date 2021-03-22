/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

/**
 *
 * @author PC1
 */
public class LinearSearch {

    
    
    public static int search (int integers[], int x) {
        
        int n = integers.length;
        for (int i = 0; i < n; i++) {
            if (integers[i] == x) {
                return i;
            }
        }
        return -1;
        
        
        
    }
    
}
