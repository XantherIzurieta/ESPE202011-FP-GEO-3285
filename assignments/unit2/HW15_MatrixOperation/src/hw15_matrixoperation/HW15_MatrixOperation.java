/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15_matrixoperation;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class HW15_MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //XANTHER IZURIETA    
    Scanner scanner = new Scanner(System.in);
    
        int q, w, e, r, t, y, u, i, o;
        int p, s, d, f, g, h, j, k, l;
        
        //---------------------------------------------------------------------

        System.out.println("Please enter the dates of the firts matrix");
        System.out.println("be guided by this table to enter the data ");
        System.out.println("");
        System.out.println("q  w  e");
        System.out.println("r  t  y");
        System.out.println("u  i  o");
        System.out.println("");
        System.out.println("Enter  q  -->");
        q = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  w  -->");
        w = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  e  -->");
        e = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  r  -->");
        r = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  t  -->");
        t = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  y  -->");
        y = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  u  -->");
        u = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  i  -->");
        i = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  o  -->");
        o = scanner.nextInt();
        
        //---------------------------------------------------------------------
        
        System.out.println("Please enter the dates of the firts matrix");
        System.out.println("be guided by this table to enter the data ");
        System.out.println("");
        System.out.println("p  s  d");
        System.out.println("f  g  h");
        System.out.println("j  k  l");
        System.out.println("");
        System.out.println("Enter  p  -->");
        p = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  s  -->");
        s = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  d  -->");
        d = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  f  -->");
        f = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  g  -->");
        g = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  h  -->");
        h = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  j  -->");
        j = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  k  -->");
        k = scanner.nextInt();
        System.out.println("");
        System.out.println("Enter  l  -->");
        l = scanner.nextInt();
        
        //---------------------------------------------------------------------

        int a[][] = {{q, w, e}, {r, t, y}, {u, i, o}};
        int b[][] = {{p, s, d}, {f, g, h}, {j, k, l}};

        int c[][] = new int[3][3];
        for (int z = 0; z < 3; z++) {
            for (int x = 0; x < 3; x++) {

                c[z][x] = a[z][x] * b[z][x];
            }
        }
        System.out.println("");
        System.out.println("THE PRODUCT OF :");
        System.out.println("-------------------------------------------------");
        System.out.println("Matrix A :");

        for (int z = 0; z < 3; z++) {
            System.out.println("");
            for (int x = 0; x < 3; x++) {
                System.out.println("\t" + a[z][x]);

            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("And matrix B :");

        for (int z = 0; z < 3; z++) {
            System.out.println("");
            for (int x = 0; x < 3; x++) {
                System.out.println("\t" + b[z][x]);

            }
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Is equal to");

        for (int z = 0; z < 3; z++) {
            System.out.println("");
            for (int x = 0; x < 3; x++) {
                System.out.println("\t" + c[z][x]);

            }
        }
    }

}
