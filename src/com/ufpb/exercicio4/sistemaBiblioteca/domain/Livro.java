package com.ufpb.exercicio4.sistemaBiblioteca.domain;

import java.util.List;

public class Livro {

	private String id;
	private String titulo;
	private boolean estaEmprestado;
	private List<String> autores;
	
	public Livro(String id, String titulo, boolean estaEmprestado, List<String> autores) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.estaEmprestado = estaEmprestado;
		this.autores = autores;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean getsEstaEmprestado() {
		return estaEmprestado;
	}

	public void setEstaEmprestado(boolean estaEmprestado) {
		this.estaEmprestado = estaEmprestado;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	
	
}
