package com.br.control;

import java.util.ArrayList;
import java.util.List;

import com.br.model.Livro;
import com.br.model.LivroDigital;
import com.br.model.LivroFisico;

public class Gerenciador {

	private List<Livro> livros;
	private List<LivroFisico> livrosFisicos;
	private List<LivroDigital> livrosDigitais;
	private SLivros sLivros;
		
	public Gerenciador() {
		super();
		this.livros = new ArrayList<>();
		this.livrosFisicos = new ArrayList<>();
		this.livrosDigitais = new ArrayList<>();
		this.sLivros = new SLivros();
	}
	
	public void listarLivros() {
		String listaDeLivros = "";
		for (int i = 0; i < livros.size(); i++) {
			Livro livro = livros.get(i);
			if(livro.equals("")) {
				System.out.println("Não há livros no sistema.");
			} else {
				listaDeLivros += "Nome: "+livro.getNome()+ " \nValor: "+livro.getValor()+
						" \nISBN: "+livro.getIsbn()+ " \nAutor: "+livro.getAutor();
			}
		}
		System.out.println(listaDeLivros);
	}

	public List<Livro> getLivros(){
		return livros;
	}
	
	public List<LivroFisico> getLivrosFisicos() {
		return livrosFisicos;
	}

	public void setLivrosFisicos(List<LivroFisico> livrosFisicos) {
		this.livrosFisicos = livrosFisicos;
	}

	public List<LivroDigital> getLivrosDigitais() {
		return livrosDigitais;
	}

	public void setLivrosDigitais(List<LivroDigital> livrosDigitais) {
		this.livrosDigitais = livrosDigitais;
	}

	public SLivros getsLivros() {
		return sLivros;
	}

	public void setsLivros(SLivros sLivros) {
		this.sLivros = sLivros;
	}
}