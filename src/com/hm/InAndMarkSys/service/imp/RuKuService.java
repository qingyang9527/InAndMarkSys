package com.hm.InAndMarkSys.service.imp;

import java.util.List;

import com.hm.InAndMarkSys.dao.RuKuDao;
import com.hm.InAndMarkSys.model.TbRuku;

public class RuKuService implements com.hm.InAndMarkSys.service.RuKuService {
	private RuKuDao ruKuDao;

	public void setRuKuDao(RuKuDao ruKuDao) {
		this.ruKuDao = ruKuDao;
	}

	@Override
	public void save(TbRuku ruku) {
		// TODO Auto-generated method stub
		ruKuDao.save(ruku);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		ruKuDao.delete(id);
	}

	@Override
	public void update(TbRuku ruku) {
		// TODO Auto-generated method stub
		ruKuDao.update(ruku);
	}

	@Override
	public List queryPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return ruKuDao.queryPage(currentPage, pageSize);
	}

	@Override
	public List get(Integer id) {
		// TODO Auto-generated method stub
		return ruKuDao.get(id);
	}

	@Override
	public int getTotalSize() {
		// TODO Auto-generated method stub
		return ruKuDao.getTotalSize();
	}

}
