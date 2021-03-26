/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.clothes.controller;

/**
 *
 * @author PC1
 */
public class Search {
    
    public static int findBrands(String[] Brands, String searchBrands) {
        
       for (int i = 0; i < 6; i++) {
            if (searchBrands.equals(Brands[i])) {
                return 1;
            }
        }
    return -1;
    }
}
    

