package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.TbWl;

public interface WlDao {
	void save(TbWl tbWl);
	List queryWlByPager(int currentPage,int pageSize);
	List getWlByWlId(Integer WlId);
	int getTotalSize();
	void delete(Integer WlId);
	void update(TbWl tbWl);

}
