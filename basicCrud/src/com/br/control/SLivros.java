package com.br.control;

import java.util.ArrayList;
import java.util.List;

import com.br.model.Livro;
import com.br.model.LivroDigital;
import com.br.model.LivroFisico;

public class SLivros extends Gerenciador {

	private List<Livro> livros;
	private List<LivroDigital> livrosDigitais;
	private List<LivroFisico> livrosFisicos;
	
	public SLivros() {
		super();
		this.livrosDigitais = new ArrayList<>();
		this.livrosFisicos = new ArrayList<>();
	}
	
	public void adicionarLivroDigital(LivroDigital livroDigital) {
		livrosDigitais.add(livroDigital);
		System.out.println("Livro "+livroDigital.getNome() +" cadastrado com sucesso!");
	}
	
	public void adicionarLivoFisico(LivroFisico livroFisico) {
		livrosFisicos.add(livroFisico);
		System.out.println("Livro "+livroFisico.getNome() +" cadastrado com sucesso!");
	}
	
	public void deletarLivroDigital(String tituloLivro) {
		for (int i = 0; i < livrosDigitais.size(); i++) {
			if(livrosDigitais.get(i).equals(tituloLivro)) {
				livrosDigitais.remove(i);
				System.out.println("O livro foi removido do sistema.");
			} else {
				System.out.println("Infelizmente livro não consta no sistema.");
			}
		}
	}
	
	public void deletarLivroFisico(String tituloLivro) {
		for (int i = 0; i < livrosFisicos.size(); i++) {
			if(livrosFisicos.get(i).equals(tituloLivro)) {
				livrosFisicos.remove(i);
				System.out.println("O livro foi removido do sistema.");
			} else {
			System.err.println("Infelizmente livro não consta no sistema.");
		}
		}
	}
	
	public List<LivroDigital> getLivrosDigitais() {
		return livrosDigitais;
	}
	public void setLivrosDigitais(List<LivroDigital> livrosDigitais) {
		this.livrosDigitais = livrosDigitais;
	}
	public List<LivroFisico> getLivrosFisicos() {
		return livrosFisicos;
	}
	public void setLivrosFisicos(List<LivroFisico> livrosFisicos) {
		this.livrosFisicos = livrosFisicos;
	}
	public List<Livro> getLivros() {
		return livros;
	}
}
