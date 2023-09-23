package onetoonebidrectione2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebidrectione2.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	
	public void updatePerson(int id,Person person) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null) {
			entityTransaction.begin();
			person.setId(id);
			entityManager.merge(person);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	public void findPersonById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null) {
			System.out.println(dbPerson);
		}else {
			System.out.println("id is not present");
		}
	}
	public void deletePersonById(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Person dbPerson=entityManager.find(Person.class, id);
		if(dbPerson!=null) {
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbPerson);
			entityTransaction.commit();
		}else {
			System.out.println("id is not present");
		}
	}
	
	
	
}
