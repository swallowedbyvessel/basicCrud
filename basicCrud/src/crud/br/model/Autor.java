package crud.br.model;

import java.util.List;

public class Autor {
	private String nome;
	private String cpf;
	private String email;
	private List<Livro> quantidadeLivros;
	
	public Autor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Livro> getQuantidadeLivros() {
		return quantidadeLivros;
	}

	public void setQuantidadeLivros(List<Livro> quantidadeLivros) {
		this.quantidadeLivros = quantidadeLivros;
	}
	
}
