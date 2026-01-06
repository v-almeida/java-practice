/*5. Escreva um algoritmo que leia uma temperatura em graus Celsius e a apresente convertida em graus
Fahrenheit.*/ 

import java.util.Scanner;

public class Ex05 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura do local onde você está em Celsius: ");
        float celcius = scanner.nextFloat();

        float F = (celcius * 9) / 5;

        System.out.println("A temperatura " + celcius + "ºC em Fahrenheit é " + (F + 32) + "ºF");

        scanner.close();
    }
}
