package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the quizzes database table.
 * 
 */
@Entity
@Table(name="quizzes")
@NamedQuery(name="Quizze.findAll", query="SELECT q FROM Quizz q")
public class Quizz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idQuizz;

	private int bloqueQuizz;

	private String pregQuizz;

	private String respA;

	private String respB;

	private String respC;

	private String respD;

	private int valueA;

	private int valueB;

	private int valueC;

	private int valueD;
	
	

	public Quizz(int idQuizz, int bloqueQuizz, String pregQuizz, String respA, String respB, String respC, String respD,
			int valueA, int valueB, int valueC, int valueD) {
		super();
		this.idQuizz = idQuizz;
		this.bloqueQuizz = bloqueQuizz;
		this.pregQuizz = pregQuizz;
		this.respA = respA;
		this.respB = respB;
		this.respC = respC;
		this.respD = respD;
		this.valueA = valueA;
		this.valueB = valueB;
		this.valueC = valueC;
		this.valueD = valueD;
	}

	public Quizz() {
	}

	public int getIdQuizz() {
		return this.idQuizz;
	}

	public void setIdQuizz(int idQuizz) {
		this.idQuizz = idQuizz;
	}

	public int getBloqueQuizz() {
		return this.bloqueQuizz;
	}

	public void setBloqueQuizz(int bloqueQuizz) {
		this.bloqueQuizz = bloqueQuizz;
	}

	public String getPregQuizz() {
		return this.pregQuizz;
	}

	public void setPregQuizz(String pregQuizz) {
		this.pregQuizz = pregQuizz;
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