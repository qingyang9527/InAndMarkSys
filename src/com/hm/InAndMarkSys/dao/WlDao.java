package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.model.TbWl;

public interface WlDao {
	void save(TbWl tbWl);
	List queryWlByPager(int currentPage,int pageSize);
	List getWlByWlId(String WlId);
	int getTotalSize();
	void delete(String WlId);
	void update(TbWl tbWl);
	List queryGys();

}
