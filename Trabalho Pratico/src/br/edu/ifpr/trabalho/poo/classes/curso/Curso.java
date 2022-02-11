package br.edu.ifpr.trabalho.poo.classes.curso;



public class Curso {
	String nome;
	
	
	 //Criando o construtor padrão
	public Curso(){
		
	}
	
    //Criando o construtor com os parâmetros 	
	public Curso(String nome) {
		
		this.nome = nome;
	}
	
    //Criando os métodos Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	}


