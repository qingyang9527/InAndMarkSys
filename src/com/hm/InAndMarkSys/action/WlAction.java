package com.hm.InAndMarkSys.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbWl;
import com.hm.InAndMarkSys.service.GysService;
import com.hm.InAndMarkSys.service.WlService;
import com.hm.InAndMarkSys.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class WlAction extends ActionSupport implements ModelDriven<TbWl>{
	private TbWl tbWl=new TbWl();
	private WlService wlService;
	private Integer currentPage=1;
	private List<TbGys> gysList=new ArrayList<TbGys>();
	private GysService gysService;
	
	public void setGysService(GysService gysService) {
		this.gysService = gysService;
	}
	public List<TbGys> getGysList() {
		return gysList;
	}
	public void setGysList(List<TbGys> gysList) {
		this.gysList = gysList;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public WlService getWlService() {
		return wlService;
	}
	public void setWlService(WlService wlService) {
		this.wlService = wlService;
	}
	@Override
	public TbWl getModel() {
		return tbWl;
	}
	
	public String queryAll() throws Exception{
		int totalSize=wlService.getTotalSize();
		Pager pager=new Pager(currentPage, totalSize);
		List wlList=wlService.queryWlByPager(currentPage, pager.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("wldata", wlList);
		request.put("pager", pager);
		return "query_success";
	}
	
	public String edit() throws Exception{
		gysList =gysService.findAll();
		List list=wlService.getWlByWlId(tbWl.getWlid());
		Map sessionMap=(Map) ActionContext.getContext().get("request");
		sessionMap.put("EditList", list);
//		sessionMap.put("gysList", gysList);
		return "edit_success";
	}
	
	public String delete() throws Exception{
		this.wlService.delete(tbWl.getWlid());
		return "delete_success";
	}
	
	public String update() throws Exception{
		this.wlService.update(tbWl);
		return "update_success";
	}
	
	public String add() throws Exception{
		
		System.out.println(tbWl.getWlid());
		this.wlService.save(tbWl);
		return "add_success";
	}
	
	public String queryGys() throws Exception{
		List<TbGys> gyslist=this.wlService.queryGys();
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("gyslist", gyslist);
		return SUCCESS;
	}
	
	
	public String forward() throws Exception{
		return "forward_success";
	}

}
