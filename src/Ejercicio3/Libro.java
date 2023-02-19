package Ejercicio3;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private long isbn;
	private String autor;
	private int anoPublicacion;
	
	ArrayList <Pagina>paginas = new ArrayList<Pagina>();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAñoPublicacion() {
		return anoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.anoPublicacion = añoPublicacion;
	}

	
	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(ArrayList<Pagina> paginas) {
		this.paginas = paginas;
	}

	public Libro (String titulo, long isbn, String autor, int anoPublicacion) {
		this.titulo=titulo;
		this.isbn=isbn;
		this.autor=autor;
		this.anoPublicacion=anoPublicacion;
	}
	
	
}
