package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;

	private String apellidos;

	private int avatar;

	private int edad;

	private String email;

	private String nick;

	private String nombre;

	private String password;

	private int points;

	private String rolName;

	private int rolValue;
	
	public User(int idUser, String apellidos, int avatar, int edad, String email, String nick, String nombre,
			String password, int points, String rolName, int rolValue) {
		super();
		this.idUser = idUser;
		this.apellidos = apellidos;
		this.avatar = avatar;
		this.edad = edad;
		this.email = email;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.points = points;
		this.rolName = rolName;
		this.rolValue = rolValue;
	}

	public User() {
	}

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getAvatar() {
		return this.avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getRolName() {
		return this.rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public int getRolValue() {
		return this.rolValue;
	}

	public void setRolValue(int rolValue) {
		this.rolValue = rolValue;
	}

}