/*8. Escreva um algoritmo que pergunte ao usuário a quantidade de km percorridos por um carro alugado
e a quantidade de dias pelos quais ele foi alugado. Calcule e mostre o valor a pagar, sabendo que o
carro custa R$ 70,00 por dia e R$ 0,15 por km rodado. */

import java.util.Scanner;

public class Ex08 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de quilometros percorrido: ");
        float quilometro_percorrido = scanner.nextFloat();

        System.out.print("Digite o número de dias que o carro foi alugado: ");
        int dias_alugado = scanner.nextInt();

        double carro = 70.00;
        double consumo_medio = 0.15;

        double valor_dias = carro * dias_alugado;
        double valor_quilometros =  quilometro_percorrido * consumo_medio;
        double valor_final = valor_dias + valor_quilometros;

        System.out.println("O valor total a pagar é " + valor_final + " R$");

        scanner.close();
    }
}
