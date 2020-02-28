package exercicioum;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        int valor = 0;
        Scanner recebe = new Scanner(System.in);
        System.out.println("Insira um número e direi se é par ou impar");
        valor = recebe.nextInt();
        
        if(valor%2 == 1){
            System.out.println("O Valor " + valor + " é impar!");
        }else{
            System.out.println("O Valor " + valor + " é par!");
        }
    }
    
}
