package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.Admin;

public interface AdminDao {

	/**
	 * ͨ���û���������֤����Ա��¼
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	Admin loginByAdmin(String username, String password);

	void saveAdmin(Admin admin);

	List rand();

}
