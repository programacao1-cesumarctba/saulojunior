/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioQuatro;

import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class exercicioQuatro {
    public static void main(String[] args) {
        long valor = 0;
        Scanner recebe = new Scanner(System.in);
        System.out.println("Insira um valor e darei sua tabuada\n");
        valor = recebe.nextLong();
        System.out.println("\n");
        
        for(int i =10; i>0; i--){
            System.out.println( i + " x " + valor + " = " + valor*i);
        }
    }
}
