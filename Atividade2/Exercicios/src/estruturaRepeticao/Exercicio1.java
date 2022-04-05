package estruturaRepeticao;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random aleatorio = new Random();
		int random = aleatorio.nextInt(11);
		int numeroEntrada = -1;
		int contadorTentativas = 0;
		
		while (numeroEntrada != random) {
			System.out.println("Tente adivinhar o numero gerado:");
			numeroEntrada = sc.nextInt();
			contadorTentativas++;
			if (numeroEntrada > random)
				System.out.println("O numero gerado é menor, tente novamente:");
			if (numeroEntrada < random)
				System.out.println("O numero gerado é maior, tente novamente:");
		}
		System.out.printf("Voce acertou o numero depois de %d tentativas", contadorTentativas);
	}
}