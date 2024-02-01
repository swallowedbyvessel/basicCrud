package com.br.model;

public class LivroFisico extends Livro {
	private double taxaImpressao;
	
	public LivroFisico() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getTaxaImpressao() {
		return taxaImpressao;
	}
	public void setTaxaImpressao(double taxaImpressao) {
		this.taxaImpressao = taxaImpressao;
	}
}