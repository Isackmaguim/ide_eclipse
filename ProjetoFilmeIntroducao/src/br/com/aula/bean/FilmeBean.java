package br.com.aula.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.aula.model.Filme;
import br.com.aula.util.GerenciarFilmes;

@Named
@RequestScoped
public class FilmeBean {
	
	private Filme filme;
	private List<Filme> filmes;

	@PostConstruct
	public void init() {
		filme = new Filme();
		filmes = GerenciarFilmes.getFilmes();
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String cadastrarFilme() {
		GerenciarFilmes.addFilme(filme);
		filme = new Filme();
		
		return "listarFilmes.xhtml?faces-redirect=true";
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

}
