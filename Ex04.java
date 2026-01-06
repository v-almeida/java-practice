/* 4. Escreva um algoritmo que leia a nota de três provas de um aluno, calcule e escreva a média final deste
aluno. Considere que a média é ponderada e que o peso das provas é 2 para a primeira prova, 3 para
a segunda prova e 5 para a terceira prova. */

import java.util.Scanner;

public class Ex04 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Digite nota 1: ");
        float nota1 = scanner.nextFloat();

        System.out.print("Digite nota 2: ");
        float nota2 = scanner.nextFloat();

        System.out.print("Digite nota 3: ");
        float nota3 = scanner.nextFloat();

        // Foi somado o peso que cada uma das notas possuem, assim chegando no número 10.

        float media_final = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.println("Sua média final é " + media_final + "!");

        scanner.close();

    }
}
