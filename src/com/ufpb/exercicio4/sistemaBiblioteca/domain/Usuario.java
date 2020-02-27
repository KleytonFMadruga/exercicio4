package com.ufpb.exercicio4.sistemaBiblioteca.domain;

import java.util.Collection;

import com.ufpb.exercicio4.sistemaBiblioteca.enums.TipoUsuario;

public class Usuario {
	private String matricula;
	private String nome;
	private Collection<Livro> livrosEmprestados;
	private TipoUsuario tipo;
	
	public Usuario(String matricula, String nome, TipoUsuario tipo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.tipo = tipo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public TipoUsuario getTipo() {
		return tipo;
	}
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	public Collection<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}
	public void setLivrosEmprestados(Collection<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	
	
	

}
