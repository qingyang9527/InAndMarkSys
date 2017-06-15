package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.model.TbGys;

public interface CkDao {
	void save(TbCk	tbCk);
	void delete(Integer id);
	void update(TbCk	tbCk);
	List queryPage(int currentPage,int pageSize);
	List get(Integer id);
	int getTotalSize();
}
