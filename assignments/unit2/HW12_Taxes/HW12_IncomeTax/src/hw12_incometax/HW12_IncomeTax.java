/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12_incometax;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW12_IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // XANTHER IZURIETA
        //10/02/2021
        System.out.println("INCOME TAX TABLE FOR NATURAL PERSONS AND "
                + "INDIVIDUAL INQUIRIES. ");
        System.out.println("-------------------------------------------------"
                + "-------------");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Annual Profit $");
        float AnnualProfit = input.nextFloat();

        float BasicFraction;
        float ExcessUp;
        float BasicFractionTax;
        float ExcessFractionTax = PrintTaxPercentage(AnnualProfit);
        
        System.out.println("the %ExcessFractioTax is " + ExcessFractionTax  );

    }
    //--------------------------------------------------------------------------

    public static float PrintTaxPercentage(float AnnualProfit) {

        float ExcessFractionTax = 0.0F;
        float Value = 0.0000F;

        if (AnnualProfit < 11212) {
            ExcessFractionTax = 0;
            Value = AnnualProfit;
                
            
        } else if (AnnualProfit >= 11212) {
            if (AnnualProfit < 14285) {
                ExcessFractionTax = 5;
                Value = (float) (AnnualProfit * 0.05);
            
            } else if (AnnualProfit >= 14285) {
                if (AnnualProfit < 17854) {
                    ExcessFractionTax = 10;
                    Value = (float) (AnnualProfit * 0.1);

                } else if (AnnualProfit >= 17854) {
                    if (AnnualProfit < 21442) {
                        ExcessFractionTax = 12;
                        Value = (float) (AnnualProfit * 0.12);

                    } else if (AnnualProfit >= 21442) {
                        if (AnnualProfit < 42874) {
                            ExcessFractionTax = 15;
                            Value = (float) (AnnualProfit * 0.15);

                        } else if (AnnualProfit >= 42874) {
                            if (AnnualProfit < 64297) {
                                ExcessFractionTax = 20;
                                Value = (float) (AnnualProfit * 0.20);

                            } else if (AnnualProfit >= 64297) {
                                if (AnnualProfit < 85729) {
                                    ExcessFractionTax = 25;
                                    Value = (float) (AnnualProfit * 0.25);

                                } else if (AnnualProfit >= 85729) {
                                    if (AnnualProfit < 114288) {
                                        ExcessFractionTax = 30;
                                        Value = (float) (AnnualProfit * 0.30);

                                    } else if (AnnualProfit >= 114288) {
                                        ExcessFractionTax = 35;
                                        Value = (float) (AnnualProfit * 0.35);

                                    }

                                }

                            }
                        }

                    }
                }
            }
        }
        System.out.println("");
        System.out.println("The value is "+ Value + " since ");
        return ExcessFractionTax;
    }
}
