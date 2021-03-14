/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author PC1
 */
public class BasicOperation {
//addition, subtraction, division, multiplication   
    
    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float addend1, float addend2) {
        float subtraction = 0;
        subtraction = addend1 - addend2;
        return subtraction;
    }

    public static float multiplyTwoNumbers(float addend1, float addend2) {
        float multiplication = 0;
        multiplication = addend1 * addend2;
        return multiplication;
    }

    public static float divideTwoNumbers(float addend1, float addend2) {
        float divide = 0;
        divide = addend1 / addend2;
        return divide;
    }
}
