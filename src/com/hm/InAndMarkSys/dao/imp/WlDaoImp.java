package com.hm.InAndMarkSys.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.InAndMarkSys.dao.WlDao;
import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbWl;

public class WlDaoImp extends BaseDao implements WlDao {

	@Override
	public void save(TbWl tbWl) {
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.merge(tbWl);
		transaction.commit();
		session.close();
	}

	@Override
	public List queryWlByPager(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Query query=session.createQuery("from TbWl");
		int startRow=(currentPage-1)*pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		List wls=query.list();
		session.close();
		return wls;
	}

	@Override
	public List getWlByWlId(String WlId) {
		// TODO Auto-generated method stub
		Session session=getSession();
		String hql="from TbWl t where t.wlid=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,WlId);
		List<TbWl> wl=query.list();
		session.close();
		return wl;
	}

	@Override
	public void delete(String WlId) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("delete from TbWl t where t.wlid=?");
		query.setParameter(0, WlId);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}

	@Override
	public void update(TbWl tbWl) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(tbWl);
		transaction.commit();
		session.close();
	}

	public int getTotalSize() {
		Session session=getSession();
		String hql="from TbWl";
		Query query=session.createQuery(hql);
		List wl=query.list();
		int totalSize=wl.size();
		session.close();
		return totalSize;
	}

	@Override
	public List queryGys() {
		Session session=getSession();
		Query query=session.createQuery("from TbGys");
		List gysList=query.list();
		session.close();
		return gysList;
		
	}

}
