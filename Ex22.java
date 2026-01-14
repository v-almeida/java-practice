/*6. Escreva um algoritmo que some os números fornecidos pelo usuário até que o número lido seja
igual a zero. Ao final, mostre o resultado da soma. */

import java.util.Scanner;

public class Ex22 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int num;

        do {

        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        soma += num;

        }while (num != 0);

        System.out.println("Resultado: " + soma);

        scanner.close();

    }
}
