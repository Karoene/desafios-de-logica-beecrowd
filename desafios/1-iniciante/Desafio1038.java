/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 A seguir, calcule e mostre o valor da conta a pagar.
Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
3 2                 Total: R$ 10.00
4 3                 Total: R$ 6.00
2 3                 Total: R$ 13.50
 */

import java.util.Locale;
import java.util.Scanner;

public class Desafio1038 {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);        
        int item = scanner.nextInt();
        int quantidade = scanner.nextInt();
        scanner.close();

        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};

        double total = (precos[item-1])*quantidade;
        //System.out.println("Total: R$ "+ total);
        System.out.printf(Locale.US,"Total: R$ %.2f%n", total);
    }
}
