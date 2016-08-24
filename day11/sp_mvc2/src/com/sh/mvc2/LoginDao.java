package com.sh.mvc2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class LoginDao {
	@Autowired
	private SessionFactory sessionFactory;

	public LoginModel findLogin(String username) {
		Session session = sessionFactory.getCurrentSession();
		LoginModel lm = (LoginModel) session.get(LoginModel.class, username);
		return lm;
	}
}
