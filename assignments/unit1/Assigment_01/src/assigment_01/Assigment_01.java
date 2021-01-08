/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment_01;

/**
 *
 * @author PC1
 */
public class Assigment_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //USE A RANGES OF NUMERIC PRIMITIVES "short","int","float"
        //volume of the orthohedron
        // For "short"
        short length;
        short height;
        short depth;
        
        length= 120;
        height= 60;
        depth= 30;
        
        System.out.println("The volume of orthohedron with length " + length + 
                " ,heigth "  + height + " , and depth  " + depth+ 
                "is equal to--->"+ (length*height*depth));
        
        //For "int"
        int length2;
        int height2;
        int depth2;
        
        length2= 925;
        height2= 760;
        depth2= 495;
        
        System.out.println("The volume of orthohedron with length " + length2 + 
                " ,heigth "  + height2 + " , and depth  " + depth2 + 
                "is equal to--->"+ (length2*height2*depth2));
        
        //For "float"
        float length3;
        float height3;
        float depth3;
        
        length3= (float) 20.4313;
        height3= (float)15.234;
        depth3= (float)3.423;
        
        System.out.println("The volume of orthohedron with length " + length3 + 
                " ,heigth "  + height3 + " , and depth  " + depth3 + 
                "is equal to--->"+ (length3*height3*depth3));
        
        
                
                
    }
    
}
