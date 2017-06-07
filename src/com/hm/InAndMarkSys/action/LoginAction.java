package com.hm.InAndMarkSys.action;

import java.util.Map;

import com.hm.InAndMarkSys.dao.imp.AdminDaoImp;
import com.hm.InAndMarkSys.model.Admin;
import com.hm.InAndMarkSys.service.AdminService;
import com.hm.InAndMarkSys.service.imp.AdminServiceImp;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<Admin> {

	private static final long serialVersionUID = 1L;
	private AdminService adminService;

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

	private Admin admin = new Admin();//模型接值，实现modelDriven接口

	/**
	 * 系统管理员登录
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		Admin adminList = adminService.loginByAdmin(admin.getUsername(),
				admin.getPassword());
		Map session = ActionContext.getContext().getSession();
		if (adminList != null) {
			session.put("admin", adminList);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}

	/**
	 * 退出系统
	 * @return
	 * @throws Exception
	 */
	public String loginOut() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove(admin);
		return SUCCESS;
	}

	/**
	 * 主页的左frame
	 * @return
	 * @throws Exception
	 */
	public String left() throws Exception {
		return "left";
	}

	public String top() throws Exception {
		return "top";
	}

	public String right() throws Exception {
		return "right";
	}

	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

}