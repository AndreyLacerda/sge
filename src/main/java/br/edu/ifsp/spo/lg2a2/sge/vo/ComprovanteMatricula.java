package br.edu.ifsp.spo.lg2a2.sge.vo;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;

public class ComprovanteMatricula {
	
	private Aluno aluno;
	private Turma turma;
	
	public Aluno getAluno() {
		return aluno;
	}
	public Turma getTurma() {
		return turma;
	}
	
	public ComprovanteMatricula(Aluno aluno, Turma turma, String prontuario) {
		super();
		this.aluno = aluno;
		this.turma = turma;
	}

}
