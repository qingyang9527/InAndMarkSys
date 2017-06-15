package com.hm.InAndMarkSys.action;

import java.util.List;
import java.util.Map;

import com.hm.InAndMarkSys.model.TbRuku;
import com.hm.InAndMarkSys.service.RuKuService;
import com.hm.InAndMarkSys.util.Pager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RuKuAction extends ActionSupport implements ModelDriven<TbRuku>{
	private TbRuku tbRuku=new TbRuku();
	private RuKuService ruKuService;
	private Integer currentPage=1;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setRuKuService(RuKuService ruKuService) {
		this.ruKuService = ruKuService;
	}

	@Override
	public TbRuku getModel() {
		// TODO Auto-generated method stub
		return tbRuku;
	}
	public String queryPage() throws Exception{
		int totalSize=ruKuService.getTotalSize();
		Pager pager=new Pager(currentPage, totalSize);
		List ruKuList=ruKuService.queryPage(currentPage, pager.getPageSize());
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("ruKuList", ruKuList);
		request.put("pager", pager);
		return "query_success";
	}
	
	public String edit() throws Exception{
		List list=ruKuService.get(tbRuku.getId());
		Map sessionMap=(Map) ActionContext.getContext().get("request");
		sessionMap.put("EditList", list);
		return "edit_success";
	}
	
	public String delete() throws Exception{
		this.ruKuService.delete(tbRuku.getId());
		return "delete_success";
	}
	
	public String update() throws Exception{
		this.ruKuService.update(tbRuku);
		return "update_success";
	}
	
	public String add() throws Exception{
		this.ruKuService.save(tbRuku);
		return "add_success";
	}
	
	
	public String forward() throws Exception{
		return "forward_success";
	}

}
