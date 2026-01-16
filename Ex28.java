/*3. Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na
sequência, apresente na tela os valores que são iguais ou superiores à média. */

public class Ex28 {
    
    public static void executar(){

        float v[] = {1,2,3,4,5}, media;
        int soma = 0;

        for (int i = 0; i <= 4; i++){
            soma += v[i];
            
        }
        
        media = soma / 5;
        System.out.println("Média: " + media);

        
    }
}
