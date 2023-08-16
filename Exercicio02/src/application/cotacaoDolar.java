package application;

import java.util.Scanner;

public class cotacaoDolar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double valordolar,valorreal,valorConvertido;

        System.out.println("Digite a Cotaçao do Dolar U$ :");
        valordolar = entrada.nextDouble();

        System.out.println("Digite o Valor em Dolares :");
        valorreal = entrada.nextDouble();

        valorConvertido = (valorreal/valordolar);

        System.out.printf("A quantidade em Reais sera de R$:"+ valorConvertido);







    }
}
