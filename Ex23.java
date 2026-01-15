/*7. Escreva um algoritmo que some os números fornecidos pelo usuário até que o número lido seja um
número negativo. Ao final, mostre o resultado da soma. */

import java.util.Scanner;

public class Ex23 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;

        do {

            System.out.print("Digite um número: ");
            num = scanner.nextInt();

            soma += num;

        }while (num >= 0);

        System.out.println("resultado: " + soma);

        scanner.close();
    }
}
