package modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import entidades.Nombresquizz;
import entidades.Quizz;
import entidades.Resultadosquizz;

@Repository(value="DaoQuizzes")
public class DaoQuizzImpl implements DaoQuizz {
	@PersistenceContext(unitName="yipiPU")
	EntityManager em;
	
	@Override
	public List<Nombresquizz> getQuizzes() {
		String jpql="select nq from Nombresquizz nq";
		Query qr=em.createQuery(jpql);
		return (List<Nombresquizz>)qr.getResultList();
	}

	@Override
	public Nombresquizz buscarNombreQuizz(int bloqueQuizz) {
		return em.find(Nombresquizz.class, bloqueQuizz);
	}

	@Override
	public List<Quizz> quizzes(int bloqueQuizz) {
		String jpql="select q from Quizz q where q.bloqueQuizz=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, bloqueQuizz);
		return (List<Quizz>)qr.getResultList();
	}	
	
	
	@Override
	public int calcularResultadoQuizzA(int idQuizz) {
		String jpql="SELECT valueA FROM Quizz q WHERE q.idQuizz=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idQuizz);
		int a=(Integer)qr.getSingleResult();
		return a;
	}

	@Override
	public int calcularResultadoQuizzB(int idQuizz) {
		String jpql="SELECT valueB FROM Quizz q WHERE q.idQuizz=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idQuizz);
		int b=(Integer)qr.getSingleResult();
		return b;
		}
	
	@Override
	public int calcularResultadoQuizzC(int idQuizz) {
		String jpql="SELECT valueC FROM Quizz q WHERE q.idQuizz=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idQuizz);
		int c=(Integer)qr.getSingleResult();
		return c;
		}
	
	@Override
	public int calcularResultadoQuizzD(int idQuizz) {
		String jpql="SELECT valueD FROM Quizz q WHERE q.idQuizz=?1";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, idQuizz);
		int d=(Integer)qr.getSingleResult();
		return d;
		}
	
	@Override
	public List<Resultadosquizz> resultadosQuizz(int bloqueQuizz, int res) {		
		String jpql="SELECT rq FROM Resultadosquizz rq WHERE rq.bloqueQuizz=?1 AND ?2< rq.valorAlto AND ?3> rq.valorBajo";
		Query qr=em.createQuery(jpql);
		qr.setParameter(1, bloqueQuizz);
		qr.setParameter(2, res);
		qr.setParameter(3, res);
		
		return (List<Resultadosquizz>)qr.getResultList();
	}
	
	@Override
	public int switchQuizz(String inf){
		String value=inf.split("[-]")[0];
		int idQuizz=Integer.parseInt(inf.split("[-]")[1]);
		int res=0;
			switch (value) {
				case "valueA":
					int valorA=calcularResultadoQuizzA(idQuizz);
					res= valorA;
					break;
				case "valueB":
					int valorB=calcularResultadoQuizzB(idQuizz);
					res= valorB;
					break;
				case "valueC":
					int valorC=calcularResultadoQuizzC(idQuizz);
					res= valorC;
					break;
				case "valueD":
					int valorD=calcularResultadoQuizzD(idQuizz);
					res= valorD;
					break;
			} return res;		
	}	

}
