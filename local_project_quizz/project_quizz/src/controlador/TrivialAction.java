package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Nombrestrivial;
import entidades.Trivial;
import entidades.User;
import modelo.DaoTrivial;
import modelo.DaoUsuario;

@Controller
public class TrivialAction {
	@Autowired
	DaoTrivial dt;
	
	@Autowired
	DaoUsuario du;
	
	@GetMapping(value="doMenuTrivial")
	public String menuTriviales(HttpServletRequest request) {
		List<Nombrestrivial> Nombrestrivial=new ArrayList<>();
		Nombrestrivial= dt.getTrivias();
		request.setAttribute("nombrestrivial", Nombrestrivial);		
		return "menutrivial";
	}

	@GetMapping(value="doPrepararTrivial")
	public String prepararQuizzes(HttpServletRequest request, @RequestParam("bloqueTrivial") int bloqueTrivial) {
		

		Nombrestrivial nombreTrivial=dt.buscarNombreTrivial(bloqueTrivial);
		String nombreT=nombreTrivial.getNombreTrivial();
		request.setAttribute("nombreT", nombreT);
		
		List<Trivial> trivias=new ArrayList<>();
		trivias= dt.trivias(bloqueTrivial);
		request.setAttribute("trivias", trivias);
		
		return "trivial";
	}
	
	@RequestMapping(value="doValidarTrivial")
	public String calcularResultado(HttpServletRequest request, HttpSession s,
									@RequestParam("inf0") String inf1,@RequestParam("inf1") String inf2,
									@RequestParam("inf2") String inf3, @RequestParam("inf3") String inf4,
									@RequestParam("inf4") String inf5, @RequestParam("inf5") String inf6,
									@RequestParam("inf6") String inf7, @RequestParam("inf7") String inf8,
									@RequestParam("inf8") String inf9, @RequestParam("inf9") String inf10) {	
		int res=0;
		
		res=res+(dt.switchTrivial(inf1));
		res=res+(dt.switchTrivial(inf2));
		res=res+(dt.switchTrivial(inf3));
		res=res+(dt.switchTrivial(inf4));
		res=res+(dt.switchTrivial(inf5));
		res=res+(dt.switchTrivial(inf6));
		res=res+(dt.switchTrivial(inf7));
		res=res+(dt.switchTrivial(inf8));
		res=res+(dt.switchTrivial(inf9));
		res=res+(dt.switchTrivial(inf10));
		
		String resultadoTrivial= dt.resultadosTrivial(res);
		
		request.setAttribute("resultadoTrivial", resultadoTrivial);
		request.setAttribute("puntos", res);
		
		User usuario=(User)s.getAttribute("usuario");
		int idUser=usuario.getIdUser();		
		du.actualizarPuntos(idUser, res);		
		
		return "resultadotrivial";
	}
	
	
	
	
	
	
	
	
	
	
}
