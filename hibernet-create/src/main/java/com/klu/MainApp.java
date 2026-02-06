package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//Load configuration & Create the SessionFactory
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//open session
		Session session=factory.openSession();
		
		//Begin Transcation
		Transaction tx=session.beginTransaction();
		
		//create the table/object
		Student s=new Student("Ravi");
		
		//save the data/odject
		session.save(s);
		
		//commit
		tx.commit();
		//close the connection
		session.close();
		factory.close();
		
		System.out.println("student data inserted sucessfully");
	}

}
