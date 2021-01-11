/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws04_logicaloperators;

/**
 *
 * @author PC1
 */
public class WS04_LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 20;
        if (x != 20) {
            System.out.println("x is equals to 10");
        } else {
            System.out.println("x is NOT equal to 10");
        }

        boolean y = x != 10;
        System.out.println("x != 20 --> " + (y));
        System.out.println("x == 20 --> " + (x == 20));
        System.out.println("x = 10 -->   " + (x = 10));
        System.out.println("x > 10 -->  " + (x > 10));
        System.out.println("x >= 10 --> " + (x >= 10));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 20;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 10;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

     
        boolean p;
        boolean q;

        p = true;
        q = true;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p && q));
        
        boolean p2;
        boolean q2;

        p2 = true;
        q2 = false;
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p2 && q2));
        
        boolean p3 ;
        boolean q3 ;
        
        p3 = false;
        q3 = true;
        
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p3 && q3));
        
        boolean p4 ;
        boolean q4 ;
        
        p4 = false;
        q4 = false;
        
        System.out.println(" ( " + p + " ^ " + q + " ) " + (p4 && q4));
        
    }
    
}
