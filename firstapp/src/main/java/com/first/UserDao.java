package com.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao{
	private HibernateTemplate hibernateTemplate;
	@Autowired
	public int saveUser(User user) {
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
	}
}
