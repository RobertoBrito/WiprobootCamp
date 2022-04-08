package ExercicioOOwipro;

public class ControleRemoto {

	int volumeMax = 100, volumeMin = 30, canalMax = 30;

	Televisao tv = new Televisao();

	/*
	 * void ligarTv() { tv.setLigado(true);
	 * 
	 * 
	 * } void desligarTv() { tv.setLigado(false);
	 * 
	 * 
	 * }
	 */

	void aumentarVolume() {
		tv.setVolume(volumeMin);
		if (tv.getVolume() > 5) {
			volumeMin++;
			tv.setVolume(volumeMin);
			System.out.println("Aumentando o volume" + tv.getVolume());
		} else {
			System.out.println("Volume já está no Maximo");
		}
	}

	void diminuirVolume() {
		tv.setVolume(volumeMax);
		if (tv.getVolume() >= volumeMax) {
			volumeMax--;
			tv.setVolume(volumeMax);
			System.out.println("diminui o volume" + tv.getVolume());
		} else {
			System.out.println("Volume já está no Minimo");
		}
	}

	void diminuirCanal() {

		if (tv.getCanal() <= canalMax) {
			if (tv.getCanal() == 1) {
				tv.setCanal(canalMax);
				System.out.println("canal" + tv.getCanal());
			} else {
				canalMax--;
				tv.setCanal(canalMax);
				System.out.println("canal" + tv.getCanal());
			}
		}

	}

	public void mostraStatus() {
		if (tv.isLigado())
			System.out.println(
					"Esta no canal " + tv.getCanal() + ", no volume " + tv.getVolume() + " e o televisor esta ligado.");
		else
			System.out.println("O televisor esta desligado.");
	}

}
