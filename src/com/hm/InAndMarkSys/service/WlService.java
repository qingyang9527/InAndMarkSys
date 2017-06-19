package com.hm.InAndMarkSys.service;

import java.util.List;

import com.hm.InAndMarkSys.model.TbWl;

public interface WlService {
	void save(TbWl tbWl);
	List queryWlByPager(int currentPage,int pageSize);
	List getWlByWlId(String WlId);
	int getTotalSize();
	void delete(String WlId);
	void update(TbWl tbWl);
	List queryGys();
}
