package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import entidades.Nombresquizz;
import entidades.Nombrestrivial;
import entidades.Quizz;
import entidades.Trivial;

@Repository(value="DaoTrivial")
public class DaoTrivialImpl implements DaoTrivial {
	@PersistenceContext(unitName="yipiPU")
	EntityManager em;
	
	@Override
	public List<Nombrestrivial> getTrivias() {
		String jpql="select nt from Nombrestrivial nt";
		Query qr=em.createQuery(jpql);
		return (List<Nombrestrivial>)qr.getResultList();		
	}

	@Override
	public Nombrestrivial buscarNombreTrivial(int bloqueTrivial) {
		return em.find(Nombrestrivial.class, bloqueTrivial);
	}

	@Override
	public List<Trivial> trivias(int bloqueTrivial) {
		String jpql="select t from Trivial t where t.bloqueTrivial=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, bloqueTrivial);
		return (List<Trivial>)qr.getResultList();
	}

	@Override
	public int calcularResultadoTrivialA(int idTrivial) {
		String jpql="SELECT valueA FROM Trivial t WHERE t.idTrivial=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idTrivial);
		int a=(Integer)qr.getSingleResult();
		return a;
	}

	@Override
	public int calcularResultadoTrivialB(int idTrivial) {
		String jpql="SELECT valueB FROM Trivial t WHERE t.idTrivial=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idTrivial);
		int a=(Integer)qr.getSingleResult();
		return a;
	}

	@Override
	public int calcularResultadoTrivialC(int idTrivial) {
		String jpql="SELECT valueC FROM Trivial t WHERE t.idTrivial=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idTrivial);
		int a=(Integer)qr.getSingleResult();
		return a;
	}

	@Override
	public int calcularResultadoTrivialD(int idTrivial) {
		String jpql="SELECT valueD FROM Trivial t WHERE t.idTrivial=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idTrivial);
		int a=(Integer)qr.getSingleResult();
		return a;
	}

	@Override
	public String resultadosTrivial(int res) {
		String resultado=null;
		switch(res) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: 
				resultado= "Que chorrada, no le has puesto mucho empeño. ¡Intenta de nuevo con más ganas!";
				break;
			case 6:
			case 7:
				resultado= "Aún no sabes mucho sobre el tema, inténtalo de nuevo ¡ánimo!";
				break;
			case 8:
			case 9:
				resultado= "¡Estás súper cerca de la meta! venga, un intento más para ser un CRACK";
				break;
			case 10:
				resultado= "¡Estupendo! Eres un completo CRACK en la materia";
				break;		
		}
		return resultado;
	}
	
	@Override
	public int switchTrivial(String inf){
		String value=inf.split("[-]")[0];
		int idTrivial=Integer.parseInt(inf.split("[-]")[1]);
		int res=0;
			switch (value) {
				case "valueA":
					int valorA=calcularResultadoTrivialA(idTrivial);
					res= valorA;
					break;
				case "valueB":
					int valorB=calcularResultadoTrivialB(idTrivial);
					res= valorB;
					break;
				case "valueC":
					int valorC=calcularResultadoTrivialC(idTrivial);
					res= valorC;
					break;
				case "valueD":
					int valorD=calcularResultadoTrivialD(idTrivial);
					res= valorD;
					break;
			} return res;		
	}

}
