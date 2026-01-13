// 19. Escreva um algoritmo que mostre os números múltiplos de 5, no intervalo de 1 até 100

public class Ex19 {
    
    public static void executar(){

        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
