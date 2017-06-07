package com.hm.InAndMarkSys.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hm.InAndMarkSys.model.TbCg;

public class CgDaoImp extends BaseDao{
	
	public void select(){
		Session session=getSession();
		Query query=session.createQuery("from TbCg");
		List<TbCg> tbCg=query.list();
		for (TbCg tbCg2 : tbCg) {
			System.out.println(tbCg2.getId());
			System.out.println(tbCg2.getPurchaser());
			System.out.println(tbCg2.getPurchaseId());
			System.out.println(tbCg2.getInvoiceNumber());
		}
		session.close();
	}
	
	public void save(){
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		String sql="INSERT INTO tb_cg(PurchaseId,Purchaser,InvoiceNumber)VALUES(20160025,'qq',123421234)";
		Query query=session.createSQLQuery(sql);
		query.executeUpdate();
		transaction.commit();
		session.close();
		System.out.println("Ìí¼Ó³É¹¦");
		
	}

}
