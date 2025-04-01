import java.util.Scanner;

/*Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
 e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*556    0:9:16

1       0:0:1

140153  38:55:53
 */
public class Desafio1019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos = teclado.nextInt();
        int att =0;

        int horas = segundos/3600;
        att = segundos-(horas*3600);
        int minutos = att/60;
        att = att- (minutos*60);
        int segundo = att;
        System.out.println(horas+":"+minutos+":"+segundo);
    }
}
