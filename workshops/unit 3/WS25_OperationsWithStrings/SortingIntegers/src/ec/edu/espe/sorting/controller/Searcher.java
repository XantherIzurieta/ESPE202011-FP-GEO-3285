/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;

/**
 *
 * @author PC1
 */
public class Searcher {
    
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
