/*16. Escreva um algoritmo que solicite do usuário o valor de um saque em caixa eletrônico, sendo que
estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O algoritmo deve apresentar a menor quantidade de
cédulas possível de acordo com o saque. Exemplos:

400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
385,00: 3 cédulas de 100, 1 cédula de 50, 1 cédula de 20, 1 cédula de 10 e 1 cédula de 5. */

import java.util.Scanner;

public class Ex16 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite valor de saque: ");
        int saque = scanner.nextInt();

        int cedula_100 = saque / 100;
        int valor_restante100 = saque % 100;

        int cedula_50 = valor_restante100 / 50;
        int valor_restante50 = valor_restante100 % 50;

        int cedula_20 = valor_restante50 / 20;
        int valor_restante20 = valor_restante50 % 20;

        int cedula_10 = valor_restante20 / 10;
        int valor_restante10 = valor_restante20 % 10;

        int cedula_5 = valor_restante10 / 5;

        System.out.printf("\nSaque %d: %d cédulas de 100, %d cédulas de 50, %d cédulas de 20, %d cédulas de 10, %d cédulas de 5 ",
            saque, cedula_100, cedula_50, cedula_20, cedula_10, cedula_5
        );

    }
    
}
