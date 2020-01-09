package com.deloitte.Emp.Employee.model;

import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class EmpManager {
	
		public static void main(String[] args) {
			SessionFactory sf=new Configuration()
					.configure()
					.addAnnotatedClass(Employee.class)
					.buildSessionFactory();
			
			Employee em=new Employee(101,"Sam",500);
			
			Session ssn=sf.openSession();
			Transaction tx=ssn.beginTransaction();
			ssn.save(em);
			
			tx.commit();
			ssn.close();
			

		}
	}



