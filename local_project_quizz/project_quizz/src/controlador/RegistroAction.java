package controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.User;

import modelo.DaoUsuario;

@Controller
public class RegistroAction {
	@Autowired
	DaoUsuario daoUsuario;

	@RequestMapping(value="doPrepararRegistro")
	public String prepararAlta(HttpServletRequest request, Model mo) {
		User u = new User();
		mo.addAttribute("user", u);
		return "registro";
	}
	
	@PostMapping(value="doRegistar")
	public String altaUser(@ModelAttribute("user") User user) {
		daoUsuario.altaUser(user);
		return "menu";

	}

}
