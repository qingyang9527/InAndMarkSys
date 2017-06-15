package com.hm.InAndMarkSys.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hm.InAndMarkSys.dao.GysDao;
import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbWl;

public class GysDaoImp extends BaseDao implements GysDao {

	@Override
	public void save(TbGys tbGys) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.save(tbGys);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("delete from TbGys t where t.id=?");
		query.setParameter(0, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}

	@Override
	public void update(TbGys tbGys) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(tbGys);
		transaction.commit();
		session.close();
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		Session session=getSession();
		Query query=session.createQuery("from TbGys");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List gysList=query.list();
		session.close();
		return gysList;
	}

	@Override
	public List get(Integer id) {
		Session session=getSession();
		String hql="from TbGys t where t.id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<TbGys> gysList=query.list();
		session.close();
		return gysList;
	}

	@Override
	public int getTotalSize() {
		Session session=getSession();
		String hql="from TbGys";
		Query query=session.createQuery(hql);
		List gysList=query.list();
		int totalSize=gysList.size();
		session.close();
		return totalSize;
	}

	
}
