

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs: apenas para facilitar o cálculo, considere
todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12
meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
400             1 ano(s)
                1 mes(es)
                5 dia(s)
800             2 ano(s)
                2 mes(es)
                10 dia(s)
30              0 ano(s)
                1 mes(es)
                0 dia(s)
*
* */
import java.util.Scanner;
public class Desafio1020 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int idadeEmDias = teclado.nextInt();

        int ano = 365;
        int mes = 30;

        int anos = idadeEmDias/ano;
        System.out.println(anos+" ano(s)");
        int meses = (idadeEmDias%ano)/mes;
        System.out.println(meses+" mes(es)");
        int dias = (idadeEmDias-(anos*ano))-(meses*mes);
        System.out.println(dias+" dia(s)");

    }
}

