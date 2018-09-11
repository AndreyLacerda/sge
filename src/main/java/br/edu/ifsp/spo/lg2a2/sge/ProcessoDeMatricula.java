package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Turma;
import br.edu.ifsp.spo.lg2a2.sge.repositories.AlunosRepository;
import br.edu.ifsp.spo.lg2a2.sge.vo.ComprovanteMatricula;
import br.edu.ifsp.spo.lg2a2.sge.vo.DadosAluno;

public class ProcessoDeMatricula {
	
	private Curso curso;
	
	public ProcessoDeMatricula(Curso curso) {
		this.curso = curso;
	}

	public static SituacaoMatricula verificarExistenciaAluno(String cpf) {
		Aluno existencia = AlunosRepository.buscarPorCpf(cpf);
		if (existencia == null) {
			return SituacaoMatricula.Novo; 
		}
		else {
			return SituacaoMatricula.Cadastrado;
		}
	}
	
	public static ComprovanteMatricula processarMatricula(DadosAluno dados, int cont) {
		Turma turma = null;
		String pront = gerarProntuario (cont);
		Aluno aluno = new Aluno (pront, dados.getCpf(), dados.getNome(), dados.getEmail());
		ComprovanteMatricula comprovante = new ComprovanteMatricula(aluno, turma);
		return comprovante;
	}
	
	private static String gerarProntuario(int cont) {
		String pront = "SP";
		pront = pront + cont;
		return pront;
	}
	
}
