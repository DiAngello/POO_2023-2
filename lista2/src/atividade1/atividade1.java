//1ª ATIVIDADE Desenvolver um programa para:
//Cadastrar o nome da Empresa
//Cadastrar o CNPJ
//Cadastrar a renda bruta mensal (até aqui 2pts)
//O programa ficará rodando o cadastro de inúmeras empresas utilizando o repetidor ENQUANTO, para o usuário sair, será utilizado o valor ZERO “0”.  (3pts)
package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String empresa;
		int escolha = 1, rendaBrutaM;
		long cnpj;
		
		while(escolha != 0) {
			System.out.println("Digite o nome da Empresa: ");
			empresa = sc.next();
			System.out.println("Digite o CNPJ da Empresa: ");
			cnpj = sc.nextLong();
			System.out.println("Digite a renda bruta mensal da Empresa: ");
			rendaBrutaM = sc.nextInt();
			System.out.println("Nome da empresa: " + empresa);
			System.out.println("CNPJ: " + cnpj);
			System.out.println("Renda bruta mensal: " + rendaBrutaM);
			System.out.println("(0) - sair do programa\n(1) - Continuar o cadastro");
			escolha = sc.nextInt();
			}
		sc.close();
		
		System.out.println("Programa finalizado!");
	}

}
