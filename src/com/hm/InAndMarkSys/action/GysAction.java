package com.hm.InAndMarkSys.action;

import java.util.List;
import java.util.Map;

import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.service.GysService;
import com.hm.InAndMarkSys.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class GysAction extends ActionSupport implements ModelDriven<TbGys>{
	private TbGys tbGys=new TbGys();
	private GysService gysService;
	private Integer currentPage=1;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public GysService getGysService() {
		return gysService;
	}

	public void setGysService(GysService gysService) {
		this.gysService = gysService;
	}

	@Override
	public TbGys getModel() {
		// TODO Auto-generated method stub
		return tbGys;
	}
	
	public String queryPage() throws Exception{
		int totalSize=gysService.getTotalSize();
		Pager pager=new Pager(currentPage, totalSize);
		List gysList=gysService.queryPage(currentPage, pager.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("gysList", gysList);
		request.put("pager", pager);
		return "query_success";
	}
	
	public String edit() throws Exception{
		List list=gysService.get(tbGys.getId());
		Map sessionMap=(Map) ActionContext.getContext().get("request");
		sessionMap.put("EditList", list);
		return "edit_success";
	}
	
	public String delete() throws Exception{
		this.gysService.delete(tbGys.getId());
		return "delete_success";
	}
	
	public String update() throws Exception{
		this.gysService.update(tbGys);
		return "update_success";
	}
	
	public String add() throws Exception{
		this.gysService.save(tbGys);
		return "add_success";
	}
	
	
	public String forward() throws Exception{
		return "forward_success";
	}

}
