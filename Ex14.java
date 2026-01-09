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
        double salario_minimo = scanner.nextDouble();

        System.out.print("Digite o gasto de quilowatts gasta: ");
        double quilowatts = scanner.nextDouble();


    }
}
