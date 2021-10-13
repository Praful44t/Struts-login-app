package com.example.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import com.example.bean.User;
import com.example.util.SessionFactoryUtil;

public class UserDAO {
	private SessionFactory sf;
	private Session session;
	
	public UserDAO(){
		sf = SessionFactoryUtil.StartSessionFactory();
	}
	
	public boolean validateUser(String mailid,String password) {

		Transaction transaction = null;
		User user = new User();
		try  {
			session = sf.openSession();
			transaction = session.beginTransaction();
			
			String hql = "FROM User U WHERE U.mailid = :mailid and U.password = :password";
			Query query = session.createQuery(hql);
			query.setParameter("mailid", mailid);
			query.setParameter("password", password);
			List<?> results = query.getResultList();
			
			if (results != null && !results.isEmpty()) {
				user = (User) results.get(0);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		if(mailid.equals(user.getMailid()) && password.equals(user.getPassword()))
			return true;
		else return false;
	}
	
	public User searchUser(String mailid,String password) {
		Transaction transaction = null;
		User user = new User();
		try  {
			session = sf.openSession();
			transaction = session.beginTransaction();
			
			String hql = "FROM User U WHERE U.mailid = :mailid and U.password = :password";
			Query query = session.createQuery(hql);
			query.setParameter("mailid", mailid);
			query.setParameter("password", password);
			List<?> results = query.getResultList();
			
			if (results != null && !results.isEmpty()) {
				user = (User) results.get(0);
			}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return user;
	}
	
	public boolean addUser(User user) {
		boolean status = false;
		Transaction transaction = null;
		
		try {
		session = sf.openSession();	
		transaction = session.beginTransaction();
		session.save(user);
		
		transaction.commit();
		status = (session.getTransaction().getStatus() == TransactionStatus.COMMITTED);
		}
		catch(Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return status;
	}
}
