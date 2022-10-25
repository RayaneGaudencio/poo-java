package br.com.unit.associacao;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	private Editora editora;
	private Genero genero;
	
	public Livro(int idLivro, String titulo, String ISBN, int numeroPaginas, Editora editora, Genero genero) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}
