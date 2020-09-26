package com.vti.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.vti.entity.Department;

public class CRUDUtils {

	private static CRUDUtils instance;

	private Configuration configuration;
	private SessionFactory sessionFactory;

	public static CRUDUtils getInstance() {
		if (null == instance) {
			instance = new CRUDUtils();
		}
		return instance;
	}
	
	//configure() method 
	private CRUDUtils() {
		configure();
	}
	private void configure() {
		// load configuration
		configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		// add entity
		configuration.addAnnotatedClass(Department.class);
	}
	//buildSessionFactory() method
	private SessionFactory buildSessionFactory() {
		if (null == sessionFactory || sessionFactory.isClosed()) {
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		}

		return sessionFactory;
	}
	
	//closeFactory() method
	public void closeFactory() {
		if (null != sessionFactory && sessionFactory.isOpen()) {
			sessionFactory.close();
		}
	}
	//openSession() method
	public Session openSession() {
		buildSessionFactory();
		return sessionFactory.openSession();
	}

}
