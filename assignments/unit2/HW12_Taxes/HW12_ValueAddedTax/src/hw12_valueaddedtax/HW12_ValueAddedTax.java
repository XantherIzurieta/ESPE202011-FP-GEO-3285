/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12_valueaddedtax;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW12_ValueAddedTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //XANTHER IZURIETA
        //10/02/21

        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;
        while (option > 2) {
            System.out.println("");
        }
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Hello, if you want to know the value added tax "
                    + "of a product or service, first check the SRI page, "
                    + "where you can review Goods and services taxed with a "
                    + "0% IVA rate.\n"
                    + "https://www.sri.gob.ec/web/guest/impuesto-al-valor-agregado-iva"
                    + "\n"
                    + "If your good or service is not in this list mentioned "
                    + "above, please choose option 1.\n"
                    + "\n"
                    + "Otherwise choose option 2 to exit. ");
            System.out.println("---------------------------------------------");
            System.out.println("1.----> Know the IVA value to pay of a "
                    + "good or service ");
            System.out.println("2.----> Exit ");
            
            System.out.println("");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the Value of product");

                    float ValueProdcut = input.nextFloat();
                    float ValueIVA = PrintValueTax(ValueProdcut);
                    ;

                    System.out.println("The IVA is " + ValueIVA );
                    break;

                case 2:
                    System.out.println("Until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 2);

    }
//------------------------------------------------------------------------------

    public static float PrintValueTax(float ValueProdcut) {
        float ValueIVA ;
        
        ValueIVA = (float) (ValueProdcut*0.12);

        
        
        return (float) ValueIVA;

    }
}
