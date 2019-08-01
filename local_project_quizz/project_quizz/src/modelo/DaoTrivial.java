package modelo;

import java.util.List;

import entidades.Nombrestrivial;
import entidades.Trivial;

public interface DaoTrivial {
	
	List<Nombrestrivial> getTrivias();

	Nombrestrivial buscarNombreTrivial(int bloqueTrivial);

	List<Trivial> trivias(int bloqueTrivial);

	int calcularResultadoTrivialA(int idTrivial);

	int calcularResultadoTrivialB(int idTrivial);

	int calcularResultadoTrivialC(int idTrivial);

	int calcularResultadoTrivialD(int idTrivial);
	
	String resultadosTrivial(int res);
	
	int switchTrivial(String inf);

}
