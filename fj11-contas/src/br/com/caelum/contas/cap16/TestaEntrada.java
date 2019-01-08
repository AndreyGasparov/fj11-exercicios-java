package br.com.caelum.contas.cap16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestaEntrada {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("arquivo.txt");
		int b = is.read();
		InputStream isr = new FileInputStream("arquivo.txt");
		int c = isr.read();
		
		System.out.println(c);
	}

}
