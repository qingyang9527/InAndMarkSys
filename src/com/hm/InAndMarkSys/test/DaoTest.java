package com.hm.InAndMarkSys.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hm.InAndMarkSys.dao.AdminDao;
import com.hm.InAndMarkSys.dao.imp.CkDaoImp;
import com.hm.InAndMarkSys.dao.imp.GysDaoImp;
import com.hm.InAndMarkSys.dao.imp.RuKuDaoImp;
import com.hm.InAndMarkSys.dao.imp.WlDaoImp;
import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbRuku;
import com.hm.InAndMarkSys.model.TbWl;

public class DaoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		AdminDao adminDao = (AdminDao) applicationContext
				.getBean("adminDaoImp");
		adminDao.rand();
		
//		CgDaoImp cgDaoImp=(CgDaoImp) applicationContext.getBean("cgDaoImp");
//		cgDaoImp.select();
//		cgDaoImp.save();
		
//		WlDaoImp wlDaoImp=(WlDaoImp) applicationContext.getBean("wlDaoImp");
//		List<TbWl> list=wlDaoImp.getWlByWlId(1);
//		for (TbWl tbWl : list) {
//			System.out.println(tbWl.getTbGys().getGysAddress());
//		}
//		GysDaoImp gysDaoImp=(GysDaoImp) applicationContext.getBean("gysDaoImp");
//		List<TbGys> list=gysDaoImp.get(3242);
//		for (TbGys tbGys : list) {
//			System.out.println(tbGys.getGysName());
//		}
//		
//		
//		CkDaoImp ckDaoImp=(CkDaoImp) applicationContext.getBean("ckDaoImp");
//		List<TbCk> list=ckDaoImp.queryPage(0, 1);
//		for (TbCk tbCk : list) {
//			System.out.println(tbCk.getCkname());
//		}
		
		RuKuDaoImp ruKuDaoImp=(RuKuDaoImp) applicationContext.getBean("rukuDaoImp");
		System.out.println(ruKuDaoImp.getTotalSize());
		List<TbRuku> list=ruKuDaoImp.queryPage(1, 1);
		for (TbRuku tbRuku : list) {
			System.out.println(tbRuku.getAdmin().getUsername());
		}
		
	}

}
