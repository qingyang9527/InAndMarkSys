package com.hm.InAndMarkSys.dao;

import java.util.List;

public interface IBaseDao<T> {
	 	public void add(T t);
	    public void delete(Integer id);
	    public void update(T t);
	    public T load(Integer id);
	    public T get(Integer id);
	    public List<T> list(String hql, Object[] params);
}
