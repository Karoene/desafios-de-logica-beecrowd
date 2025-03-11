/*
DESAFIO 1037 - INTERVALO
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
deverá ser impressa a mensagem “Fora de intervalo".

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

Entrada
O arquivo de entrada contém um número com ponto flutuante qualquer.

Saída
A saída deve ser uma mensagem conforme exemplo abaixo.
25.01  Intervalo (25,50]
25.00  Intervalo [0,25]
100.00 Intervalo (75,100]
-25.02 Fora de intervalo 
 **/

import java.util.Locale;
import java.util.Scanner;

public class Desafio1037{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante leitura com ponto decimal ([0,25], (25,50], (50,75], (75,100])
        double num = scanner.nextDouble();
        scanner.close();

        if ((0 <= num) && (num <= 25)) {
            System.out.println("Intervalo [0,25]");
        } else if ((25 < num) && (num <= 50)) {
            System.out.println("Intervalo (25,50]");
        } else if ((50 < num) && (num <= 75)) {
            System.out.println("Intervalo (50,75]");
        }else if ((75 < num) && (num <= 100)) {
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora do intervalo");
        }
        
    }

}