package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nombresquizz database table.
 * 
 */
@Entity
@NamedQuery(name="Nombresquizz.findAll", query="SELECT n FROM Nombresquizz n")
public class Nombresquizz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bloqueQuizz;

	private String nombreQuizz;
	

	public Nombresquizz(int bloqueQuizz, String nombreQuizz) {
		super();
		this.bloqueQuizz = bloqueQuizz;
		this.nombreQuizz = nombreQuizz;
	}

	public Nombresquizz() {
	}

	public int getBloqueQuizz() {
		return this.bloqueQuizz;
	}

	public void setBloqueQuizz(int bloqueQuizz) {
		this.bloqueQuizz = bloqueQuizz;
	}

	public String getNombreQuizz() {
		return this.nombreQuizz;
	}

	public void setNombreQuizz(String nombreQuizz) {
		this.nombreQuizz = nombreQuizz;
	}

}