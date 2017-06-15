package com.hm.InAndMarkSys.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.InAndMarkSys.dao.CkDao;
import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.model.TbGys;

public class CkDaoImp extends BaseDao implements CkDao {


	@Override
	public void save(TbCk tbCk) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.save(tbCk);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("delete from TbCk t where t.ckid=?");
		query.setParameter(0, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}

	@Override
	public void update(TbCk	tbCk) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(tbCk);
		transaction.commit();
		session.close();
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		Session session=getSession();
		Query query=session.createQuery("from TbCk");
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
		String hql="from TbCk t where t.ckid=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<TbGys> gysList=query.list();
		session.close();
		return gysList;
	}

	@Override
	public int getTotalSize() {
		Session session=getSession();
		String hql="from TbCk";
		Query query=session.createQuery(hql);
		List gysList=query.list();
		int totalSize=gysList.size();
		session.close();
		return totalSize;
	}

}
