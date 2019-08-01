package modelo;

import java.util.List;

import entidades.Nombresquizz;
import entidades.Quizz;
import entidades.Resultadosquizz;

public interface DaoQuizz {

	List<Nombresquizz> getQuizzes();

	Nombresquizz buscarNombreQuizz(int bloqueQuizz);

	List<Quizz> quizzes(int bloqueQuizz);

	int calcularResultadoQuizzA(int idQuizz);

	int calcularResultadoQuizzB(int idQuizz);

	int calcularResultadoQuizzC(int idQuizz);

	int calcularResultadoQuizzD(int idQuizz);
	
	List<Resultadosquizz> resultadosQuizz(int bloqueQuizz, int res);
	
	int switchQuizz(String inf);

}