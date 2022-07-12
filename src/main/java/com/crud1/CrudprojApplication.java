package com.crud1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudprojApplication.class, args);

//		student s=new student();
//		s.setRno(789);
//		s.setName("jITHENDRA");
//		s.setDep("CSE");
//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		em.persist(s);
//		em.getTransaction().commit();
//		System.out.println(s.toString());
//		
	}

}


