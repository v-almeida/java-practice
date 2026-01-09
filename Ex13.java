/*13. Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente longa.
Assumindo que seja possível medir sua sombra e a sombra do prédio no chão, e que você lembre de
sua altura, escreva um algoritmo para ler os dados necessários e calcular a altura do prédio. */

import java.util.Scanner;

public class Ex13 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua Altura: ");
        float altura = scanner.nextFloat();

        System.out.print("Digite altura da sua sombra: ");
        float sombra_pessoa = scanner.nextFloat();

        System.out.print("Digite altura da sombra do prédio: ");
        float sombra_predio = scanner.nextFloat();

        float altura_predio = (altura / sombra_pessoa) * sombra_predio;

        System.out.printf("Sua altura: %.2f \nSombra pessoa: %.2f \nSombra Prédio: %.2f \nAltura prédio: %.2f Metros de altura", 
            altura, sombra_pessoa, sombra_predio, altura_predio
        );
        
        scanner.close();

    }
}
