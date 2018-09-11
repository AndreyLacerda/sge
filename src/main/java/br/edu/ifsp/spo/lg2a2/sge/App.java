package br.edu.ifsp.spo.lg2a2.sge;

import br.edu.ifsp.spo.lg2a2.sge.entidades.Aluno;
import br.edu.ifsp.spo.lg2a2.sge.entidades.Curso;
import br.edu.ifsp.spo.lg2a2.sge.entidades.SituacaoMatricula;

//class Pessoa {
//	private static int quantidadeInstancias;
//	public static int getQuantidadeInstancias() {
//		return quantidadeInstancias;
//	}
//	
//	private String nome;
//	public String getNome() {
//		return this.nome;
//	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//	public Pessoa() {
//		Pessoa.quantidadeInstancias++;
//	}
//}

public class App {

	public static void main(String[] args) {
		
		
		Aluno andrey = new Aluno("SP3013049", "567894523-50", "Andrey Camargo Lacerda", "andrey-lacerda@hotmail.com");
		Curso ads = new Curso("ads", "8588756456");
		// TODO Auto-generated method stub		
		
//		Pessoa joao = new Pessoa();
//		joao.setNome("João");
//		
//		System.out.println(Pessoa.getQuantidadeInstancias());
//		System.out.println(joao.getNome());
//		
//		Pessoa maria = new Pessoa();
//		maria.setNome("Maria");
//		System.out.println(Pessoa.getQuantidadeInstancias());
//		System.out.println(maria.getNome());
	}

}
