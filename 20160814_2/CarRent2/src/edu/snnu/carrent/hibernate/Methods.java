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
			Transaction tx = session.beginTransaction(); // 开始事务
			order.setUser(user);
			user.getOrders().add(order);
			session.save(user);
			session.save(order);
			tx.commit(); // 提交事务
		} catch (RuntimeException e) {
			session.getTransaction().rollback(); // 回滚事务
			throw e;
		} finally {
			session.close(); // 关闭Session
		}
	}

	public User getById(int id) {
		Session session = sessionFactory.openSession();

		try {
			Transaction tx = session.beginTransaction(); // 开始事务
			User user = (User) session.get(User.class, 1);
			tx.commit(); // 提交事务
			return user;
		} catch (RuntimeException e) {
			session.getTransaction().rollback(); // 回滚事务
			throw e;
		} finally {
			session.close(); // 关闭Session
		}
	}
}