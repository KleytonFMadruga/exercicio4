package com.ufpb.exercicio4.sistemaBiblioteca.interfaces;

import java.util.List;

import com.ufpb.exercicio4.sistemaBiblioteca.enums.TipoUsuario;

public interface SistemaBiblioteca {

	public boolean pegarLivro(String matricula, String idLivro);
	public boolean devolverLivro(String matricula, String idLivro);
	public boolean cadastrarUsuario(String matricula, String nome, TipoUsuario tipo);
	public void    cadastrarLivro(String id, String titulo, List<String> autores); 
}
