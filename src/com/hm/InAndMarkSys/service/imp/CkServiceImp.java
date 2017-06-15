package com.hm.InAndMarkSys.service.imp;

import java.util.List;

import com.hm.InAndMarkSys.dao.CkDao;
import com.hm.InAndMarkSys.model.TbCk;
import com.hm.InAndMarkSys.service.CkService;

public class CkServiceImp implements CkService {
	private CkDao ckDao;

	public CkDao getCkDao() {
		return ckDao;
	}

	public void setCkDao(CkDao ckDao) {
		this.ckDao = ckDao;
	}

	@Override
	public void save(TbCk tbCk) {
		// TODO Auto-generated method stub
		this.ckDao.save(tbCk);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.ckDao.delete(id);
	}

	@Override
	public void update(TbCk tbCk) {
		// TODO Auto-generated method stub
		this.ckDao.update(tbCk);
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.ckDao.queryPage(currentPage, pageSize);
	}

	@Override
	public List get(Integer id) {
		// TODO Auto-generated method stub
		return this.ckDao.get(id);
	}

	@Override
	public int getTotalSize() {
		// TODO Auto-generated method stub
		return this.ckDao.getTotalSize();
	}

}
