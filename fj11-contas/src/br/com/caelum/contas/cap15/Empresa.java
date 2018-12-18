package br.com.caelum.contas.cap15;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String cnpj;
	
	private List<Funcionario> empregados = new ArrayList<>();

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Funcionario> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Funcionario> empregados) {
		this.empregados = empregados;
	}
	
}
