package com.ty.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.one_to_one.dto.Address;
import com.ty.one_to_one.dto.Branch;

public class BranchTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bharath");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 1);
		Address address = branch.getAddress();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BRANCH NAME IS: "+branch.getName());
		System.out.println("BRANCH PHONE NUMBER IS: "+branch.getPhone_number());
		System.out.println("BRANCH AREA IS: "+address.getArea());
		System.out.println("BRANCH PINCODE IS: "+address.getPin());
		System.out.println("BRANCH STATE IS: "+address.getState());
		System.out.println("-------------------------------------------------------------------");
		
//		EntityTransaction entityTransaction =entityManager.getTransaction();
//		entityTransaction.begin();
//		entityManager.persist(branch);
//		entityManager.persist(address);
//		entityTransaction.commit();
	}
}
