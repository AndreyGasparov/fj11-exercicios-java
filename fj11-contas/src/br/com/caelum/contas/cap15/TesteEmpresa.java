package br.com.caelum.contas.cap15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteEmpresa {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario empregado1 = new Funcionario();
		empregado1.setNome("joao");
		Funcionario empregado2 = new Funcionario();
		empregado1.setNome("maria");
		Funcionario empregado3 = new Funcionario();
		empregado1.setNome("joaquim");

		funcionarios.add(empregado1);
		funcionarios.add(empregado2);
		funcionarios.add(empregado3);

//		Collections.sort(funcionarios, funcionarios.getNome());

		List<String> lista = new ArrayList<>();
		lista.add("ricardo");
		lista.add("patricia");
		lista.add("aline");

		System.out.println(lista);

		Collections.sort(lista);

		System.out.println(lista);

	}

}
