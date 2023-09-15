//3ª ATIVIDADE
//Desenvolver um programa para uma Empresa.
//O programa solicita:
//O número da mesa do bar;
//Em seguida o(a) funcionário(a) inclui:
//Nome da bebida ou refeição solicitada;
//Valor da bebida ou refeição solicitada;
//Quantidade de bebidas ou refeições;
//(Ex.: produto: refrigerante/ valor 7,00 / quantidade 4)
//Serão feitas 3 solicitações para o(a) funcionário(a) do bar
//Ao final, o sistema mostra tudo que foi pedido e o valor total.

package lista1;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroMesa;
        double valorTotal = 0.0;
        
        System.out.print("Digite o numero da mesa do bar: ");
        numeroMesa = sc.nextInt();
        sc.nextLine();
        
        //1º solicitação 
        System.out.print("Digite o nome da primeira bebida ou refeicao solicitada: ");
        String nomeProduto1 = sc.nextLine();
        System.out.print("Digite o valor: ");
        double valorProduto1 = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto1 = sc.nextInt();
        
        valorTotal += valorProduto1 * quantidadeProduto1;
        sc.nextLine();
        
        //2º solicitação
        System.out.print("Digite o nome da segunda bebida ou refeicao solicitada: ");
        String nomeProduto2 = sc.nextLine();
        System.out.print("Digite o valor: ");
        double valorProduto2 = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto2 = sc.nextInt();
        
        valorTotal += valorProduto2 * quantidadeProduto2;
        sc.nextLine();
        
        //3º solicitação
        System.out.print("Digite o nome da terceira bebida ou refeicao solicitada: ");
        String nomeProduto3 = sc.nextLine();
        System.out.print("Digite o valor: ");
        double valorProduto3 = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        int quantidadeProduto3 = sc.nextInt();
         
        valorTotal += valorProduto3 * quantidadeProduto3;
        
        sc.close();
        
        System.out.println("\nPedido da mesa " + numeroMesa + ":");
		System.out.println("Pedido: " + nomeProduto1 + ", " + nomeProduto2 + " e " + nomeProduto3);
		System.out.println("Valor individual: 1 = R$" + valorProduto1 + ", 2 = R$" + valorProduto2 + ", 3 = R$" + valorProduto3);
		System.out.println();
        System.out.println("Valor total da conta: R$" + valorTotal);
    }

}
