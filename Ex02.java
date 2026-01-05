// 2. Escreva um algoritmo que leia horas, minutos e segundos do teclado e apresente o tempo total em segundos. 

import java.util.Scanner;

public class Ex02 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = scanner.nextInt();

        int total_segundos;

        total_segundos = (hora * 3600) + (minutos * 60) + segundos;

        System.out.println("O tempo total em segundos é de " + total_segundos + " segundos!");

        scanner.close();
        
    }
}
