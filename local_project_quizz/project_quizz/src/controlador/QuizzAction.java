package controlador;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Nombresquizz;
import entidades.Quizz;
import entidades.Resultadosquizz;
import modelo.DaoQuizz;

@Controller
public class QuizzAction {
	@Autowired
	DaoQuizz dq;
	
	@GetMapping(value="doMenuQuizz")
	public String menuQuizzes(HttpServletRequest request) {
		List<Nombresquizz> Nombresquizz=new ArrayList<>();
		Nombresquizz= dq.getQuizzes();
		request.setAttribute("nombresquizz", Nombresquizz);		
		return "menuquizz";
	}
	
	
	@GetMapping(value="doPrepararQuizz")
	public String prepararQuizzes(HttpServletRequest request, @RequestParam("bloqueQuizz") int bloqueQuizz) {
		

		Nombresquizz nombreQuizz=dq.buscarNombreQuizz(bloqueQuizz);
		String nombreQ=nombreQuizz.getNombreQuizz();
		request.setAttribute("nombreQ", nombreQ);
		
		List<Quizz> quizzes=new ArrayList<>();
		quizzes= dq.quizzes(bloqueQuizz);
		request.setAttribute("quizzes", quizzes);
		
		return "quizz";
	}
	
	@RequestMapping(value="doValidarQuizz")
	public String calcularResultado(HttpServletRequest request,@RequestParam("inf0") String inf1,@RequestParam("inf1") String inf2,
																@RequestParam("inf2") String inf3, @RequestParam("inf3") String inf4,
																@RequestParam("inf4") String inf5, @RequestParam("inf5") String inf6,
																@RequestParam("inf6") String inf7, @RequestParam("inf7") String inf8,
																@RequestParam("inf8") String inf9, @RequestParam("inf9") String inf10) {
	
		int res=0;
		
		res=res+(dq.switchQuizz(inf1));
		res=res+(dq.switchQuizz(inf2));
		res=res+(dq.switchQuizz(inf3));
		res=res+(dq.switchQuizz(inf4));
		res=res+(dq.switchQuizz(inf5));
		res=res+(dq.switchQuizz(inf6));
		res=res+(dq.switchQuizz(inf7));
		res=res+(dq.switchQuizz(inf8));
		res=res+(dq.switchQuizz(inf9));
		res=res+(dq.switchQuizz(inf10));
		
		int bloqueQuizz=Integer.parseInt(inf1.split("[-]")[2]);
		int resProm=res/10;
		
		List<Resultadosquizz> resultadosQuizz=new ArrayList<>();
		resultadosQuizz= dq.resultadosQuizz(bloqueQuizz, resProm);
		
		request.setAttribute("resultadosQuizz", resultadosQuizz);
		
		System.out.println(" resultadosQuizz: "+resultadosQuizz);
		return "resultado";
	}

	
}
