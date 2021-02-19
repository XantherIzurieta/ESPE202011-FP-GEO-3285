/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14_arrays;

/**
 *
 * @author PC1
 */
public class HW14_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //XANTHER IZURIETA
        //19/02/2021
        //MAIN COLORS

        String[] mainColors = {"Red", "Blue", "Magenta"};

        String[] secondColors = {"Violet", "Green", "Orange"};

        System.out.println("Main Colors");
        for (String Color : mainColors) {
            System.out.println("Main color names -->  " + Color);
        }

        System.out.println("");
        System.out.println("Second Colors");
        for (String Color : secondColors) {
            System.out.println("Second color names -->  " + Color);
        }
    }

}
