/*6. Escreva um algoritmo que apresente a conversão de um valor em reais para dólar, de acordo com a
taxa de câmbio informada pelo usuário. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex06 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor em Reais R$: ");
        float reais = scanner.nextFloat();

        System.out.print("Digite a cotação do Dólar: ");
        float cotacao = scanner.nextFloat();

        float dolar = reais / cotacao;

        DecimalFormat df = new DecimalFormat("#.##");   
        System.out.println("A conversão do valor " + df.format(reais) + " BRL" + " para dólar é de " + df.format(dolar) + " USD!");

        scanner.close();
    }
}
