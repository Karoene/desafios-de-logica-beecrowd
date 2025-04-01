import java.util.Scanner;

/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro.
Este valor é a soma dos valores ímpares que estão entre os valores fornecidos na entrada que deverá caber em um inteiro.
6                   5
-5

15                  13
12

12                  0
12
* */
public class Desafio1071 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();

        int menor = Math.min(x, y);
        int maior = Math.max(x, y);
        int soma = 0;
        for(int i = menor+1;i < maior;i++){
            if (i%2 != 0) soma+=i;

        }
        System.out.println(soma);


    }
}
