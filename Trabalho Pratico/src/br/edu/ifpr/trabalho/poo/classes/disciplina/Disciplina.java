package br.edu.ifpr.trabalho.poo.classes.disciplina;

import br.edu.ifpr.trabalho.poo.classes.professor.Professor;
import br.edu.ifpr.trabalho.poo.classes.turma.Turma;

public class Disciplina{
    private String nome ;
	private int cargaHoraria;
    private Professor professor;
    private Turma turma;
    
  
	//Criando o construtor padrão
    public Disciplina() {
    //Criando o construtor com os parâmetros 	
    }
    public Disciplina(String nome, int cargaHoraria, Professor professor, Turma turma) {
    	super();
    	this.nome = nome;
    	this.cargaHoraria = cargaHoraria;
    	this.professor = professor;
    	this.turma = turma;
    }
    //Criando os métodos Get e Set
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	 public Turma getTurma() {
			return turma;
		}
	public void setTurma(Turma turma) {
			this.turma = turma;
		}
}
