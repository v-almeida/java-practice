/*11. Escreva um algoritmo que leia o número de votos brancos, o número de votos nulos e o número de
votos válidos em um município. Em seguida, calcule e escreva o percentual de votos brancos, nulos e
válidos em relação ao total de eleitores do município. */

import java.util.Scanner;

public class Ex11 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de votos brancos: ");
        int votos_brancos = scanner.nextInt();

        System.out.print("Digite o númeto de votos nulos: ");
        int votos_nulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votos_validos = scanner.nextInt();

        int total_eleitores = votos_brancos + votos_nulos + votos_validos;
        double percentual_brancos = (votos_brancos / (double) total_eleitores) * 100;
        double percentual_nulos = (votos_nulos / (double) total_eleitores) * 100;
        double percentual_validos = (votos_validos / (double) total_eleitores) * 100;

        

        System.out.printf("Percentual Brancos: %.1f%% \nPercentual Nulos: %.1f%% \nPercentual Validos: %.1f%% \nTotal Eleitores: %d",
            percentual_brancos, percentual_nulos, percentual_validos, total_eleitores
        );

        scanner.close();
    }
}
