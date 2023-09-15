//1ª ATIVIDADE 
//Desenvolver um programa para:
//Cadastrar o nome completo do Cliente
//Cadastrar 2 valores inteiros
//Dividir o primeiro valor pelo segundo
//Mostrar o nome completo, 1º valor, 2º valor e a divisão em real utilizando o casting.

package lista1;

import java.util.Scanner;

public class atividade1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome completo do cliente: ");
        String nomeCompleto = sc.nextLine();
        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = sc.nextInt();
        
        sc.close();
        
        double resultadoDivisao = (double) valor1 / valor2;
        
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Primeiro Valor: " + valor1);
        System.out.println("Segundo Valor: " + valor2);
        System.out.println("Resultado da Divisao: " + resultadoDivisao);
    }

}
