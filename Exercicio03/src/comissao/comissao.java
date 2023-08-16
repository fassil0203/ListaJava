package comissao;

import java.util.Scanner;

public class comissao {
    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);

        int idvendedor,codpeca,qtdevendida;

        System.out.println("Programa para pagamento de comissao de Peças.\n\n");
        int idVendedor,idPeca;

        float PrecoPeca,ValorComissao,PorcentagemComissao=0.05f;


        System.out.println("Digite o Id do Vendedor");
        idvendedor = entrada.nextInt();
        System.out.println("Digite o Codigo da Peça :");
        idPeca = entrada.nextInt();
        System.out.println("Digite a Quantidade Vendida :");
        qtdevendida = entrada.nextInt();
        System.out.println("Digite o Valor da Peca :");
        PrecoPeca = entrada.nextInt();

        ValorComissao = (PrecoPeca * qtdevendida) * PorcentagemComissao ;


        System.out.printf("O valor da Comissao é de %.2f Reais.\n",ValorComissao);





    }
}
