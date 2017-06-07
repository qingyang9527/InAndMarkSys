package com.hm.InAndMarkSys.service.imp;

import com.hm.InAndMarkSys.dao.AdminDao;
import com.hm.InAndMarkSys.dao.imp.AdminDaoImp;
import com.hm.InAndMarkSys.model.Admin;
import com.hm.InAndMarkSys.service.AdminService;

public class AdminServiceImp implements AdminService {
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public Admin loginByAdmin(String username, String password) {
		return adminDao.loginByAdmin(username, password);
	}

	public void saveAdmin(Admin admin) {
		this.adminDao.saveAdmin(admin);

	}

}
