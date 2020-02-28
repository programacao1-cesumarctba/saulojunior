/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioDois;


import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class exercicioDois {
     public static void main(String[] args) {
        long valor = 0;
        Scanner recebe = new Scanner(System.in);
        System.out.println("Insira um valor\n");
        
        valor = recebe.nextLong();
        
        if(valor % 2 == 0){
            if(valor < 10){
                System.out.println("Não é Estranho\n");
            }else if(valor < 20){
                System.out.println("Estranho\n");
            }else if(valor > 20){
                System.out.println("Não é Estanho\n");
            }
        }
        if (valor % 2 == 1){
                System.out.println("Estranho\n");
            }
            
    }
}

