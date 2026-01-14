/*5. Escreva um algoritmo que mostre todos os números pares existentes entre 1 e um número lido do
teclado, bem como a quantidade de números apresentados. */

import java.util.Scanner;
public class Ex21 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int i;
        int quant = 0;

        for (i = 1; i <= num; i++){
            if (i % 2 == 0){
                System.out.println(i);
                 quant++;
            }

           
        }

        System.out.println("Quantidade de números pares apresentados: " + quant);

        scanner.close();
    }
}
