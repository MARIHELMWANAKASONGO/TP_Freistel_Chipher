/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritheme;

/**
 *
 * @author Saint Jean Pierre
 */
public class GenerationCle {
    public static int[] generateKeys(int K, int permutation, int shiftLeft, int shiftRight) {
        int k1_ = K & 240;
        int k2_ = K & 15;
        int k1 = (k1_ ^ k2_) << shiftLeft;
        int k2 = (k2_ & k1_) >> shiftRight;
        return new int[] {k1, k2};
        
    }
    public static void main(String[] args) {
        int K = 170;
        int permutation = 65274130;
        int shiftLeft = 2;
        int shiftRight = 1;
        int[] keys = generateKeys(K, permutation, shiftLeft, shiftRight);
        System.out.println("k1: " + Integer.toBinaryString(keys[0]));
        System.out.println("k2: " + Integer.toBinaryString(keys[1]));
    }
    
}
