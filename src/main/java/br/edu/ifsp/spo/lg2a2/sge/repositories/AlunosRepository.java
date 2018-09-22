package br.edu.ifsp.spo.lg2a2.sge.repositories;

import java.util.ArrayList;
import java.util.Collection;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;

public class AlunosRepository {
	
	private static Collection<Aluno> alunos = new ArrayList<Aluno>();

	public AlunosRepository() {
		
	}
	
	public AlunosRepository(Collection<Aluno> alunos) {
		this.alunos.addAll(alunos);
	}
	
	
	public static Aluno buscarPorCpf(String cpf) {		
		Aluno resultado = null;
		
		for(Aluno aluno : AlunosRepository.alunos) {
			if(aluno.getCpf().equals(cpf)) {
				resultado = aluno;
				break;
			}
		}
		
		return resultado;
	}
	
	public static void adicionar(Aluno aluno) {
		AlunosRepository.alunos.add(aluno);
	}
	
	public void remover(Aluno aluno) {
		AlunosRepository.alunos.remove(aluno);
	}
}
