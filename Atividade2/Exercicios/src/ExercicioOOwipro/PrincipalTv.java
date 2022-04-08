package ExercicioOOwipro;

import java.util.Scanner;

public class PrincipalTv {

	public static void main(String[] args) {
		int opcao;
		Televisao tv = new Televisao();
		ControleRemoto controle = new ControleRemoto();
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("ligar Tv - 1");
			System.out.println("aumentar valoume Tv - 2");
			System.out.println("diminui volume  Tv - 3");
			System.out.println("aumentar canal - 4");
			System.out.println("diminui canal- 5");
			System.out.println("desligar- 6");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				if (tv.isLigado()) {
					System.out.println("Tv ligada");

				} else {
					tv.setLigado(true);
					tv.setCanal(30);
					System.out.println("Ligando a TV no canal " + tv.getCanal());
				}

				break;

			case 2:
				controle.aumentarVolume();
				//System.out.println("Aumentando o volume"+tv.getVolume());
				break;
			case 3:
				controle.diminuirVolume();
				
				break;
			case 4:
				
				break;
			case 5:
				controle.diminuirCanal();
				break;

			case 6:
				tv.setLigado(false);
				System.out.println("desligando TV");

			default:
				break;
			}

		} while (tv.isLigado());

	}

}
