package com.hm.InAndMarkSys.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.InAndMarkSys.dao.RuKuDao;
import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbRuku;

public class RuKuDaoImp extends BaseDao implements RuKuDao {


	@Override
	public void save(TbRuku ruku) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.save(ruku);
		transaction.commit();
		session.close();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("delete from TbRuku t where t.id=?");
		query.setParameter(0, id);
		query.executeUpdate();
		transaction.commit();
		session.close();
	}

	@Override
	public void update(TbRuku ruku) {
		// TODO Auto-generated method stub
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		session.update(ruku);
		transaction.commit();
		session.close();
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		Session session=getSession();
		//Query query=session.createQuery("from TbRuku");
		Query query=session.createSQLQuery("SELECT *from tb_ruku").addEntity(TbRuku.class);
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
		String hql="from TbRuku t where t.id=?";
		Query query=session.createQuery(hql);
		query.setParameter(0,id);
		List<TbGys> gysList=query.list();
		session.close();
		return gysList;
	}

	@Override
	public int getTotalSize() {
		Session session=getSession();
		String hql="from TbRuku";
		Query query=session.createQuery(hql);
		List gysList=query.list();
		int totalSize=gysList.size();
		session.close();
		return totalSize;
	}

}
