package com.hm.InAndMarkSys.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hm.InAndMarkSys.dao.AdminDao;
import com.hm.InAndMarkSys.dao.imp.CgDaoImp;
import com.hm.InAndMarkSys.dao.imp.WlDaoImp;

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
		
		WlDaoImp wlDaoImp=(WlDaoImp) applicationContext.getBean("wlDaoImp");
		wlDaoImp.getWlByWlId(1);
		System.out.println(wlDaoImp.getTotalSize());
	}

}
