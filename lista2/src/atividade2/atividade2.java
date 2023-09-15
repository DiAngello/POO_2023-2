//ª ATIVIDADE Desenvolver um programa para uma concessionária:
//O programa pedirá a senha (senha correta: “123”) (2pts)
//se for errada solicitará novamente e aparece a mensagem “ERRO DE SENHA”
//se for correta, entra no programa e aparece a mensagem “SENHA CORRETA”
//Usuário tem um menu de 3 opções (2pts)
//Cadastro cliente
//Será cadastrado NOME do cliente
//Telefone
//Endereço
//Compra de carro
//Aparece 3 opções de carros para escolher 1
//Pede a cor do carro
//Escolhe a forma de pagar
//Compra de acessório
//Escolhe o nome do acessório
//Escolhe a quantidade
//Quando o cliente finalizar uma das 3 opções, o programa volta para o menu principal. 

package atividade2;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		
		if(senha == 123) {
			System.out.println("SENHA CORRETA");
		} else {

			System.out.println("ERRO DE SENHA");
		}
			
		sc.close();
	}

}
