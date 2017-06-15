package com.hm.InAndMarkSys.dao;

import java.util.List;

import com.hm.InAndMarkSys.model.TbRuku;


public interface RuKuDao {
	void save(TbRuku ruku);
	void delete(Integer id);
	void update(TbRuku ruku);
	List queryPage(int currentPage,int pageSize);
	List get(Integer id);
	int getTotalSize();
}
