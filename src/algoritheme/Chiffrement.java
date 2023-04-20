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
public class Chiffrement {
     public static void main(String[] args) {
    Cipher cipher = new Cipher();
    int[] N = {0, 0, 0, 1, 0, 1, 1, 1};
    int[] C = cipher.encrypt(N);
    System.out.print("Bloc chiffré : ");
    for (int i = 0; i < C.length; i++) {
      System.out.print(C[i] + " ");
    }
  }
    
}
