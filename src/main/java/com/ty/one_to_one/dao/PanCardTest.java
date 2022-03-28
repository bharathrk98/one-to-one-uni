package com.ty.one_to_one.dao;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.PanCard;
import com.ty.one_to_one.dto.Person;

public class PanCardTest {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bharath");
		EntityManager em = emf.createEntityManager();
		
		PanCard pan = em.find(PanCard.class, 1);
		Person person = pan.getPerson();
		
		System.out.println("-------------------------------------------------------");
		System.out.println("PERSONE NAME: "+person.getName());
		System.out.println("PERSON PAN CARD NUMBER: "+pan.getPan_number());
		System.out.println("PERSON PAN CARD DATE: "+pan.getDate());
		System.out.println("PERSON COUNTRY: "+pan.getCountry());
		System.out.println("PERSON GENDER: "+person.getGender());
		System.out.println("-------------------------------------------------------");
//		EntityTransaction et = em.getTransaction();
//		et.begin();
//		em.persist(pan);
//		em.persist(person);
//		et.commit();
	}
}
