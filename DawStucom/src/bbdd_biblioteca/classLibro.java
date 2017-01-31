package bbdd_biblioteca;

public class classLibro {
	private int codigo;
	private String titulo;
	private int autor;
	private String isbn;
	private int numero_paginas;
	private String genero;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAutor() {
		return autor;
	}
	public void setAutor(int autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getNumero_paginas() {
		return numero_paginas;
	}
	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
