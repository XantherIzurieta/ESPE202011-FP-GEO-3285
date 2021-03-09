/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10_functions;

/**
 *
 * @author PC1
 */
public class WS10_Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int divd = 5;
        int divr = 20;
        float quotient = 0;
        int x = 0;
        int y = 0;

        System.out.println("AUTOR ---> XANTHER IZURIETA");
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 5 and 20 is -> " + quotient); 

        y = f(5);
        System.out.println("5^2 -> " + y);

        y = f(-5);
        System.out.println("-5^2 -> " + y); 

        x = -2;
        y = f(x);
        System.out.println("the square of -> " + x + " is equal to -> " + y);

    }
    public static float divideTwoNumbers(int dividend, int divisor) {
        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}
