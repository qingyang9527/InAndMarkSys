package com.hm.InAndMarkSys.service.imp;

import java.util.List;

import com.hm.InAndMarkSys.dao.WlDao;
import com.hm.InAndMarkSys.dao.imp.WlDaoImp;
import com.hm.InAndMarkSys.model.TbWl;
import com.hm.InAndMarkSys.service.WlService;

public class WlServiceImp implements WlService {
	private WlDao wlDao;
	public void setWlDao(WlDao wlDao) {
		this.wlDao = wlDao;
	}

	@Override
	public void save(TbWl tbWl) {
		this.wlDao.save(tbWl);
	}

	@Override
	public List queryWlByPager(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.wlDao.queryWlByPager(currentPage, pageSize);
	}

	@Override
	public List getWlByWlId(String WlId) {
		return this.wlDao.getWlByWlId(WlId);
	}

	@Override
	public void delete(String WlId) {
		// TODO Auto-generated method stub
		this.wlDao.delete(WlId);
	}

	@Override
	public void update(TbWl tbWl) {
		// TODO Auto-generated method stub
		this.wlDao.update(tbWl);
	}

	@Override
	public int getTotalSize() {
		// TODO Auto-generated method stub
		return this.wlDao.getTotalSize();
	}

	@Override
	public List queryGys() {
		return this.wlDao.queryGys();
	}

}
