package br.edu.ifsp.spo.lg2a2.sge.entidades;

import java.util.Collection;

public class Curso {
	
	public Curso(String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	private Collection<Turma> turmas;
	public Collection<Turma> getTurmas() {
		return this.turmas;
	}

}
