package br.com.aula.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.aula.model.Filme;

public class GerenciarFilmes {
	
	public static List<Filme> filmes = new ArrayList<Filme>();
	
	public static void addFilme(Filme filme) {
		if(filme != null) {
			filmes.add(filme);
		}
	}
	
	public static List<Filme> getFilmes(){
		return Collections.unmodifiableList(filmes);
	}

}
