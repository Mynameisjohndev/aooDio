package br.com.dio.desafio;

public class Curso {
	private String titulo;
	private String descricao;
	private int cargaHoraria;

	public Curso() {
		
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + 
				", descricao=" + descricao + 
				", cargaHoraria=" + cargaHoraria + "]";
	}

	
	
}
