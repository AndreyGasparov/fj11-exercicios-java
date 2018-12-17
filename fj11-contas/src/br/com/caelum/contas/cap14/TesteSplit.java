package br.com.caelum.contas.cap14;

public class TesteSplit {

	public static void main(String[] args) {
		String usuario = "Mario; 1; 100";
		String[] arrayUsuario = usuario.split(";");

		Pessoa pessoa = new Pessoa(Integer.parseInt(arrayUsuario[0]), arrayUsuario[1],
				Integer.parseInt(arrayUsuario[2]));

		System.out.println(pessoa.toString());

	}

}
