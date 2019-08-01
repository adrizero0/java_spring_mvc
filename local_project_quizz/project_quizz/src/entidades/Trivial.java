package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the trivial database table.
 * 
 */
@Entity
@NamedQuery(name="Trivial.findAll", query="SELECT t FROM Trivial t")
public class Trivial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTrivial;

	private int bloqueTrivial;

	private String textoTrivial;
	
	private String respA;

	private String respB;

	private String respC;

	private String respD;

	private int valueA;

	private int valueB;

	private int valueC;

	private int valueD;
	
	

	public Trivial(int idTrivial, int bloqueTrivial, String textoTrivial, 
					String respA, String respB, String respC, String respD, 
					int valueA, int valueB, int valueC, int valueD) {
		super();
		this.idTrivial = idTrivial;
		this.bloqueTrivial = bloqueTrivial;
		this.textoTrivial = textoTrivial;
		this.respA = respA;
		this.respB = respB;
		this.respC = respC;
		this.respD = respD;
		this.valueA = valueA;
		this.valueB = valueB;
		this.valueC = valueC;
		this.valueD = valueD;
		
	}

	public Trivial() {
	}

	public int getIdTrivial() {
		return this.idTrivial;
	}

	public void setIdTrivial(int idTrivial) {
		this.idTrivial = idTrivial;
	}

	public int getBloqueTrivial() {
		return this.bloqueTrivial;
	}

	public void setBloqueTrivial(int bloqueTrivial) {
		this.bloqueTrivial = bloqueTrivial;
	}

	public String getTextoTrivial() {
		return this.textoTrivial;
	}

	public void setTextoTrivial(String textoTrivial) {
		this.textoTrivial = textoTrivial;
	}
	
	public String getRespA() {
		return this.respA;
	}

	public void setRespA(String respA) {
		this.respA = respA;
	}

	public String getRespB() {
		return this.respB;
	}

	public void setRespB(String respB) {
		this.respB = respB;
	}

	public String getRespC() {
		return this.respC;
	}

	public void setRespC(String respC) {
		this.respC = respC;
	}

	public String getRespD() {
		return this.respD;
	}

	public void setRespD(String respD) {
		this.respD = respD;
	}

	public int getValueA() {
		return this.valueA;
	}

	public void setValueA(int valueA) {
		this.valueA = valueA;
	}

	public int getValueB() {
		return this.valueB;
	}

	public void setValueB(int valueB) {
		this.valueB = valueB;
	}

	public int getValueC() {
		return this.valueC;
	}

	public void setValueC(int valueC) {
		this.valueC = valueC;
	}

	public int getValueD() {
		return this.valueD;
	}

	public void setValueD(int valueD) {
		this.valueD = valueD;
	}

}