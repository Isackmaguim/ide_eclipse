package br.com.aula.model;

public class Filme {
	
	private static int id;
	private String titulo;
	private int duracao;
	private String faixaEtaria;

	public Filme() {
		this.id += 1;
	}

	public Filme(String titulo, int duracao, String faixaEtaria) {
		this.id += 1;
		this.titulo = titulo;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

}
