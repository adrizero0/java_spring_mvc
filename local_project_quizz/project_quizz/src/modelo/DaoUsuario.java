package modelo;

import java.util.List;

import entidades.User;

public interface DaoUsuario {

	//REGISTROS	
	User autenticarUser(String email, String password);
	void altaUser(User user);
	
	List<User> obtenerUsuarios();
	
	void eliminarUsuario(int idUser);
	
	void actualizarPuntos(int idUser, int points);

}
