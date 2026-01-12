/*15. Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de
cada um dos formatos disponíveis, escreva um algoritmo para calcular quantos litros de refrigerante
ele comprou. */

import java.util.Scanner;

public class Ex15 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nLata de 350 ml: ");
        int lata_350 = scanner.nextInt();

        System.out.print("Garrafa de 600 ml: ");
        int garrafa_600 = scanner.nextInt();

        System.out.print("Garrafa de 2 litros: ");
        int garrafa_2l = scanner.nextInt();

        // conversão para litros
        
        float lata_l = (float) 350 / 1000;
        float garrafa_600_l = (float) 600 / 1000;

        float valor_final = lata_350 * lata_l + garrafa_600 * garrafa_600_l + garrafa_2l * 2;

        System.out.printf("\nVocê comprou %.2fL de refrigerente!\n ", valor_final);

        scanner.close();

    }
    
}
