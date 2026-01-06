// 3. Escreva um algoritmo que leia um número inteiro e apresente o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Ex03 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int sucessor = num + 1;
        int antecessor = num - 1;

        System.out.println("O antecessor de " + num + " é " + antecessor + " e o sucessor é " + sucessor + "!");

        scanner.close();

    }

}
