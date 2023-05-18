package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import entities.GaraDiAtletica;

public class GaraDiAtleticaDAO {
	private final EntityManager em;
	
	public GaraDiAtleticaDAO(EntityManager em) {
		this.em = em;
	}
	
	//metodo save
	public void save(GaraDiAtletica g) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();//partono le operazioni che voglio fare nel database
		em.persist(g);//salvera nel database cio che passo
		transaction.commit();//termina la transazione ed effettua il flush del oggetto
		System.out.println("Evento salvato");
	}
	
	//metodo getByid
	public GaraDiAtletica getById(long id) {
		GaraDiAtletica found = em.find(GaraDiAtletica.class, id);
		return found;
	}
	
	//metodo delete
	public void FindAndDelete(long id) {
		GaraDiAtletica found = em.find(GaraDiAtletica.class, id);
		if (found != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(found);
			transaction.commit();
			System.out.println("Evento con id " + id + " eliminato!");
		}else {
			System.out.println("id non trovato");
		}
	}
	
	//metodo refresh
	
	public void refresh(long id) {
		GaraDiAtletica found = em.find(GaraDiAtletica.class, id);
		found.setSetAtleti(null);
		System.out.println("PRE REFRESH");
		System.out.println(found);
		em.refresh(found);
		System.out.println("POST REFRESH");
		System.out.println(found);
	}
	
}

