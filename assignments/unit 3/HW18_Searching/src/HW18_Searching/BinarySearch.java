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
public class BinarySearch {

    public static int search(int integers2[], int left, int right, int y) {

        if (right >= left) {
            int mid = left + (right - left) / 2;
            
            if (integers2[mid] == y) 
                return mid;
            
            if (integers2[mid] > y) 
                
                return search(integers2, left, mid - 1, y);
            
            return search(integers2, mid + 1, right, y);
        }
        return -1;
    }
}

    
    
    

