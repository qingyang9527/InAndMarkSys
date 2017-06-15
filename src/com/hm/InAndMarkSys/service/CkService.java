package com.hm.InAndMarkSys.service;

import java.util.List;

import com.hm.InAndMarkSys.model.TbCk;

public interface CkService {
	void save(TbCk	tbCk);
	void delete(Integer id);
	void update(TbCk	tbCk);
	List queryPage(int currentPage,int pageSize);
	List get(Integer id);
	int getTotalSize();
}
