package com.hm.InAndMarkSys.service;

import com.hm.InAndMarkSys.model.Admin;

public interface AdminService {
	/**
	 * ͨ���û���������֤����Ա��¼
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	Admin loginByAdmin(String username, String password);

	void saveAdmin(Admin admin);
}
