package estruturaRepeticao;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws InterruptedException {
        String enunciado =
                "Faça um programa para receber os nomes de 4 candidatos a líder de uma turma, em seguida \n" +
                        "receber os votos dos alunos existentes na sala, e ao final mostrar o total de votos de cada \n" +
                        "candidato e ainda o candidato vencedor da eleição.";

        simplePrint(enunciado + "\n \n \n");
        Thread.sleep(2000);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String cand1, cand2, cand3, cand4, nVencedor = "";
        int nAlunos, qntVotosVencedor = 0;
        Map<String, Integer> votos = new HashMap<>(4);

        simplePrint("Digite o nome do primeiro candidato: ");
        cand1 = scanner.next();
        simplePrint("Digite o nome do segundo candidato: ");
        cand2 = scanner.next();
        simplePrint("Digite o nome do terceiro candidato: ");
        cand3 = scanner.next();
        simplePrint("Digite o nome do quarto candidato: ");
        cand4 = scanner.next();
        simplePrint("Digite a quantidade de alunos da turma que irão votar: ");
        nAlunos = scanner.nextInt();

        votos.put(cand1, 0);
        votos.put(cand2, 0);
        votos.put(cand3, 0);
        votos.put(cand4, 0);

        for (int i = 0; i < nAlunos; i++) {
            switch (random.nextInt(4)) {
                case 0:
                    votos.put(cand1, votos.get(cand1) + 1);
                    break;
                case 1:
                    votos.put(cand2, votos.get(cand2) + 1);
                    break;
                case 2:
                    votos.put(cand3, votos.get(cand3) + 1);
                    break;
                case 3:
                    votos.put(cand4, votos.get(cand4) + 1);
                    break;
            }
        }
        // Loop de impressão dos votos
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.printf("O candidato %s, recebeu um total de %d votos.\n", entry.getKey(), entry.getValue());
            if (entry.getValue() > qntVotosVencedor) {
                qntVotosVencedor = entry.getValue();
                nVencedor = entry.getKey();
            }
        }
        simplePrint("\n\n\n O candidato vencedor foi o " + nVencedor + " com " + qntVotosVencedor + " votos.");
    }
    static void simplePrint(String s) { System.out.println(s);}
}