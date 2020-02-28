/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioTres;

import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class exercicioTres {
    public static void main(String[] args) {
        long valor = 0;
        long fatorial = 1;
        Scanner recebe = new Scanner(System.in);
        System.out.println("Insira um valor e darei seu fatorial");
        valor = recebe.nextLong();
        System.out.println("\n");
        
        for(long i=valor; valor>0; valor--){
            fatorial*=valor;
        }
        System.out.println(fatorial);
    }
}
