package controlador;

import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.User;
import modelo.DaoUsuario;

@Controller
public class UsuarioAction {
	@Autowired
	DaoUsuario daoUsuario;	
	
	@RequestMapping(value="doLogin")
	public String autenticarUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession s,HttpServletRequest request) {
	//	User user= daoUsuario.autenticarUser(email,password);
		User user= null;
		try {
			user= daoUsuario.autenticarUser(email,password);
		}catch (NoResultException nre){
			
			return "menu";			
		}
	
		if(user!=null) {
			s.setAttribute("user", user);
			int rolValue=user.getRolValue();
				if(rolValue==1) {
					s.setAttribute("usuario", user);
					request.setAttribute("nick", user.getNick());
					return "usuario";
				}else if(rolValue==3){
					return "forward:/doRecuperar";
				}			
		}return "menu";
	}
	
	@RequestMapping(value="doRecuperar")
	public String recuperarUsuarios(HttpServletRequest request) {
		List<User> usuarios=daoUsuario.obtenerUsuarios();
		request.setAttribute("usuarios", usuarios);
		return "admin";
	}
	
	@RequestMapping(value="doEliminar")
	public String eliminar(@RequestParam("idUser") int idUser) {
		daoUsuario.eliminarUsuario(idUser);
		return "forward:/doRecuperar";
	}
	
	@RequestMapping(value="doRegresar")
	public String regresar(HttpSession s,HttpServletRequest request) {
		User usuario=(User)s.getAttribute("usuario");
		request.setAttribute("nick", usuario.getNick());
		return "usuario";
	}
	
	@GetMapping(value="doDesconectar")
	public String desconectar(HttpSession s) {
		s.invalidate();
		return "menu";
	}
	
}

