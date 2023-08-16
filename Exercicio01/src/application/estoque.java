package application;

import java.util.Scanner;

public class estoque {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double quantidade_minima,quantidade_maxima,estoque_medio;

        System.out.print("Calculadora de Estoque Medio\n\n");
        System.out.println("Digite a Quantidade Minima :");
        quantidade_minima = entrada.nextDouble();

        System.out.println("Digite a Quantidade Maxima :");
        quantidade_maxima = entrada.nextDouble();

        estoque_medio = (quantidade_maxima + quantidade_minima)/2;

        System.out.println("A media de Estoque é : " + estoque_medio +" Peças ");



    }
}
