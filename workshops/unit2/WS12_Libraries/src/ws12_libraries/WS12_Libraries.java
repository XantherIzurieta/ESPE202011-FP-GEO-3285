/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12_libraries;

/**
 *
 * @author PC1
 */
public class WS12_Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //If we hace the math library
    //we import and use it
    
    float squareRoot =0.0F;
    float number = 0.0F ;
    float power =0.0F;
    float base = 0.0F;
    float exponent = 0.0F;
    float absoluteValue;
    
    
    
            
    number =9; //Squareroot = -->3
    squareRoot = (float)Math.sqrt(number);
    System.out.println(" the squareRoot of "+number+ "is "+squareRoot);
    
    
    number = 49; // 7
    squareRoot = (float)Math.sqrt(number);
    System.out.println(" the squareRoot of "+number+ "is "+squareRoot);
    
    number=5; //2...???
    squareRoot = (float)Math.sqrt(number);
    System.out.println(" the squareRoot of "+number+ "is "+squareRoot);
    
    base =3 ;
    exponent =2; // power = 9
    power = (float)Math.pow(base, exponent);
    System.out.println(" the power of "+base+ " raised to "+exponent+ " is "+ power);
    
    power= computePower(base,exponent);
        System.out.println(base+ "^" + exponent+ "=" +power);
        
    base= 2;
    exponent= 4; // power = 16
    power = (float)Math.pow(base, exponent);
    System.out.println(" the power of "+base+ " raised to "+exponent+ " is "+ power);
    
    base = 78;
    exponent = 5; //Calculator 78^5
    power = (float)Math.pow(base, exponent);
    System.out.println(" the power of "+base+ " raised to "+exponent+ " is "+ power);
    number=-5;
    absoluteValue = computeAbsoluteValor(number);
        System.out.println("absolute valor of "+number+ " is " +absoluteValue);
    
    //if we dont hvae the library, what would we do?
    // we should create the feature
            }   

    public static float computePower(float base, float exponent){
        float power;
        power = 0.0F;
        
        for (int i=1; i <= exponent ; i++){
            power= power * base;
        }
        return power ;
        }
    public static float computeAbsoluteValor(float number){
       
        
        
        if (number<0){
            number=number*-1;
        return number;
        }
        return number ;
        }
    }

    

