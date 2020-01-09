package com.deloitte.Emp.Employee.model;

import javax.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import org.hibernate.Transaction;

public class Manager{
	
		public static void main(String[] args) {
			SessionFactory sf=new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Product.class)
					.addAnnotatedClass(Seller.class)
					.buildSessionFactory();
			
			Seller seller =new Seller(501,"ABC",201536);
			Product product=new Product (101,"MOUSE",300,null);
			product.setSeller(seller);
			
			
			Session ssn=sf.openSession();
			Transaction tx=ssn.beginTransaction();
			ssn.save(seller);
			ssn.save(product);
			
			tx.commit();
			ssn.close();
			

		}
	}



