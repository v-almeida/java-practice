/*2. Escreva um programa que alimente um vetor com 5 números inteiros. Apresente na tela apenas os
valores ímpares que aparecem no vetor */

public class Ex27 {
    
    public static void executar(){

        int[] v = {1,2,3,4,5};
        int i;

        for (i = 0; i <= 4; i++){
            if (v[i] % 2 != 0){
                System.out.println(" " + v[i]);
            }
        }

    }
}
