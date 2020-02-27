package com.ufpb.exercicio4.sistemaBiblioteca.domain;

import java.util.List;
import java.util.Map;

import com.ufpb.exercicio4.sistemaBiblioteca.enums.TipoUsuario;
import com.ufpb.exercicio4.sistemaBiblioteca.interfaces.SistemaBiblioteca;

public class SistemaBibliotecaCCAE implements SistemaBiblioteca{
	
	private Map<String, Livro> livros;
	private Map<String, Usuario> usuarios;

	//GETS E SETTERS
	public Map<String, Livro> getLivros() {
		return livros;
	}

	public void setLivros(Map<String, Livro> livros) {
		this.livros = livros;
	}

	public Map<String, Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Map<String, Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	

	//MÉTODOS
	@Override
	public boolean pegarLivro(String matricula, String idLivro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean devolverLivro(String matricula, String idLivro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cadastrarUsuario(String matricula, String nome, TipoUsuario tipo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void cadastrarLivro(String id, String titulo, List<String> autores) {
		// TODO Auto-generated method stub
		
	}

}
