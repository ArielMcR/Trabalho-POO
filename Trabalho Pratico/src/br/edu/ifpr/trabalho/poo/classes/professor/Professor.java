package br.edu.ifpr.trabalho.poo.classes.professor;

import br.edu.ifpr.trabalho.poo.classes.pessoa.Pessoa;

public final class Professor extends Pessoa{
	
	private String siape;
	private String cidade;
	private String estado;
	//Criando o construtor Padrão
	public Professor() {
		
	}
	//Criando o construtor com os parâmetros
	public Professor(String siape, String nome, String endereco, String dtNasc, String cellContato, String cidade, String estado) {
		this.siape = siape;
		this.nome = nome;
		this.endereco = endereco;
		this.dtNasc = dtNasc;
		this.cellContato = cellContato;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	//Criando os métodos Get e Set
	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}
	@Override
	public void imprimirDados() {
		 System.out.println("Nome: " + nome);
		 System.out.println("Endereço: " + endereco);
		 System.out.println("Data de Nascimento: " + dtNasc);
		 System.out.println("Celular de Contato " + cellContato);
		
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
