package com.br.control;

import java.util.ArrayList;
import java.util.List;

import com.br.model.Livro;
import com.br.model.LivroDigital;

public class Gerenciador {

	private List<Livro> livros;
	private List<LivroDigital> livrosDigitais;
		
	public Gerenciador() {
		super();
		livros = new ArrayList<>();
		livrosDigitais = new ArrayList<>();
	}
	
	public void adcionarLivro(Livro livro) {
		livros.add(livro);
		System.out.println(livro.getNome()+ " cadastrado(a) com sucesso!");
	}
	
	public void deletarLivro(String titulo) {
		for (int i = 0; i < livros.size(); i++) {
			if(livros.get(i).equals(titulo)) {
				livros.remove(i);
				System.err.println("Livro removido do sistema.");
			} else {
				System.err.println("Livro infelizmente não existe no sistema.");
			}
		}
	}
	
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<LivroDigital> getLivrosDigitais() {
		return livrosDigitais;
	}
	public void setLivrosDigitais(List<LivroDigital> livrosDigitais) {
		this.livrosDigitais = livrosDigitais;
	}
}
