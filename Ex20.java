/*4. Escreva um algoritmo que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 +
3 + 4 + 5 + ... + 100). Resultado: 5050.*/ 

public class Ex20 {
    
    public static void executar(){

        int soma = 0;
        int i;

        for (i = 1; i <= 100; i++){
            soma = soma + i;
        }

        System.out.println("Resultado: " + soma);
    }
}
