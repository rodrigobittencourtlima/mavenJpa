package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Person p = em.find(Person.class, 2);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto!");

		em.close();
		emf.close();

//		Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
//		Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
//		Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
	}

}
