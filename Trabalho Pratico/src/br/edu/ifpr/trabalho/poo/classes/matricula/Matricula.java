package br.edu.ifpr.trabalho.poo.classes.matricula;

import br.edu.ifpr.trabalho.poo.classes.aluno.Aluno;
import br.edu.ifpr.trabalho.poo.classes.turma.Turma;

public class Matricula {
	private int numero;
	private boolean ativa;
	private Aluno aluno;
	private Turma turma;
	
	//Criando o construtor padrão
	public Matricula() {
		
	}
	
	//Criando o construtor com os parâmetros
	public Matricula(int numero, boolean ativa, Aluno aluno, Turma turma) {
		this.numero = numero;
		this.ativa = ativa;
		this.aluno = aluno;
		this.turma = turma;
		
	}
	
	
	
    //Criando os métodos Get e Set
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

}
