/*12. Escreva um algoritmo que leia dois números inteiros e faça a troca de valores entre eles, apresentando
as variáveis com seus valores trocados. */

import java.util.Scanner;

public class Ex12 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        int num3;

        num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.printf("Número 1: %d \nNúmero 2: %d ", num1, num2);

        scanner.close();
    }
    
}
