package br.edu.ifpr.trabalho.poo.classes.turma;

import br.edu.ifpr.trabalho.poo.classes.curso.Curso;

public class Turma {
	private int alunosMatriculados;
	private int numeroMinimo;
	private String nomeTurma;
	private Curso curso;

	

	//Criando o construtor padr�o
	public Turma() {
		
	}
	
	//Criando construtor com os par�metros
	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma, Curso curso) {
		super();
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
		this.alunosMatriculados = alunosMatriculados;
		this.curso = curso;
	}
	public Turma(int alunosMatriculados, int numeroMinimo, String nomeTurma) {
		super();
		this.numeroMinimo = numeroMinimo;
		this.nomeTurma = nomeTurma;
		this.alunosMatriculados = alunosMatriculados;
	
	}
	
	
	
	
	//Criando os m�todos Get e Set
	public int getAlunosMatriculados() {
		return alunosMatriculados;
	}
	public void setAlunosMatriculados(int alunosMatriculados) {
		this.alunosMatriculados = alunosMatriculados;
	}
	public int getNumeroMinimo() {
		return numeroMinimo;
	}
	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	} 
	
}
