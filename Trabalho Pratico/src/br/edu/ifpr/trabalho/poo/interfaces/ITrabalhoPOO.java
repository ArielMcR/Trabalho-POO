package br.edu.ifpr.trabalho.poo.interfaces;


import java.lang.reflect.Array;
import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.classes.aluno.Aluno;
import br.edu.ifpr.trabalho.poo.classes.curso.Curso;
import br.edu.ifpr.trabalho.poo.classes.disciplina.Disciplina;
import br.edu.ifpr.trabalho.poo.classes.matricula.Matricula;
import br.edu.ifpr.trabalho.poo.classes.professor.Professor;
import br.edu.ifpr.trabalho.poo.classes.turma.Turma;

public interface ITrabalhoPOO {
	//Criando os métodos De leitura de Dados 
	Aluno DadosAluno();
	Professor DadosProfessor();
	Curso DadosCurso();
	Turma DadosTurma();
	Turma DadosTurma(Curso curso);
	Disciplina DadosDisciplina();
	Disciplina DadosDisciplina(Professor professor, Turma turma);
	Matricula DadosMatricula();
	Matricula DadosMatricula(Aluno aluno, Turma turma);
	
	//Criando os métodos de apresentação de dados utilizando o ArrayList
    void ApresentarAluno(ArrayList<Aluno> alunos);
	void ApresentarProfessor(ArrayList<Professor> professores);
	void ApresentarCurso(ArrayList<Curso> cursos);
	void ApresentarTurma(ArrayList<Turma> turmas);
	void ApresentarDisciplina(ArrayList<Disciplina> disciplinas);
	void ApresentarMatricula(ArrayList<Matricula> matriculas);
	
	
	
	
}
