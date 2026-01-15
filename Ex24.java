/*8. Escreva um algoritmo que apresente na tela a tabuada de um número lido do teclado. Por exemplo,
considerando que o número lido é 2, o formato da apresentação deve ser o seguinte:

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20 */

import java.util.Scanner;

public class Ex24 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int contador = 1;
        int resultado = num * contador;

        do {

            System.out.printf("%d x %d = %d\n", num, contador, resultado);
            resultado += num;
            contador++;
            
            

        }while (contador <= 10);

        scanner.close();

    }
}
