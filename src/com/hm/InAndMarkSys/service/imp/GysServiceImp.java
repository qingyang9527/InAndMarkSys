package com.hm.InAndMarkSys.service.imp;

import java.util.List;

import com.hm.InAndMarkSys.dao.GysDao;
import com.hm.InAndMarkSys.model.TbGys;
import com.hm.InAndMarkSys.service.GysService;

public class GysServiceImp implements GysService {
	private GysDao gysDao;

	public void setGysDao(GysDao gysDao) {
		this.gysDao = gysDao;
	}

	@Override
	public void save(TbGys tbGys) {
		this.gysDao.save(tbGys);

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.gysDao.delete(id);
	}

	@Override
	public void update(TbGys tbGys) {
		// TODO Auto-generated method stub
		this.gysDao.update(tbGys);
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.gysDao.queryPage(currentPage, pageSize);
	}

	@Override
	public List get(Integer id) {
		// TODO Auto-generated method stub
		return this.gysDao.get(id);
	}

	@Override
	public int getTotalSize() {
		// TODO Auto-generated method stub
		return this.gysDao.getTotalSize();
	}

}
