/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication72;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WS
        //XANTHER JOEL IZURIETA NOBOA
        //21-03-2021

        Scanner input = new Scanner(System.in);

        //LINEAR SEARCH
        System.out.println("LINEAR SEARCH");
        System.out.println("- SET OF NUMBERS -");
        int[] integersToSearch = {3, 9, 5, 12, -40, 2, 65, -13, 43, -9, 76, 43, 6, 7, 33, 50};
        printArray.print(integersToSearch);
        System.out.println("");
        System.out.println("Enter the number");
        int x = input.nextInt();
        LinearSearch.search(integersToSearch, x);
        System.out.println("");
        System.out.println("the position of that number is --> " + LinearSearch.search(integersToSearch, x));
        System.out.println("");
        System.out.println("");

        //BINARY SEARCH
        System.out.println("BINARY SEARCH");
        System.out.println("- SET OF NUMBERS 2 -");
        int[] integersToSearch2 = {4, -6, 2, 7, -87, 54, 65, 23, 65, -98, 800, 43, 40, 65, -7};
        printArray.print(integersToSearch2);
        System.out.println("");
        System.out.println("Enter the number");
        int y = input.nextInt();
        BinarySearch.search(integersToSearch2, y, y, y);
        System.out.println("");
        System.out.println("the position of that number is --> " + BinarySearch.search(integersToSearch2, y, y, y));

    }
}

    