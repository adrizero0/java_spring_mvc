package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the nombrestrivial database table.
 * 
 */
@Entity
@NamedQuery(name="Nombrestrivial.findAll", query="SELECT n FROM Nombrestrivial n")
public class Nombrestrivial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bloqueTrivial;

	private String nombreTrivial;	

	public Nombrestrivial(int bloqueTrivial, String nombreTrivial) {
		super();
		this.bloqueTrivial = bloqueTrivial;
		this.nombreTrivial = nombreTrivial;
	}

	public Nombrestrivial() {
	}

	public int getBloqueTrivial() {
		return this.bloqueTrivial;
	}

	public void setBloqueTrivial(int bloqueTrivial) {
		this.bloqueTrivial = bloqueTrivial;
	}

	public String getNombreTrivial() {
		return this.nombreTrivial;
	}

	public void setNombreTrivial(String nombreTrivial) {
		this.nombreTrivial = nombreTrivial;
	}

}