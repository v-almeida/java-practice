/*18. Escreva um algoritmo que mostre na tela uma contagem regressiva de 10 até 0 para o lançamento
de um foguete. Após o término da contagem regressiva, deve ser apresentada a palavra "Fogo!". */

public class Ex18 {
    
    public static void executar(){

        for (int i = 10; i >= 0; i--){
            System.out.println(" " + i);
        }

        System.out.println("Fogo!");
    }
}
