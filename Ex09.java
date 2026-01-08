/*9. Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% de comissão para o
garçom. Escreva um algoritmo que leia o valor gasto pelo cliente em um restaurante e mostre o valor
da gorjeta e o valor total a ser pago. */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex09 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor gasto: ");
        double valor_gasto = scanner.nextDouble();

        double gorjeta = valor_gasto * 0.10;

        System.out.println("O valor da gorjeta é " + "Total: R$ " + df.format(gorjeta) + " R$." + "\nSendo assim, o valor total a ser pago é " + 
            "Total: R$ " + df.format(valor_gasto + gorjeta) + " R$." 
        );

        scanner.close();
    }
    
}
