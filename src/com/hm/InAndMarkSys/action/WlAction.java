package com.hm.InAndMarkSys.action;

import com.hm.InAndMarkSys.model.TbWl;
import com.hm.InAndMarkSys.service.WlService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class WlAction extends ActionSupport implements ModelDriven<TbWl>{
	private TbWl tbWl=new TbWl();
	private WlService wlService;
	public WlService getWlService() {
		return wlService;
	}
	public void setWlService(WlService wlService) {
		this.wlService = wlService;
	}
	@Override
	public TbWl getModel() {
		// TODO Auto-generated method stub
		return tbWl;
	}

}
