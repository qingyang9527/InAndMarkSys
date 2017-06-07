package com.hm.InAndMarkSys.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.hm.InAndMarkSys.dao.AdminDao;

@SuppressWarnings("deprecation")
public class AdminDaoImpTest extends
		AbstractDependencyInjectionSpringContextTests {

	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	protected String[] getConfigLocations() {
		// 指定Spring配置文件加载这个fixture
		return new String[] { "classpath:com/hm/InAndMarkSys/test/applicationContext.xml" };
	}

	public void getList() {
		List listes = adminDao.rand();
		System.out.println(listes);
	}
}
