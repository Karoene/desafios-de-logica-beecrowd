/*
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 * A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
576.73
NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01

4.00

NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
2 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
0 moeda(s) de R$ 0.01

91.01

NOTAS:
0 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
2 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
0 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
0 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
1 moeda(s) de R$ 0.01
 */
public class Desafio1021{
    public static void main(String[] args) {
        double money, attmoney;
        money = 458.01;

        //MEUS DEUS FACA UM LOOP REPETICAO DE CODIGO
        int quant100 = (int) (money/100);
        attmoney = money - (quant100*100);

        int quant50 = (int) (attmoney /50);
        attmoney = attmoney - (quant50*50);

        int quant20 = (int)(attmoney /20);
        attmoney = attmoney - (quant20*20);

        int quant10 = (int)(attmoney /10);
        attmoney = attmoney - (quant10*10);

        int quant05 = (int)(attmoney /5);
        attmoney = attmoney - (quant05*5);

        int quant02 = (int)(attmoney /2);
        attmoney = attmoney - (quant02*2);
        //cents
        int quant01 = (int) (attmoney /1);
        attmoney = attmoney - (quant01*1);

        int quant005 = (int) (attmoney /0.5);
        attmoney = attmoney - (quant005*0.5);
        
        int quant025 = (int) (attmoney /0.25);
        attmoney = attmoney - (quant025*0.25);

        int quant001 = (int) (attmoney /0.1);
        attmoney = attmoney - (quant001*0.1);

        int quant0005 = (int) (attmoney /0.05);
        attmoney = attmoney - (quant0005*0.05);

        int quant0001 = (int) (attmoney /0.01);
        attmoney = attmoney - (quant0001*0.01);

        System.out.println("NOTAS:");
        System.out.println(quant100 + " nota(s) de R$ 100.00");
        System.out.println(quant50 + " nota(s) de R$ 50.00");
        System.out.println(quant20 + " nota(s) de R$ 20.00");
        System.out.println(quant10 + " nota(s) de R$ 10.00");
        System.out.println(quant05 + " nota(s) de R$ 5.00");
        System.out.println(quant02 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(quant01 + " moeda(s) de R$ 1.00");
        System.out.println(quant005 + " moeda(s) de R$ 0.50");
        System.out.println(quant025 + " moeda(s) de R$ 0.25");
        System.out.println(quant001 + " moeda(s) de R$ 0.10");
        System.out.println(quant0005 + " moeda(s) de R$ 0.05");
        System.out.println(quant0001 + " moeda(s) de R$ 0.01");


       

    }
}


/*
 * 
 * 
 * 
 * import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Garante que o Scanner use '.' como separador decimal

        if (scanner.hasNextDouble()) { // Evita erro se a entrada não for válida
            double money = scanner.nextDouble();
            scanner.close();

            // Multiplica por 100 para evitar problemas de precisão
            int valor = (int) Math.round(money * 100);

            // Notas
            int quant100 = valor / 10000;
            valor %= 10000;

            int quant50 = valor / 5000;
            valor %= 5000;

            int quant20 = valor / 2000;
            valor %= 2000;

            int quant10 = valor / 1000;
            valor %= 1000;

            int quant5 = valor / 500;
            valor %= 500;

            int quant2 = valor / 200;
            valor %= 200;

            // Moedas
            int quant1 = valor / 100;
            valor %= 100;

            int quant050 = valor / 50;
            valor %= 50;

            int quant025 = valor / 25;
            valor %= 25;

            int quant010 = valor / 10;
            valor %= 10;

            int quant005 = valor / 5;
            valor %= 5;

            int quant001 = valor; // O restante é a quantidade de moedas de 1 centavo

            // Exibição da saída formatada
            System.out.println("NOTAS:");
            System.out.println(quant100 + " nota(s) de R$ 100.00");
            System.out.println(quant50 + " nota(s) de R$ 50.00");
            System.out.println(quant20 + " nota(s) de R$ 20.00");
            System.out.println(quant10 + " nota(s) de R$ 10.00");
            System.out.println(quant5 + " nota(s) de R$ 5.00");
            System.out.println(quant2 + " nota(s) de R$ 2.00");

            System.out.println("MOEDAS:");
            System.out.println(quant1 + " moeda(s) de R$ 1.00");
            System.out.println(quant050 + " moeda(s) de R$ 0.50");
            System.out.println(quant025 + " moeda(s) de R$ 0.25");
            System.out.println(quant010 + " moeda(s) de R$ 0.10");
            System.out.println(quant005 + " moeda(s) de R$ 0.05");
            System.out.println(quant001 + " moeda(s) de R$ 0.01");
        } else {
            System.out.println("Erro: Entrada inválida!");
        }
    }
}


 */