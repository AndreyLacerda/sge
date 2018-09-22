package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	
	private String nome;
	private String codigo;
	private static Collection<Turma> turmas;
	
	public Curso(String nome, String codigo, Turma turma) {
		this.nome = nome;
		this.codigo = codigo;
		Curso.turmas.add(turma);
	}
	
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}

}
