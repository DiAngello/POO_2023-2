import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		double num1 = sc.nextDouble();
		System.out.println("Digite a operacao ( + , - , * , / ):");
		char operacao = sc.next().charAt(0);
		System.out.println("Digite o segundo numero:");
		double num2 = sc.nextDouble();
		double resultado = 0;
		
		if (operacao == '+') {
			resultado = num1 + num2;
		} else if (operacao == '-') {
			resultado = num1 - num2;
		} else if (operacao == '*') {
			resultado = num1 * num2;
		} else if (operacao == '/') {
		if (num2 != 0) {
			resultado = num1 / num2;
		} else {
			System.out.println("Erro! Operacao invalida.");
		return;
		}
		}
		System.out.printf("O resultado e: %.2f%n", resultado);
		}
}
