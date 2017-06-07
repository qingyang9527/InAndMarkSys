package com.hm.InAndMarkSys.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hm.InAndMarkSys.dao.AdminDao;
import com.hm.InAndMarkSys.model.Admin;

public class AdminDaoImp extends BaseDao implements AdminDao {

	public Admin loginByAdmin(String username, String password) {
		String hql = "from Admin a where a.username=? and a.password=?";
		Session session = getSession();
		Query query = session.createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		List<Admin> list = query.list();
		if (list.size() > 0) {
			Admin admin = list.get(0);
			return admin;
		}
		session.close();
		return null;

	}

	public void saveAdmin(Admin admin) {
		Session session = getSession();
		Transaction tx = session.beginTransaction();
		session.save(admin);
		tx.commit();
		session.close();
	}
	

	@Override
	public List rand() {
		List<Admin> list = new ArrayList<Admin>();
		Session session = getSession();
		// Query
		// query=session.createSQLQuery("SELECT * FROM admin ORDER BY RAND() LIMIT 2").addEntity(Admin.class);
		Query query = session.createQuery("from Admin");
		query.setFirstResult(0);
		query.setMaxResults(5);
		list = query.list();
		for (Admin admin : list) {
			System.out.println(admin.getUsername() + "_" + admin.getId() + "_"
					+ admin.getPassword());
		}
		return list;
	}

}
