/*1. Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor em
ordem inversa. */

public class Ex26 {
    
    public static void executar(){

        int[] v = {1,2,3,4,5};
        int i;

        for (i = 4; i >= 0; i--){
            System.out.printf("%d\n", v[i]);
        }

    }
}
