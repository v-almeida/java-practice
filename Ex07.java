/*7. Escreva um algoritmo que calcule e mostre o consumo médio e a autonomia que um veículo ainda
teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até
encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
abastecidos e a quilometragem percorrida desde o último abastecimento. */

import java.util.Scanner;

public class Ex07 {

    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque: ");
        int capacidade_tanque = scanner.nextInt();

        System.out.print("Digite a quantidade de litros abastecidos: ");
        int quantidade_litros = scanner.nextInt();

        System.out.print("Digite a quilometragem percorrida: ");
        float quilometragem_percorrida = scanner.nextFloat();

        float consumo_medio =  quilometragem_percorrida / quantidade_litros;
        System.out.println("\nO consumo médio do seu veículo é: " + consumo_medio + " Km/l");

        int litros_restantes = capacidade_tanque - quantidade_litros;
        System.out.println("Litros restantes: " + litros_restantes);

        float autonomia = litros_restantes * consumo_medio;
        System.out.println("A autonomia de seu veículo é: " + autonomia + " Km");

        scanner.close();


    }


    
}
