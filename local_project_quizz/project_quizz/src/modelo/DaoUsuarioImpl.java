package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import entidades.User;

@Repository("DaoUsuario")
public class DaoUsuarioImpl implements DaoUsuario {

	@PersistenceContext(unitName = "yipiPU")
	EntityManager em;
	
	@Override
	public User autenticarUser(String email, String password) {
		User user=null;
		String jpql="SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, email);
		qr.setParameter(2, password);
		user= (User)qr.getSingleResult();
		return user;
	}

	@Transactional
	@Override
	public void altaUser(User user) {
		em.persist(user);
	}
	
	@Override
	public List<User> obtenerUsuarios() {
		String jpql="select u From User u";
		Query query=em.createQuery(jpql);
		return (List<User> )query.getResultList();
	}
	
	@Transactional
	@Override
	public void eliminarUsuario(int idUser) {
		User usuario=em.find(User.class, idUser);
		if(usuario!=null) {
			em.remove(usuario);
		}
	}
	
	@Transactional
	@Override
	public void actualizarPuntos(int idUser, int points) {
		User u=em.find(User.class, idUser);
		u.setPoints(u.getPoints()+points);
		em.merge(u);
	}
	
}

