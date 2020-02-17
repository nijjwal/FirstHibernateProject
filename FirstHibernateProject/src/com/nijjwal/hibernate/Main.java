package com.nijjwal.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		// Create an object of the Model class
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Nijjwal");

		// Step 1: Read all the data from Hibernate configuraiton file
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();

		// Step 2: Open a connection to a database
		Session session = sessionFactory.openSession();

		// Step 3: Need logical transaction for Insert, Update and Delete
		// operations.
		session.beginTransaction();

		// Step 4: Save the object and commit the transaction
		session.save(emp);
		session.getTransaction().commit();

		// Step 5: Close session object and sessionFactory object
		session.close();
		sessionFactory.close();

	}

}
