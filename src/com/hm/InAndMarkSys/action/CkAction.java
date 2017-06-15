package com.hm.InAndMarkSys.action;

import java.util.List;
import java.util.Map;

import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.service.CkService;
import com.hm.InAndMarkSys.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CkAction extends ActionSupport implements ModelDriven<TbCk>{
	private CkService ckService;
	private TbCk tbCk=new TbCk();
	private Integer currentPage=1;
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public void setCkService(CkService ckService) {
		this.ckService = ckService;
	}
	@Override
	public TbCk getModel() {
		// TODO Auto-generated method stub
		return tbCk;
	}
	
	public String queryPage() throws Exception{
		int totalSize=ckService.getTotalSize();
		Pager pager=new Pager(currentPage, totalSize);
		List ckList=ckService.queryPage(currentPage, pager.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("ckList", ckList);
		request.put("pager", pager);
		return "query_success";
	}
	
	public String edit() throws Exception{
		List list=ckService.get(tbCk.getCkid());
		Map sessionMap=(Map) ActionContext.getContext().get("request");
		sessionMap.put("EditList", list);
		return "edit_success";
	}
	
	public String delete() throws Exception{
		this.ckService.delete(tbCk.getCkid());
		return "delete_success";
	}
	
	public String update() throws Exception{
		this.ckService.update(tbCk);
		return "update_success";
	}
	
	public String add() throws Exception{
		this.ckService.save(tbCk);
		return "add_success";
	}
	
	
	public String forward() throws Exception{
		return "forward_success";
	}

}
