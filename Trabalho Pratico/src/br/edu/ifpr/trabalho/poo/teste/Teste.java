package br.edu.ifpr.trabalho.poo.teste;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.edu.ifpr.trabalho.poo.classes.aluno.Aluno;
import br.edu.ifpr.trabalho.poo.classes.curso.Curso;
import br.edu.ifpr.trabalho.poo.classes.disciplina.Disciplina;
import br.edu.ifpr.trabalho.poo.classes.matricula.Matricula;
import br.edu.ifpr.trabalho.poo.classes.professor.Professor;
import br.edu.ifpr.trabalho.poo.classes.turma.Turma;
import br.edu.ifpr.trabalho.poo.interfaces.ITrabalhoPOO;
// Implementando a interface 
public class Teste implements ITrabalhoPOO {
	//Lendo os Dados

	@Override
	public Aluno DadosAluno() {	
		String nome = JOptionPane.showInputDialog("Digite o nome completo do(os) aluno(os/as)");
		String endereco = JOptionPane.showInputDialog("Digite o endereço do(os/as) aluno(os/as) Ex: Rua x");
		String dtNasc = JOptionPane.showInputDialog("Digite a data de nascimento do(s/as) aluno(os/as) Dica: Dia/Mês/Ano");
		String cellContato = JOptionPane.showInputDialog("Digite o número de contato do aluno(os/as) Ex:(DDD) 9 0000-0000");
		String estado = JOptionPane.showInputDialog("Digite o estado na qual o aluno reside");
		String cidade = JOptionPane.showInputDialog("Digite a cidade da qual o aluno reside"); 
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso na instituição de ensino"));
		
		Aluno aluno = new Aluno(ano, nome, endereco, dtNasc, cellContato, estado,cidade);
		return aluno;
	}

	@Override
	public Professor DadosProfessor() {
		String siape =  JOptionPane.showInputDialog("Digite a siape do professor") ;
		String nome = JOptionPane.showInputDialog("Digite o nome completo do professor") ;
		String endereco = JOptionPane.showInputDialog("Digite o endereço do Professor Ex: Rua x");
		String dtNasc = JOptionPane.showInputDialog("Digite a data de nascimento do Professor Obs: Dia/Mês/Ano");
		String cellContato = JOptionPane.showInputDialog("Digite o número de contato do professor Ex: Ex:(DDD) 9 0000-0000");
		String estado = JOptionPane.showInputDialog("Digite o estado na qual o professor reside");
		String cidade = JOptionPane.showInputDialog("Digite a cidade da qual o professor reside");
		Professor professor = new Professor(siape, nome, endereco, dtNasc, cellContato, cidade, estado);

		return professor;
	}

	@Override
	public Curso DadosCurso() {
		String nome = JOptionPane.showInputDialog("Digite o nome do curso na qual o aluno esta cursando");
		Curso curso = new Curso(nome);
		return curso;
	}

	@Override
	public Turma DadosTurma() {
		return null;
	}

	@Override
	public Turma DadosTurma(Curso curso) {
		int matriculados = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de alunos matriculados"));
		int numeroMinimo = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero minimo de alunos na turma"));
		String nomeTurma = JOptionPane.showInputDialog("Digite o nome da Turma");

		Turma turma = new Turma(matriculados, numeroMinimo, nomeTurma, curso);
		return turma;
	}

