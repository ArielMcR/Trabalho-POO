package br.edu.ifpr.trabalho.poo.classes.curso;



public class Curso {
	String nome;
	
	
	 //Criando o construtor padr�o
	public Curso(){
		
	}
	
    //Criando o construtor com os par�metros 	
	public Curso(String nome) {
		
		this.nome = nome;
	}
	
    //Criando os m�todos Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	}


