package br.edu.ifpr.trabalho.poo.main;


import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
import br.edu.ifpr.trabalho.poo.teste.Teste;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.classes.aluno.Aluno;
import br.edu.ifpr.trabalho.poo.classes.curso.Curso;
import br.edu.ifpr.trabalho.poo.classes.disciplina.Disciplina;
import br.edu.ifpr.trabalho.poo.classes.matricula.Matricula;
import br.edu.ifpr.trabalho.poo.classes.professor.Professor;
import br.edu.ifpr.trabalho.poo.classes.turma.Turma;


public class Main {

	public static void main(String[] args) {
		
		
		//Instanciando as Classes
		ITrabalhoPOO trabalho = new Teste();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
		
		//Chamando os métodos de leitura de dados
	    Aluno aluno =  trabalho.DadosAluno();
	    Professor professor = trabalho.DadosProfessor();
	    Curso curso = trabalho.DadosCurso();
	    Turma turma = trabalho.DadosTurma(curso);
	    Disciplina disciplina = trabalho.DadosDisciplina(professor, turma);
		Matricula matricula = trabalho.DadosMatricula(aluno, turma);
	
		
		//Chamando os métodos de Apresentação dos dados lidos
		alunos.add(aluno);
		trabalho.ApresentarAluno(alunos);
	
		professores.add(professor);
		trabalho.ApresentarProfessor(professores);
		
		cursos.add(curso);
		trabalho.ApresentarCurso(cursos);
	
		turmas.add(turma);
		trabalho.ApresentarTurma(turmas);
	
		matriculas.add(matricula);
		trabalho.ApresentarMatricula(matriculas);
		
		disciplinas.add(disciplina);
		trabalho.ApresentarDisciplina(disciplinas);
		

	}

}
