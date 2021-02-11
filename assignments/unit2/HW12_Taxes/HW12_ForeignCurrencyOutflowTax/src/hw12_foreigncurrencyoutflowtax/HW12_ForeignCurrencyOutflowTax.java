/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12_foreigncurrencyoutflowtax;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW12_ForeignCurrencyOutflowTax {

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
            System.out.println("[Choose a option]");
            System.out.println("Your currency outflow will be through");
            System.out.println("---------------------------------------------");
            System.out.println("1.----> Credit or debit cards in person ");
            System.out.println("2.----> Through Internet ");
            System.out.println("5.----> Exit");
            System.out.println("");
            System.out.println("Enter your menu option-->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Enter the Amount of money");

                    float AmountOfMoney = input.nextFloat();
                    float Tax = PrintTaxPercentage(AmountOfMoney);
                    ;

                    System.out.println("the tax is " + Tax + "%");
                    break;

                case 2:
                    System.out.println("Enter the Amount of money");

                    float AmountOfMoney2 = input.nextFloat();
                    float Tax2 = PrintTaxPercentage2(AmountOfMoney2);

                    System.out.println("the tax is " + Tax2 + "%");
                    break;

                case 5:
                    System.out.println("Until next time");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 5);

    }
//------------------------------------------------------------------------------

    public static float PrintTaxPercentage(float AmountOfMoney) {
        float Tax = 0.0F;
        float Value = 0.000F;
        
        if (AmountOfMoney > 5000.00) {
            Tax = 5;
            Value = (float) (AmountOfMoney*0.05);
        }else{
            Tax = 0;
            Value= (float)(AmountOfMoney);
        }
        System.out.println("");
        System.out.println("The value is "+ Value + " since ");
        return Tax;
        
    }

    public static float PrintTaxPercentage2(float AmountOfMoney2) {
        float Tax2 = 0.0F;
        float Value2 = 0.000F;
        
        if (AmountOfMoney2 > 100.00) {
            Tax2 = 5;
            Value2 = (float) (AmountOfMoney2*0.05);
        }else{
            Tax2 = 0;
            Value2 = (float)(AmountOfMoney2);
        }
        System.out.println("");
        System.out.println("The value is "+ Value2 + " since ");
        return Tax2;
    }
}