	@Override
	public Disciplina DadosDisciplina(Professor professor, Turma turma) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
		int carga = Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horaria da disciplina")) ;
		Disciplina d = new Disciplina(nome, carga, professor, turma);
		return d;
	}

	@Override
	public Disciplina DadosDisciplina() {
		return null;
	}

	@Override
	public Matricula DadosMatricula() {
		return null;
	}

	@Override
	public Matricula DadosMatricula(Aluno aluno, Turma turma) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da matricula"));
		boolean ativa;
		String ativacao = JOptionPane.showInputDialog("O aluno está matriculado ? ATENÇÃO: Espaços contaram como caracter" + "\n" + "Sim, para ativa"+ "\n" + "Não, para desativada");

		if (ativacao.equals("Sim")) {
			ativa = true;
		} else {
			ativa = false;
		}

		Matricula matricula = new Matricula(numero, ativa, aluno, turma);

		return matricula;
	}
	
	//Apresentado os Dados
	@Override
	public void ApresentarAluno(ArrayList<Aluno> alunos) {
	
		System.out.println("*************** Dados do Aluno(os) ***************");
		for (Aluno aluno : alunos) {
			
			System.out.println("Nome do Aluno: " + aluno.getNome());
			System.out.println("Endereço do Aluno: " + aluno.getEndereco() +"," +aluno.getCidade()+","+aluno.getEstado());
			System.out.println("Data de Nascimento: " + aluno.getDtNasc());
			System.out.println("Telefone de contato: " + aluno.getCellContato());
			System.out.println("Ano de ingresso do aluno: " + aluno.getAnoDeIngresso());
		}

	}

	@Override
	public void ApresentarProfessor(ArrayList<Professor> professores) {
		//professores.add(DadosProfessor());
		System.out.println("\n*************** Dados do Professores ***************");
		for (Professor professor : professores) {
			System.out.println("Nome do professor: " + professor.getNome());
			System.out.println("Endereço do professor: " + professor.getEndereco() +"," +professor.getCidade()+","+ professor.getEstado());
			System.out.println("Data de Nascimento: " + professor.getDtNasc());
			System.out.println("Telefone de contato: " + professor.getCellContato());
			System.out.println("Siape do Professor: " + professor.getSiape());
		}

	}

	@Override
	public void ApresentarCurso(ArrayList<Curso> cursos) {
	//	cursos.add(DadosCurso());
		System.out.println("\n*************** Dados do Curso ***************");
		for (Curso curso : cursos) {
			System.out.println("Nome do curso: " + curso.getNome());
		}

	}

	@Override
	public void ApresentarTurma(ArrayList<Turma> turmas) {
		//turmas.add(DadosTurma(DadosCurso()));
		System.out.println("\n*************** Dados da Turma ***************");

		for (Turma turma : turmas) {
			System.out.println("Nome da turma: " + turma.getNomeTurma());
			System.out.println("Alunos Matriculados: " + turma.getAlunosMatriculados());
			System.out.println("Numero minimo de alunos: " + turma.getNumeroMinimo());
			System.out.println("Curso da turma: " + turma.getCurso().getNome());

		}
	}
	
	@Override
	public void ApresentarDisciplina(ArrayList<Disciplina> disciplinas) {
	//	disciplinas.add(DadosDisciplina(DadosProfessor(), DadosTurma()));
		System.out.println("\n*************** Dados da Disciplina ***************");

		for (Disciplina disciplina : disciplinas) {
			System.out.println("Nome da Disciplina: " + disciplina.getNome());
			System.out.println("Carga Horaria: " + disciplina.getCargaHoraria() + " Horas");
			System.out.println("Professor da disciplina: " + disciplina.getProfessor().getNome());
			System.out.println("Turma da disciplina: " + disciplina.getTurma().getNomeTurma());
		}
	}

	@Override
	public void ApresentarMatricula(ArrayList<Matricula> matriculas) {
	//	matriculas.add(DadosMatricula());
		System.out.println("\n*************** Dados da Matricula ***************");

		for (Matricula matricula : matriculas) {
			System.out.println("Número da matricula: " + matricula.getNumero());
			if(matricula.isAtiva() == true) {
				System.out.println("Status da Matricula: Ativa");
			}else {
				System.out.println("Status da Matricula: Desativada");
			}
			
			System.out.println("Ano de ingresso do aluno: " + matricula.getAluno().getAnoDeIngresso());
			System.out.println("Turma da matricula: " + matricula.getTurma().getNomeTurma());
		}
	}

}
