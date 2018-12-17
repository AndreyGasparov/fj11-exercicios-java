package br.com.caelum.contas.cap14;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];

		// povoamento do laço
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.deposita(i * 100.0);
			contas[i] = conta;

		}
		// mostrar laço
		// for (int i = 0; i < contas.length; i++) {
		// System.out.println(contas[i]);
		// }

		double soma = 0;
		for (int i = 0; i < contas.length; i++) {
			soma += contas[i].getSaldo();
			double total = soma / contas.length;

			if (i == contas.length - 1) {
				System.out.println("Total de Saldos Computados: " + i + "\nValor Total: $" + soma);
				System.out.println("Média: $" + total);
			}
		}

		String frase = "Socorram-me, subi no ônibus em Marrocos";

		String[] palavras = frase.split(" ");

		// for (int i = 0; i < palavras.length; i++) {
		// String palavra = palavras[i];
		// System.out.print(palavra + " ");
		// }

		for (String word : palavras) {
			System.out.print(word + " ");
		}

		System.out.println("\n");

		for (int i = 6; i > 0; i--) {
			System.out.print(palavras[i - 1] + " ");
		}

		// String string = "004-034556-42";
		// String[] parts = string.split("-", 2);
		// String part1 = parts[0]; // 004
		// System.out.println(part1);
		// String part2 = parts[1];
		// System.out.println(part2);

		// String alfabeto = String.join(",", "A", "B", "C");
		// System.out.println(alfabeto);
		//
		// String[] letras = alfabeto.split(", ");
		// for (String letra : letras) {
		// System.out.println(letra);
		// }
	}

}
