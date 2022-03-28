package com.ty.one_to_one.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MobileTest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Bharath");
	}
}
