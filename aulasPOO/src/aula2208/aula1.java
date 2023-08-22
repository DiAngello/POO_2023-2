package src.aula2208;


import java.util.Scanner;
import java.util.Locale;

public class aula1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome, cidade, cargo, email;
		int idade, cpf;
		double salario, vt, va;
		
		System.out.println("Digite o nome do funcionario:");
		nome = sc.next();
		System.out.println("Digite o cargo do funcionario:");
		cargo = sc.next();
		System.out.println("Digite a cidade:");
		cidade = sc.next();
		System.out.println("Digite o e-mail do funcionario:");
		email = sc.next();
		System.out.println("Digite a idade do funcionario:");
		idade = sc.nextInt();
		System.out.println("Digite o CPF do funcionario:");
		cpf = sc.nextInt();
		System.out.println("Digite o salário do funcionario:");
		salario = sc.nextDouble();
		System.out.println("Digite o VT do funcionario:");
		vt = sc.nextDouble();
		System.out.println("Digite o VA do funcionario:");
		va = sc.nextDouble();
		
		System.out.println("Nome do funcionário:" + nome);
		System.out.println("Cargo do funcionário:" + cargo);
		System.out.println("Cidade:" + cidade);
		System.out.println("E-mail do funcionário:" + email);
		System.out.println("Idade do funcionário:" + idade);
		System.out.println("CPF do funcionário:" + cpf);
		System.out.println("Salário:" + salario);
		System.out.println("VT:" + vt);
		System.out.println("VA:" + va);
		
		sc.close();
	}

}
