package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resultadosquizz database table.
 * 
 */
@Entity
@NamedQuery(name="Resultadosquizz.findAll", query="SELECT r FROM Resultadosquizz r")
public class Resultadosquizz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idResultado;

	private int bloqueQuizz;

	private String resultado;

	private String texto;

	private int valorAlto;

	private int valorBajo;
	
	

	public Resultadosquizz(int idResultado, int bloqueQuizz, String resultado, String texto, int valorAlto,
			int valorBajo) {
		super();
		this.idResultado = idResultado;
		this.bloqueQuizz = bloqueQuizz;
		this.resultado = resultado;
		this.texto = texto;
		this.valorAlto = valorAlto;
		this.valorBajo = valorBajo;
	}

	public Resultadosquizz() {
	}

	public int getIdResultado() {
		return this.idResultado;
	}

	public void setIdResultado(int idResultado) {
		this.idResultado = idResultado;
	}

	public int getBloqueQuizz() {
		return this.bloqueQuizz;
	}

	public void setBloqueQuizz(int bloqueQuizz) {
		this.bloqueQuizz = bloqueQuizz;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getValorAlto() {
		return this.valorAlto;
	}

	public void setValorAlto(int valorAlto) {
		this.valorAlto = valorAlto;
	}

	public int getValorBajo() {
		return this.valorBajo;
	}

	public void setValorBajo(int valorBajo) {
		this.valorBajo = valorBajo;
	}

}