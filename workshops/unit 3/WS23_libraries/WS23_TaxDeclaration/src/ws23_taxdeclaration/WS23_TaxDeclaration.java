/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws23_taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS23_TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPercentage = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("Xanther Izurieta Taxes");
        System.out.println("");
        System.out.println("  IVA---->");
        System.out.println("Enter the price of your product");
        price = input.nextFloat();
        
        ivaValue=BasicTax.computeIva(price, ivaPercentage);
        totalPrice = price +ivaValue;
        
        System.out.println("total price --->" +totalPrice); 
    }

}
