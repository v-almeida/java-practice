/*14. Antes do racionamento de energia ser decretado, quase ninguém falava em quilowatts; mas, agora,
todos incorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de energia custa
um sétimo do salário mínimo, escreva um algoritmo que receba o valor do salário mínimo e a
quantidade de quilowatts gasta por uma residência e mostre na tela: a) o valor em reais de cada
quilowatt e b) o valor total a ser pago. */

import java.util.Scanner;

public class Ex14 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        float salario_minimo = scanner.nextFloat();

        System.out.print("Digite o gasto de quilowatts gasta: ");
        float quilowatts = scanner.nextFloat();

        float valor_reais = (salario_minimo / 7) / 100;

        float valor_total = quilowatts * valor_reais;

        System.out.printf("\nValor em reais: R$ %.2f \nValor total: R$ %.2f \n\n100 quilowatts equivale a %.2f", 
        valor_reais, valor_total, salario_minimo/7);

        scanner.close();


    }
}
