package edu.snnu.carrent.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import edu.snnu.carrent.model.Order;
import edu.snnu.carrent.model.User;

public class Methods {

	private static SessionFactory sessionFactory = new Configuration()//
			.configure()//
			.buildSessionFactory();

	public void Save(User user, Order order) {
		Session session = sessionFactory.openSession();

		try {
			Transaction tx = session.beginTransaction(); // ��ʼ����
			order.setUser(user);
			user.getOrders().add(order);
			session.save(user);
			session.save(order);
			tx.commit(); // �ύ����
		} catch (RuntimeException e) {
			session.getTransaction().rollback(); // �ع�����
			throw e;
		} finally {
			session.close(); // �ر�Session
		}
	}

	public User getById(int id) {
		Session session = sessionFactory.openSession();

		try {
			Transaction tx = session.beginTransaction(); // ��ʼ����
			User user = (User) session.get(User.class, 1);
			tx.commit(); // �ύ����
			return user;
		} catch (RuntimeException e) {
			session.getTransaction().rollback(); // �ع�����
			throw e;
		} finally {
			session.close(); // �ر�Session
		}
	}
}