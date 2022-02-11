package br.edu.ifpr.trabalho.poo.classes.aluno;

import br.edu.ifpr.trabalho.poo.classes.pessoa.Pessoa;

public final class Aluno extends Pessoa{
	private int anoDeIngresso;
	private String estado;
	private String cidade;

	
	//Construtor Padrão
	public Aluno() {
		
	}
	//Construtor com os parâmetros
	public Aluno(int anoDeIngresso, String nome, String endereco, String dtNasc, String cellContato, String estado, String cidade) {
		this.cellContato = cellContato;
		this.nome = nome;
		this.dtNasc = dtNasc;
		this.endereco = endereco;
		this.anoDeIngresso = anoDeIngresso;
		this.estado = estado;
		this.cidade = cidade;
	}

	//Criando os métodos Get e Set

	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}
	@Override
	public void imprimirDados() {
		 System.out.println("Nome: " + nome);
		 System.out.println("Endereço: " + endereco);
		 System.out.println("Data de Nascimento: " + dtNasc);
		 System.out.println("Celular de Contato " + cellContato);
		
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
		
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}
