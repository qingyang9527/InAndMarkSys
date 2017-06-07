package com.hm.InAndMarkSys.service;

import com.hm.InAndMarkSys.model.Admin;

public interface AdminService {
	/**
	 * 通过用户名密码验证管理员登录
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	Admin loginByAdmin(String username, String password);

	void saveAdmin(Admin admin);
}
