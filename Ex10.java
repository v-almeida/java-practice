/*10. Um vendedor de uma loja de sapatos recebe como pagamento 20% de comissão sobre as vendas do
mês e R$ 5,00 por cada par de sapatos vendido. Escreva um algoritmo que, dado o valor total das
vendas do mês e o número de sapatos vendidos, mostre qual será o salário do vendedor naquele mês. */

import java.util.Scanner;
public class Ex10 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total de sapatos vendido durante o mês: ");
        double total_vendidos = scanner.nextDouble();

        System.out.print("Digite o número de pares vendidos durante o mês: ");
        int numero_sapatos = scanner.nextInt();

        double comissao = total_vendidos * 0.20;
        double total_sapatos = numero_sapatos * 5.00;
        double salario_total = comissao + total_sapatos;

        System.out.printf("comissão mensal: R$ %.2f \nSalário mensal: R$ %.2f \nTotal Mês: R$ %.2f ", comissao, 
            total_sapatos, salario_total
        );
        
        scanner.close();
    }
}
