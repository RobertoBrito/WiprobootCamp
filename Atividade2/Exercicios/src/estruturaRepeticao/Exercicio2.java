package estruturaRepeticao;


import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, media;
		String nomeAluno;
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.next();
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2;
		if (media >= 6) {
			System.out.printf("A média das notas de %n %s é %.2f, o aluno foi Aprovado", nomeAluno, media);
		}
		else {
			System.out.printf("A média das notas de %n %s é %.2f, o aluno foi Reprovado", nomeAluno, media);
		}
	}
}