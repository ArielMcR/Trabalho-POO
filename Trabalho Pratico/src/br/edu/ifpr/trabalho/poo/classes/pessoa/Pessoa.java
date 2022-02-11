package br.edu.ifpr.trabalho.poo.classes.pessoa;




public abstract class Pessoa {
	protected String nome;
	protected String endereco;
	protected String dtNasc;
	protected String cellContato;
	
	
	//Criando o Construtor Padrão, porém é válido lembrar que essa classe não vai ser instanciada
	public Pessoa() {
		
	}
	//Criando o Construtor
	public Pessoa(String nome, String endereco, String dtNasc, String cellContato) {
		this.nome = nome;
		this.endereco = endereco;
		this.dtNasc = dtNasc;
		this.cellContato = cellContato;
	}
	
//Criando o método para apresentar na tela os atributos da classe pessoa	
 public abstract void imprimirDados();
	
	

 
 //Criando os métodos Get e Set
 public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getCellContato() {
		return cellContato;
	}
	public void setCellContato(String cellContato) {
		this.cellContato = cellContato;
	}
 
}


