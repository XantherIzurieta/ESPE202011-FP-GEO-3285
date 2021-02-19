/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws14_farmsimulator;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class WS14_FarmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] eggsByCoop;
        String[] chickens = {"Lucy ", "Maruja", "Pepita"};
        float[] weightsByCoop = {1.2f, 2.4f, 65.2f, 80.1f, 4.3f, 4.5f};
        int n;
        System.out.println("enter the name of coops --> ");
        n = input.nextInt();

        eggsByCoop = new int[n];
        //chickens = new String[3];
        weightsByCoop = new float[n];

        // eggsByCoop[0] = 7;
        // eggsByCoop[1] = 9;
        // eggsByCoop[2] = 3;
        // eggsByCoop[3] = 9;
        //eggsByCoop[4] = 8;
        for (int i = 0; i < n; i++) {
            System.out.println("the number off eggs of the coop " + (i + 1) + " -> ");
            eggsByCoop[i] = input.nextInt();
        }

        for (int eggs : eggsByCoop) {
            System.out.println(" eggs of coop are " + eggs);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("the number off eggs of the coop " + (i + 1) + " -> " + eggsByCoop[i]);
        }
        for (String chicken : chickens) {
            System.out.println("chicken name -->  " + chicken);
        }
        for (int i = 0; i < weightsByCoop.length; i++) {
            System.out.println("weight of of the coop " + (i + 1) + " -> " + weightsByCoop[i]);
        }

    }
}
