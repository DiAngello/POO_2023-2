//2ª ATIVIDADE
//Desenvolver um programa para uma escola.
//O sistema irá perguntar ao usuário o nome do(a) professor(a);
//Em seguida o programa solicita:
//NOME do(a) estudante
//2 notas do semestre;
//O sistema faz a média e mostra os dados em ordem de cada estudante:
//NOME
//NOTA 1
//NOTA 2
//MÉDIA

package lista1;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do(a) professor(a): ");
        String nomeProfessor = sc.nextLine();
        System.out.print("Digite o nome do(a) estudante: ");
        String nomeEstudante = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        double media = (nota1 + nota2) / 2.0;
        
        sc.close();
        
        System.out.println("\nNome do(a) professor(a): " + nomeProfessor);
        System.out.println("Nome do(a) estudante: " + nomeEstudante);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media);
    }

}
