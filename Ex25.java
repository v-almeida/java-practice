/*9. Escreva um algoritmo que mostre a tabuada de um número inteiro qualquer que será digitado pelo
usuário, mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, ou seja, o valor
inicial e final devem ser informados também pelo usuário, conforme mostrado no exemplo a seguir:

Mostrar a tabuada de: 5
Começar por: 4
Terminar em: 7

5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35

*/

import java.util.Scanner;

public class Ex25 {
    
    public static void executar(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual tabuaba você precisa: ");
        int num_tabuada = scanner.nextInt();

        System.out.print("Começa por qual número: ");
        int numero_comeco = scanner.nextInt();

        System.out.print("Termina em qual número: ");
        int numero_final = scanner.nextInt();

        int resultado = num_tabuada * numero_comeco;

        do {

            System.out.printf("%d x %d = %d\n", num_tabuada, numero_comeco, resultado);
            resultado += num_tabuada;
            numero_comeco++;


        }while (numero_comeco <= numero_final);

        scanner.close();
    }
}
