package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.repositories.AlunosRepository;

public class Turma {
	private static Collection<Aluno> alunos;
	private String codTurma;
	
	public Turma (String codTurma) {
		this.codTurma = codTurma;
	}
	
	public String getCodTurma() {
		return this.codTurma;
	}
	
	public Collection<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public void adicionar(Aluno aluno) {
		Turma.alunos.add(aluno);
	}
	
	public String toString() {
		return "<Turma: " 
				+ this.getCodTurma() + ">";
	}
}
