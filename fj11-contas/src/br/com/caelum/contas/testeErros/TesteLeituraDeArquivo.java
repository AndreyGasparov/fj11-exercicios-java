package br.com.caelum.contas.testeErros;

import java.io.*;

public class TesteLeituraDeArquivo {

	public static void main(String[] args) {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// try {
		// new java.io.FileInputStream("arquivo.txt");
		// } catch (java.io.FileNotFoundException e) {
		// System.out.println("N�o foi poss�vel abrir o arquivo para leitura");
		// }

	}

	public static void metodo() throws java.io.FileNotFoundException {
	}

}
