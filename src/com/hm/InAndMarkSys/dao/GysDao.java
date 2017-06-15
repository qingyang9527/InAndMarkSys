package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.TbGys;

public interface GysDao{
	void save(TbGys	tbGys);
	void delete(Integer id);
	void update(TbGys tbGys);
	List queryPage(int currentPage,int pageSize);
	List get(Integer id);
	int getTotalSize();
	

}
